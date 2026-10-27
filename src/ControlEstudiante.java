public class ControlEstudiante {
    private Estudiante EstudianteActivo;
    private SwingVerInicioSesion SwingVerInicioSesion1;

    public ControlEstudiante(){
        this.EstudianteActivo = null;
        this.SwingVerInicioSesion1 = new SwingVerInicioSesion();
        SwingVerInicioSesion1.presionarGuardar(e-> registroEstudianteSwing());
        SwingVerInicioSesion1.presionarIniciarSesion(e-> abrirSesionEstudianteSwing());
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
            try{
                if(BaseEstudiantes.existeEstudiante(NombreIngresado)){
                    SwingVerInicioSesion1.mostrarMensajeError("El usuario '"+NombreIngresado+"' ya existe. Elija otro nombre o inicie sesion");
                }
                else if(SwingVerInicioSesion1.confirmarNombre(NombreIngresado)){
                    EstudianteActivo = new Estudiante(NombreIngresado, ContrasenaIngresado);
                    BaseEstudiantes.guardarEstudiante(EstudianteActivo);
                    SwingVerInicioSesion1.mostrarMensajeExito("Usuario '"+NombreIngresado+"' creado");
                    SwingVerInicioSesion1.cerrarVentanaInicioDeSesion();
                    ControlMenu ControlMenu1 = new ControlMenu(EstudianteActivo);
                    ControlMenu1.iniciarMenuPrincipal();
                }
            }
            catch(RuntimeException e){
                SwingVerInicioSesion1.mostrarMensajeError("No se pudo conectar con la base de datos. Revise su conexion a internet");
                e.printStackTrace();
            }
        }
    }

    public void abrirSesionEstudianteSwing(){

        //Aqui va el codigo para que el usuario pueda abrir sesion
    }

    public void iniciarInicioSesion(){
        SwingVerInicioSesion1.setVisible(true);
    }
}
