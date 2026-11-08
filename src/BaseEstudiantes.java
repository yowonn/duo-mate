import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;


//Esta clase es la unica que habla con la coleccion "estudiantes" de MongoDB.
//Los controladores la usan, pero no saben como funciona MongoDB por dentro.

public class BaseEstudiantes {

    private static final String NombreColeccion = "estudiantes";

    //Devuelve la coleccion donde se guardan los estudiantes
    private static MongoCollection<Document> obtenerColeccion(){
        return ConexionBD.obtenerBase().getCollection(NombreColeccion);
    }

    //Busca un documento cuyo campo "nombre" sea igual al nombre recibido.
    //Si no encuentra ninguno, first() devuelve null.
    public static boolean existeEstudiante(String NombreEstudiante){
        Document Encontrado = obtenerColeccion().find(Filters.eq("nombre", NombreEstudiante)).first();
        return Encontrado != null;
    }

    //Convierte el objeto Estudiante en un documento y lo inserta en la coleccion
    public static void guardarEstudiante(Estudiante EstudianteNuevo){
        Document DocumentoEstudiante = new Document("nombre", EstudianteNuevo.getNombreEstudiante())
            .append("contrasena", EstudianteNuevo.getContrasenaEstudiante())
            .append("puntaje", EstudianteNuevo.getPuntajeEstudiante())
            .append("intentos", EstudianteNuevo.getIntentosEstudiante());
        obtenerColeccion().insertOne(DocumentoEstudiante);
    }

    
    public static Estudiante iniciarSesion(String nombre, String contrasena) {

        Document encontrado = obtenerColeccion()
            .find(Filters.eq("nombre", nombre))
            .first();

        if(encontrado == null) {
            return null;
        }

        String contrasenaGuardada = encontrado.getString("contrasena");

        if(contrasenaGuardada == null ||
        !contrasenaGuardada.equals(contrasena)) {
            return null;
        }

        Estudiante estudiante = new Estudiante(nombre, contrasena);

        Number puntos = encontrado.get("puntaje", Number.class);
        Number intentos = encontrado.get("intentos", Number.class);

        if(puntos != null) {
            estudiante.cargarPuntaje(puntos.doubleValue());
        }

        if(intentos != null) {
            estudiante.cargarIntentos(intentos.doubleValue());
        }

        return estudiante;
    }

    //Busca al estudiante por su nombre y reemplaza su puntaje e intentos con los valores actuales del objeto
    public static void actualizarProgreso(Estudiante EstudianteActivo){
        obtenerColeccion().updateOne(
            Filters.eq("nombre", EstudianteActivo.getNombreEstudiante()),
            Updates.combine(
                Updates.set("puntaje", EstudianteActivo.getPuntajeEstudiante()),
                Updates.set("intentos", EstudianteActivo.getIntentosEstudiante())
            )
        );
    }

}
