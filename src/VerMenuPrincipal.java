import java.util.Scanner;

public class VerMenuPrincipal {
    Scanner lector = new Scanner(System.in);

    public void mostrarTemas(){
        System.out.println("\n****MENU****");
        System.out.println("\n0. Cerrar sesion");
        System.out.println("\n1. Progreso Actual");
        System.out.println("\n****TEMAS DISPONIBLES****");
        System.out.println("2. Factorizacion");
    }

    public int seleccionarTema(){
        System.out.println("Seleccione el numero del tema:");
        int TemaSeleccionado = lector.nextInt();
        lector.nextLine();
        return TemaSeleccionado;
    }

    public void errorTema(){
        System.out.println("El tema seleccionado no es valido");
    }
}

