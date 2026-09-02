public class Estudiante {
    private String NombreEstudiante;
    private String ContrasenaEstudiante;
    private int PuntajeEstudiante;
    private int IntentosEstudiante;

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
    public int getPuntajeEstudiante(){
        return PuntajeEstudiante;
    }
    public int getIntentosEstudiante(){
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