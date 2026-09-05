public class VerProgreso {
    VerProgreso(){};

    public void tituloProgreso(){
        System.out.println("***** PROGRESO ACTUAL *****");
    }
    public void mostrarNombre(String NombreEstudiante){
        System.out.println("Progreso de: "+NombreEstudiante);
    }
    public void mostrarPuntaje(double PuntosActuales){
        System.out.println("Puntaje actual: "+PuntosActuales);
    }
    public void mostrarIntentosRealizados(double IntentosTotal){
        System.out.println("Intentos totales: "+IntentosTotal);
    }
    public void mostrarPorcentajeAcierto(double PorcentajeAcierto){
        System.out.println("Porcentaje de acierto: "+PorcentajeAcierto+"%");
    }
}
