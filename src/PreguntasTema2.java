public class PreguntasTema2 extends Preguntas{
    public PreguntasTema2(Estudiante EstudianteActivo){
        super(EstudianteActivo);
    }

    @Override 
    public void ejecutarSerie(){
        if(ContadorPreguntas == 0){
            ejecutarPregunta(ModeloPreguntas1.Modulo2_DOMINIOS_f());
        }
        else if(ContadorPreguntas == 1){
            ejecutarPregunta(ModeloPreguntas1.Modulo2_RAICEZ_NUM_i_f());
        }
        else if(ContadorPreguntas == 2){
            ejecutarPregunta(ModeloPreguntas1.Modulo2_RANGO_f());
        }
        else if(ContadorPreguntas == 3){
            ejecutarPregunta(ModeloPreguntas1.Modulo2_Asintota_f());
        }
        else{
            EstudianteActivo.sumaIntentos(ContadorPreguntas);
            EstudianteActivo.sumaPuntaje(ContadorCorrectas);
            ControlMenu ControlMenu1 = new ControlMenu(EstudianteActivo);
            ControlMenu1.iniciarMenuPrincipal();
        }
    }
}
