public class Progreso {
    Estudiante EstudianteActivo;

    Progreso(Estudiante EstudianteActivo){
        this.EstudianteActivo = EstudianteActivo;
    }

    public String getNombreEstudiante(){
        return EstudianteActivo.getNombreEstudiante();
    }
    public double getPuntajeEstudiante(){
        return EstudianteActivo.getPuntajeEstudiante();
    }
    public double getIntentosEstudiante(){
        return EstudianteActivo.getIntentosEstudiante();
    }
    public double PorcentajeAciertosEstudiante(){
        double PorcentajeAciertos = 0;
        if(EstudianteActivo.getIntentosEstudiante() > 0){
            PorcentajeAciertos = (EstudianteActivo.getPuntajeEstudiante() / EstudianteActivo.getIntentosEstudiante())*100;
        }
        String PorcentajeAciertosString = String.format("%.2f", PorcentajeAciertos);
        PorcentajeAciertos = Double.parseDouble(PorcentajeAciertosString);
        return PorcentajeAciertos;
    }
}
