public class ControlMenu {
    private Preguntas Preguntas1;
    private PreguntasTema2 Preguntas2;
    private PreguntasTema3 Preguntas3;
    private ControlProgreso ControlProgreso1;
    private SwingVerMenuPrincipal SwingVerMenuPrincipal1;

    public ControlMenu(Estudiante EstudianteActivo){
        SwingVerMenuPrincipal1 = new SwingVerMenuPrincipal();
        SwingVerMenuPrincipal1.presionarProgreso(e-> abrirProgreso(EstudianteActivo));
        SwingVerMenuPrincipal1.presionarCerrarSesion(e-> cerrarSesion(EstudianteActivo));
        SwingVerMenuPrincipal1.presionarTema1(e-> ejecutarTema1(EstudianteActivo));
        SwingVerMenuPrincipal1.presionarTema2(e-> ejecutarTema2(EstudianteActivo));
        SwingVerMenuPrincipal1.presionarTema3(e-> ejecutarTema3(EstudianteActivo));
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
        SwingVerMenuPrincipal1.cerrarVentanaMenuPrincipal();
        Preguntas1.ejecutarSerie();
    }

    public void ejecutarTema2(Estudiante EstudianteActivo){
        Preguntas2 = new PreguntasTema2(EstudianteActivo);
        SwingVerMenuPrincipal1.cerrarVentanaMenuPrincipal();
        Preguntas2.ejecutarSerie();
    }
    public void ejecutarTema3(Estudiante EstudianteActivo){
        Preguntas3 = new PreguntasTema3(EstudianteActivo);
        SwingVerMenuPrincipal1.cerrarVentanaMenuPrincipal();
        Preguntas3.ejecutarSerie();
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
