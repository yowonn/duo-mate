public class ControlEstudiante {
    private Estudiante EstudianteActivo;
    private VerInicioSesion VerInicioSesion1;

    public ControlEstudiante(){
        this.EstudianteActivo = null;
        this.VerInicioSesion1 = new VerInicioSesion();
    }

    String NombreIngresado;
    String ContrasenaIngresado;
    public void registroEstudiante(){
        boolean VerificadorNombre = false;
        boolean VerificadorContrasena = false;
        while(VerificadorNombre == false){
            NombreIngresado = VerInicioSesion1.mostrarRegistroNombre();
            if(NombreIngresado != ""){
                VerificadorNombre = true;
            }
            else{
                VerInicioSesion1.errorRegistroNombre();
            }
        }
        while(VerificadorContrasena == false){
            ContrasenaIngresado = VerInicioSesion1.mostrarRegistroContrasena();
            if(ContrasenaIngresado != ""){
                VerificadorContrasena = true;
            }
            else{
                VerInicioSesion1.errorRegistroContrasena();
            }
        }
        EstudianteActivo = new Estudiante(NombreIngresado, ContrasenaIngresado);
        VerInicioSesion1.registroExitoso();
    }
}
