import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class SwingVerProgreso extends JFrame{
    private JButton BotonRegresarAlMenu;

    public SwingVerProgreso(String NombreEstudiante, double PuntosActuales, double IntentosTotal, double PorcentajeAcierto){
        setTitle("Progreso");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JPanel PanelPrincipal = new JPanel();
        PanelPrincipal.setLayout(new BoxLayout(PanelPrincipal, BoxLayout.Y_AXIS));
        PanelPrincipal.setBorder(new EmptyBorder(30, 40, 30, 40));

        JLabel TituloProgreso = new JLabel("Progreso de "+NombreEstudiante);
        JLabel MostrarPuntos = new JLabel("Puntaje actual: "+PuntosActuales);
        JLabel MostrarIntentos = new JLabel("Intentos totales: "+IntentosTotal);
        JLabel MostrarPorcentaje = new JLabel("Porcentaje de acierto: "+PorcentajeAcierto+" %");
        BotonRegresarAlMenu = new JButton("Regresar al Menu");

        TituloProgreso.setAlignmentX(Component.CENTER_ALIGNMENT);
        MostrarPuntos.setAlignmentX(Component.CENTER_ALIGNMENT);
        MostrarIntentos.setAlignmentX(Component.CENTER_ALIGNMENT);
        MostrarPorcentaje.setAlignmentX(Component.CENTER_ALIGNMENT);
        BotonRegresarAlMenu.setAlignmentX(Component.CENTER_ALIGNMENT);

        PanelPrincipal.add(TituloProgreso);
        PanelPrincipal.add(Box.createVerticalStrut(20));
        PanelPrincipal.add(MostrarPuntos);
        PanelPrincipal.add(MostrarIntentos);
        PanelPrincipal.add(MostrarPorcentaje);
        PanelPrincipal.add(Box.createVerticalStrut(20));
        PanelPrincipal.add(BotonRegresarAlMenu);

        add(PanelPrincipal);
        pack();
        setLocationRelativeTo(null);
    }

    public void presionarAtras(ActionListener accion) {
        BotonRegresarAlMenu.addActionListener(accion);
    }

    public void cerrarVentanaProgreso(){
        dispose();
    }

    public void presionarCerrarPrograma(java.awt.event.WindowListener accion) {
        addWindowListener(accion);
    }

    public boolean confirmarCerrarPrograma() {
        int respuesta = JOptionPane.showConfirmDialog(
            this,
            "Su progreso no será guardado.\nPara guardar su progreso haga click en Cerrar Sesion en el Menu Principal"+
            "\n¿Está seguro de que desea salir?",
            "Confirmar salida",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        return respuesta == JOptionPane.YES_OPTION;
    }
}
