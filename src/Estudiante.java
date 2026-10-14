public class Estudiante {
    private String NombreEstudiante;
    private String ContrasenaEstudiante;
    private double PuntajeEstudiante;
    private double IntentosEstudiante;

    public Estudiante(String NombreEstudiante, String ContrasenaEstudiante){
        this.NombreEstudiante = NombreEstudiante;
        this.ContrasenaEstudiante = ContrasenaEstudiante;
        this.PuntajeEstudiante = 0;
        this.IntentosEstudiante = 0;
    }


    public String getNombreEstudiante(){
        return NombreEstudiante;
    }
    public String getContrasenaEstudiante(){
        return ContrasenaEstudiante;
    }
    public double getPuntajeEstudiante(){
        return PuntajeEstudiante;
    }
    public double getIntentosEstudiante(){
        return IntentosEstudiante;
    }

    public void sumaPuntaje(int PuntosGanados){
        PuntajeEstudiante += PuntosGanados;
    }
    public void sumaIntentos(int IntentosRealizados){
        IntentosEstudiante += IntentosRealizados;
    }
    public boolean comprobarContrasena(String ContrasenaIngresada){
        boolean VerificadorContrasena = false;
        if(ContrasenaIngresada == ContrasenaEstudiante){
            VerificadorContrasena = true;
        }
        return VerificadorContrasena;
    }
}