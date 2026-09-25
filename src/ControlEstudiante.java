public class ControlEstudiante {
    private Estudiante EstudianteActivo;
    private SwingVerInicioSesion SwingVerInicioSesion1;

    public ControlEstudiante(){
        this.EstudianteActivo = null;
        this.SwingVerInicioSesion1 = new SwingVerInicioSesion();
        SwingVerInicioSesion1.presionarGuardar(e-> registroEstudianteSwing());
    }

    public void registroEstudianteSwing(){

        String NombreIngresado = SwingVerInicioSesion1.obtenerNombre();
        String ContrasenaIngresado = SwingVerInicioSesion1.obtenerContrasena();
        if(NombreIngresado.isBlank()){
            SwingVerInicioSesion1.mostrarMensajeError("Debe ingresar un nombre");
        }
        else if(ContrasenaIngresado.isBlank()){
            SwingVerInicioSesion1.mostrarMensajeError("Debe ingresar una contrasena");
        }
        else if(ContrasenaIngresado.length() <= 5){
            SwingVerInicioSesion1.mostrarMensajeError("Debe ingresar una contrasena de al menos 6 caracteres");
        }
        else{
            if(SwingVerInicioSesion1.confirmarNombre(NombreIngresado)){
                EstudianteActivo = new Estudiante(NombreIngresado, ContrasenaIngresado);
                SwingVerInicioSesion1.mostrarMensajeExito("Usuario '"+NombreIngresado+"' creado");
                SwingVerInicioSesion1.cerrarVentanaInicioDeSesion();
                ControlMenu ControlMenu1 = new ControlMenu(EstudianteActivo);
                ControlMenu1.iniciarMenuPrincipal();
            }
        }
    }

    public void iniciarInicioSesion(){
        SwingVerInicioSesion1.setVisible(true);
    }
}
