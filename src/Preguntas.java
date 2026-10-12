public class Preguntas {
    private SwingVerPregunta SwingVerPregunta1;
    private ModeloPreguntas ModeloPreguntas1;
    private Estudiante EstudianteActivo;
    private int ContadorPreguntas;
    private int ContadorCorrectas;

    public Preguntas(Estudiante EstudianteActivo){
        ModeloPreguntas1 = new ModeloPreguntas();
        ContadorPreguntas = 0;
        ContadorCorrectas = 0;
        this.EstudianteActivo = EstudianteActivo;
    }

    public void ejecutarSerie(){
        if(ContadorPreguntas == 0){
            ejecutarPregunta(ModeloPreguntas1.Modulo1_RACIONALIZACION());
        }
        else if(ContadorPreguntas == 1){
            ejecutarPregunta(ModeloPreguntas1.Modulo1_Factorizacion());
        }
        else if(ContadorPreguntas == 2){
            ejecutarPregunta(ModeloPreguntas1.Modulo1_ECUACION_RECTA());
        }
        else if(ContadorPreguntas == 3){
            ejecutarPregunta(ModeloPreguntas1.Modulo1_TRANSFORMACIONES_f());
        }
        else{
            EstudianteActivo.sumaIntentos(ContadorPreguntas);
            EstudianteActivo.sumaPuntaje(ContadorCorrectas);
            ControlMenu ControlMenu1 = new ControlMenu(EstudianteActivo);
            ControlMenu1.iniciarMenuPrincipal();
        }
    }

    public void ejecutarPregunta(String[] ArregloPregunta){
        SwingVerPregunta1 = new SwingVerPregunta(ArregloPregunta);
        SwingVerPregunta1.presionarCerrarPrograma(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent e) {
                    cerrarPrograma();
                }
        });
        SwingVerPregunta1.seleccion1(e-> evaluarRespuesta(ArregloPregunta[5], 1, SwingVerPregunta1));
        SwingVerPregunta1.seleccion2(e-> evaluarRespuesta(ArregloPregunta[5], 2, SwingVerPregunta1));
        SwingVerPregunta1.seleccion3(e-> evaluarRespuesta(ArregloPregunta[5], 3, SwingVerPregunta1));
        SwingVerPregunta1.seleccion4(e-> evaluarRespuesta(ArregloPregunta[5], 4, SwingVerPregunta1));
        SwingVerPregunta1.setVisible(true);
    }

    public void cerrarPrograma(){
        if (SwingVerPregunta1.confirmarCerrarPrograma()) {
            System.exit(0);
        }
    }
    public void evaluarRespuesta(String RespuestaCorrecta, int RespuestaIngresada, SwingVerPregunta SwingVerPregunta1){
        if(RespuestaIngresada == (Integer.parseInt(RespuestaCorrecta))){
            ContadorCorrectas++;
            SwingVerPregunta1.mostrarMensajeRespuestaCorrecta();
        }
        else{
            SwingVerPregunta1.mostrarMensajeRespuestaIncorrecta(RespuestaCorrecta);
        }
        ContadorPreguntas++;
        SwingVerPregunta1.cerrarVentanaPreguntas();
        ejecutarSerie();
    }
    
}
