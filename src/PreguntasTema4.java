public class PreguntasTema4 extends Preguntas{
    public PreguntasTema4(Estudiante EstudianteActivo){
        super(EstudianteActivo);
    }

    @Override 
    public void ejecutarSerie(){
        if(ContadorPreguntas == 0){
            ejecutarPregunta(ModeloPreguntas1.Modulo4_Trigonometrica_circulo());
        }
        else if(ContadorPreguntas == 1){
            ejecutarPregunta(ModeloPreguntas1.Modulo4_Trigonometrica_sin());
        }
        else if(ContadorPreguntas == 2){
            ejecutarPregunta(ModeloPreguntas1.Modulo4_Trigonometrica_cos());
        }
        else if(ContadorPreguntas == 3){
            ejecutarPregunta(ModeloPreguntas1.Modulo4_Trigonometrica_tan());
        }
                else{
            terminarSerie();
        }
    }
}