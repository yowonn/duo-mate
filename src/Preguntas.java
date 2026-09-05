import java.util.Scanner;
public class Preguntas {
    Scanner lectura = new Scanner(System.in);
    VerPreguntas vistaPreguntas = new VerPreguntas();
       
    public void Preguntas_Factorizacion(){
        int puntos = 0;

        int respuesta1 = vistaPreguntas.InicioyPregunta1Factorizacion();
        switch (respuesta1) {
            case 1:
                vistaPreguntas.RespuestaIncorrecta1();
                break;
            case 2:
                vistaPreguntas.RespuestaIncorrecta1();
                break;
            case 3:
                vistaPreguntas.RespuestaCorrecta();
                puntos += 1;
                break;
            case 4:
                vistaPreguntas.RespuestaIncorrecta1();
                break;
            default:
                vistaPreguntas.DatoIngresadoIncorrecto();
                respuesta1 = lectura.nextInt();
                lectura.nextLine();
                break;
        }

        
        int respuesta2 = vistaPreguntas.Pregunta2Factorizacion();
        switch (respuesta2) {
            case 1:
                vistaPreguntas.RespuestaIncorrecta2();
                break;
            case 2:
                vistaPreguntas.RespuestaIncorrecta2();
                break;
            case 3:
                vistaPreguntas.RespuestaIncorrecta2();
                break;
            case 4:
                vistaPreguntas.RespuestaCorrecta();
                puntos += 1;
                break;
            default:
                vistaPreguntas.DatoIngresadoIncorrecto();
                respuesta2= lectura.nextInt();
                lectura.nextLine();
                break;
        }        

        
        int respuesta3 = vistaPreguntas.Pregunta3Factorizacion();
        switch (respuesta3) {
            case 1:
                vistaPreguntas.RespuestaCorrecta();
                puntos += 1;
                break;
            case 2:
                vistaPreguntas.RespuestaIncorrecta3();
                break;
            case 3:
                vistaPreguntas.RespuestaIncorrecta3();
                break;
            case 4:
                vistaPreguntas.RespuestaIncorrecta3();
                break;
            default:
                vistaPreguntas.DatoIngresadoIncorrecto();
                respuesta3 = lectura.nextInt();
                lectura.nextLine();
                break;
        }

        
        int respuesta4 = vistaPreguntas.Pregunta4Factorizacion();
        switch (respuesta4) {
            case 1:
                vistaPreguntas.RespuestaIncorrecta4();
                break;
            case 2:
                vistaPreguntas.RespuestaCorrecta();
                puntos += 1;
                break;
            case 3:
                vistaPreguntas.RespuestaIncorrecta4();
                break;
            case 4:
                vistaPreguntas.RespuestaIncorrecta4();
                break;
            default:
                vistaPreguntas.DatoIngresadoIncorrecto();
                respuesta4 = lectura.nextInt();
                lectura.nextLine();
                break;
        }

        switch (puntos) {
            case 0:
                vistaPreguntas.CeroPuntos(puntos);
                break;
            case 1:
                vistaPreguntas.UnPuntos(puntos);
                break;
            case 2:
                vistaPreguntas.DosPuntos(puntos);
                break;
            case 3:
                vistaPreguntas.TresPuntos(puntos);
                break;
            case 4:
                vistaPreguntas.CuatroPuntos(puntos);
                break;
            default:
                System.out.println("");
                break;
        }
    }

    
}
