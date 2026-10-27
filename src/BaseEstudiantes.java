import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
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
}
