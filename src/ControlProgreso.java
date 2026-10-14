public class ControlProgreso {
    private VerProgreso VerProgreso1;
    private Progreso Progreso1;

    ControlProgreso(Estudiante EstudianteActivo){
        this.VerProgreso1 = new VerProgreso();
        this.Progreso1 = new Progreso(EstudianteActivo);
    }

    public void presentarEstadisticas(){
        VerProgreso1.tituloProgreso();
        VerProgreso1.mostrarNombre(Progreso1.getNombreEstudiante());
        VerProgreso1.mostrarPuntaje(Progreso1.getPuntajeEstudiante());
        VerProgreso1.mostrarIntentosRealizados(Progreso1.getIntentosEstudiante());
        VerProgreso1.mostrarPorcentajeAcierto(Progreso1.PorcentajeAciertosEstudiante());
    }



}
