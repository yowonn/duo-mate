import java.util.Scanner;

public class VerInicioSesion {
    Scanner lector = new Scanner(System.in);
    public VerInicioSesion(){}

    public String mostrarRegistroNombre(){
        System.out.println("Bienvenido, para registrar a un nuevo usuario, intrduzca su nombre de usuario:");
        String NombreRecibido = lector.nextLine();
        return NombreRecibido;
    }
    public String mostrarRegistroContrasena(){
        System.out.println("Por favor, cree una contrasena");
        String ContrasenaRecibido = lector.nextLine();
        return ContrasenaRecibido;
    }
    public void errorRegistroNombre(){
        System.out.println("Debe de ingresar un nombre");
    }
    public void errorRegistroContrasena(){
        System.out.println("Debe de ingresar una contrasena");
    }
    public void registroExitoso(){
        System.out.println("Registro exitoso");
    }

}
