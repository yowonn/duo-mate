public class ControlMenu {
    private Preguntas Preguntas1;
    private ControlProgreso ControlProgreso1;
    private SwingVerMenuPrincipal SwingVerMenuPrincipal1;

    public ControlMenu(Estudiante EstudianteActivo){
        SwingVerMenuPrincipal1 = new SwingVerMenuPrincipal();
        SwingVerMenuPrincipal1.presionarProgreso(e-> abrirProgreso(EstudianteActivo));
        SwingVerMenuPrincipal1.presionarCerrarSesion(e-> cerrarSesion(EstudianteActivo));
        SwingVerMenuPrincipal1.presionarTema1(e-> ejecutarTema1(EstudianteActivo));
        SwingVerMenuPrincipal1.presionarCerrarPrograma(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent e) {
                    cerrarPrograma();
                }
            });
    }

    public void abrirProgreso(Estudiante EstudianteActivo){
        SwingVerMenuPrincipal1.cerrarVentanaMenuPrincipal();
        ControlProgreso1 = new ControlProgreso(EstudianteActivo);
        ControlProgreso1.iniciarProgreso();
    }

    public void cerrarSesion(Estudiante EstudianteActivo){
        if(SwingVerMenuPrincipal1.confirmarCerrarSesion()){
            EstudianteActivo = null;
            SwingVerMenuPrincipal1.cerrarVentanaMenuPrincipal();
            ControlEstudiante ControlEstudiante1 = new ControlEstudiante();
            ControlEstudiante1.iniciarInicioSesion();
        }
    }

    public void ejecutarTema1(Estudiante EstudianteActivo){
        Preguntas1 = new Preguntas(EstudianteActivo);
        Preguntas1.Preguntas_Factorizacion();
    }

    public void iniciarMenuPrincipal(){
        SwingVerMenuPrincipal1.setVisible(true);
    }

    public void cerrarPrograma(){
        if (SwingVerMenuPrincipal1.confirmarCerrarPrograma()) {
            System.exit(0);
        }
    }
}
