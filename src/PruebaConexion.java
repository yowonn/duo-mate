import org.bson.Document;

// Clase solo para probar la conexion. Se puede borrar cuando todo funcione
public class PruebaConexion {
    public static void main(String[] args){
        Document Respuesta = ConexionBD.obtenerBase().runCommand(new Document("ping", 1));
        System.out.println("Conexion exitosa: " + Respuesta.toJson());

        long CantidadEstudiantes = ConexionBD.obtenerBase().getCollection("estudiantes").countDocuments();
        System.out.println("Estudiantes guardados: " + CantidadEstudiantes);
    }
}
