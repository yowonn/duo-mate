import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConexionBD {
    // Archivo con el connection string. Va en la carpeta duo-mate y NO se sube a GitHub
    private static final String ArchivoConfiguracion = "mongo.properties";
    private static final String NombreBase = "duomate";
    private static MongoClient Cliente;

    // Devuelve la base de datos. La conexion se crea una sola vez y se reutiliza
    public static MongoDatabase obtenerBase(){
        if(Cliente == null){
            Cliente = MongoClients.create(leerConnectionString());
        }
        return Cliente.getDatabase(NombreBase);
    }

    private static String leerConnectionString(){
        Properties Configuracion = new Properties();
        try(FileInputStream Archivo = new FileInputStream(ArchivoConfiguracion)){
            Configuracion.load(Archivo);
        }
        catch(IOException e){
            throw new RuntimeException("No se encontro el archivo " + ArchivoConfiguracion
                + ". Debe estar en la carpeta duo-mate, junto a src y bin.", e);
        }
        String ConnectionString = Configuracion.getProperty("uri");
        if(ConnectionString == null || ConnectionString.isBlank()){
            throw new RuntimeException("El archivo " + ArchivoConfiguracion + " no tiene la linea uri=...");
        }
        return ConnectionString.trim();
    }
}
