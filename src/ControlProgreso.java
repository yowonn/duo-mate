public class ControlProgreso {

    private Progreso Progreso1;
    private SwingVerProgreso SwingVerProgreso1;

    ControlProgreso(Estudiante EstudianteActivo){
        Progreso1 = new Progreso(EstudianteActivo);
        SwingVerProgreso1 = new SwingVerProgreso(Progreso1.getNombreEstudiante(),Progreso1.getPuntajeEstudiante(),
        Progreso1.getIntentosEstudiante(),Progreso1.PorcentajeAciertosEstudiante());
        SwingVerProgreso1.presionarAtras(e-> cerrarProgreso(EstudianteActivo));
        SwingVerProgreso1.presionarCerrarPrograma(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent e) {
                    cerrarPrograma();
                }
            });
    }

    public void cerrarProgreso(Estudiante EstudianteActivo){
        SwingVerProgreso1.cerrarVentanaProgreso();
        ControlMenu ControlMenu1 = new ControlMenu(EstudianteActivo);
        ControlMenu1.iniciarMenuPrincipal();
    }

    public void iniciarProgreso(){
        SwingVerProgreso1.setVisible(true);
    }

    public void cerrarPrograma(){
        if (SwingVerProgreso1.confirmarCerrarPrograma()) {
            System.exit(0);
        }
    }
}
