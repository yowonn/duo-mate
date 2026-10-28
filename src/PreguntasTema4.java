public class PreguntasTema4 extends Preguntas{
    public PreguntasTema4(Estudiante EstudianteActivo){
        super(EstudianteActivo);
    }

    @Override 
    public void ejecutarSerie(){
        if(ContadorPreguntas == 0){
            ejecutarPregunta(ModeloPreguntas1.Modulo3_Dom_Range_f_log());
        }
        else if(ContadorPreguntas == 1){
            ejecutarPregunta(ModeloPreguntas1.Modulo3_Exponencial());
        }
        else if(ContadorPreguntas == 2){
            ejecutarPregunta(ModeloPreguntas1.Modulo3_Logaritmos());
        }
        else if(ContadorPreguntas == 3){
            ejecutarPregunta(ModeloPreguntas1.Modulo3_Probabilidad());
        }
        else{
            EstudianteActivo.sumaIntentos(ContadorPreguntas);
            EstudianteActivo.sumaPuntaje(ContadorCorrectas);
            ControlMenu ControlMenu1 = new ControlMenu(EstudianteActivo);
            ControlMenu1.iniciarMenuPrincipal();
        }
    }
}
