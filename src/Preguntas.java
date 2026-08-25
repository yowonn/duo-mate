import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class Preguntas {
    Scanner lectura = new Scanner(System.in);

    public void Preguntas_Factorizacion(){
        int puntos = 0;
        System.out.println("\n****MODULO DE PREGUNTAS: FACTORIZACIÓN****");

        System.out.println("\nPregunta 1:");
        System.out.println("\nsegún la siguiente expresión:");
        System.out.println("\n(a + b - 1)(a^2 + 1) - a^2 - 1");
        System.out.println("\n¿Cual de las siguientes respuestas aplica correctamente la factorización? (solo escribir el número que se quiere no la respuesta)");
        System.out.println("\n1. (a^2 + 1) + (a + b - 1)");
        System.out.println("\n2. (a^2 + 1)(a + b - 1)");
        System.out.println("\n3. (a^2 + 1)(a + b - 2)");
        System.out.println("\n4. (a^2 + 1) - (a + b + 2)");
        int respuesta1 = lectura.nextInt();
        lectura.nextLine();
        switch (respuesta1) {
            case 1:
                    System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 3");
                break;
            case 2:
                System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 3");
                break;
            case 3:
                System.out.println("¡La respuesta es correcta!, felicidades.");
                puntos += 1;
                break;
            case 4:
                System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 3");
                break;
            default:
                System.out.println("\nEl dato ingresado no corresponde a una respuesta");
                respuesta1 = lectura.nextInt();
                lectura.nextLine();
                break;
        }

        System.out.println("\nPregunta 2:");
        System.out.println("\nsegún la siguiente expresión:");
        System.out.println("\n14x^2y^2 - 28x^3 + 56x^4");
        System.out.println("\n¿Cual de las siguientes respuestas factoriza correctamente? (solo escribir el número que se quiere no la respuesta)");
        System.out.println("\n1. (14)(x^2y^2 - 28x^3 + 4x^4)");
        System.out.println("\n2. (14)(x^2y^2 + 2x^3 + 5x^4)");
        System.out.println("\n3. (14x^2)(y^2 + 2x - 4x^2)");
        System.out.println("\n4. (14x^2)(y^2 - 2x - 4x^2)");
        int respuesta2 = lectura.nextInt();
        lectura.nextLine();
        switch (respuesta2) {
            case 1:
                    System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 4");
                break;
            case 2:
                System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 4");
                break;
            case 3:
                System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 4");
                break;
            case 4:
                System.out.println("¡La respuesta es correcta!, felicidades.");
                puntos += 1;
                break;
            default:
                System.out.println("\nEl dato ingresado no corresponde a una respuesta");
                respuesta2= lectura.nextInt();
                lectura.nextLine();
                break;
        }        

        System.out.println("\nPregunta 3:");
        System.out.println("\nsegún la siguiente expresión:");
        System.out.println("\nx^3 - x^2 -4");
        System.out.println("\n¿Cual de las respuestas siguientes factoriza correctamente? (solo escribir el número que se quiere no la respuesta)");
        System.out.println("\n1. (x-2)(x^2 + x + 2)");
        System.out.println("\n2. (x+2)(x^2 + x + 2)");
        System.out.println("\n3. (x)(x^2 - x - 4)");
        System.out.println("\n4. (x)(-x^2 + x + 4)");
        int respuesta3 = lectura.nextInt();
        lectura.nextLine();
        switch (respuesta3) {
            case 1:
                System.out.println("¡La respuesta es correcta!, felicidades.");
                puntos += 1;
                break;
            case 2:
                System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 1");
                break;
            case 3:
                System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 1");
                break;
            case 4:
                System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 1");
                break;
            default:
                System.out.println("\nEl dato ingresado no corresponde a una respuesta");
                respuesta3 = lectura.nextInt();
                lectura.nextLine();
                break;
        }

        System.out.println("\nPregunta 4:");
        System.out.println("\nsegún la siguiente expresión:");
        System.out.println("\n6x^3 + 7x^2 -9x -2");
        System.out.println("\n¿Cual de las respuestas siguientes factoriza correctamente? (solo escribir el número que se quiere no la respuesta)");
        System.out.println("\n1. (2x - 1)(x - 2)(3x - 3)");
        System.out.println("\n2. (x + 2)(2x - 1)(3x - 1) ");
        System.out.println("\n3. (2x - 2)(4x - 1)(3x - 2)");
        System.out.println("\n4. (x + 1)(2x - 1)(3x - 1)");
        int respuesta4 = lectura.nextInt();
        lectura.nextLine();
        switch (respuesta4) {
            case 1:
                System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 2");
                break;
            case 2:
                System.out.println("¡La respuesta es correcta!, felicidades.");
                puntos += 1;
                break;
            case 3:
                System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 2");
                break;
            case 4:
                System.out.println("\nLa respuesta es incorrecta. La respuesta correcta era la 2");
                break;
            default:
                System.out.println("\nEl dato ingresado no corresponde a una respuesta");
                respuesta4 = lectura.nextInt();
                lectura.nextLine();
                break;
        }

        switch (puntos) {
            case 0:
                System.out.println("\nSu puntuación fue de "+puntos+"/4");
                System.out.println("\nNecesita repasar el tema, es recomendable utilizar el material auxiliar.");
                break;
            case 1:
                System.out.println("\nSu puntuación fue de "+puntos+"/4");
                System.out.println("\nNecesita repasar el tema, es recomendable utilizar el material auxiliar.");
                break;
            case 2:
                System.out.println("\nSu puntuación fue de "+puntos+"/4");
                System.out.println("\nTiene un cierto dominio sobre el tema, pero falta mejorar, es recomendable que le de un vistazo al material auxiliar.");
                break;
            case 3:
                System.out.println("\nSu puntuación fue de "+puntos+"/4");
                System.out.println("\nBuen trabajo, existe un dominio del tema");
                break;
            case 4:
                System.out.println("\nSu puntuación fue de "+puntos+"/4");
                System.out.println("\n¡Excelente trabajo!, completaste exitosamente todos los ejercicios.");
                break;
            default:
                System.out.println("");
                break;
        }
    }

    
}
