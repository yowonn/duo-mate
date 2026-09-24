import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class SwingVerMenuPrincipal extends JFrame{
    private JButton BotonCerrarSesion;
    private JButton BotonProgreso;
    private JButton BotonTema1;

    public SwingVerMenuPrincipal(){
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JPanel PanelPrincipal = new JPanel();
        PanelPrincipal.setLayout(new BoxLayout(PanelPrincipal, BoxLayout.Y_AXIS));
        PanelPrincipal.setBorder(new EmptyBorder(30, 40, 30, 40));

        JPanel PanelBotonesGeneral = new JPanel();
        PanelBotonesGeneral.setLayout(new BorderLayout());
        BotonCerrarSesion = new JButton("Cerrar sesion");
        JLabel BienvenidaMenu = new JLabel("    DUO MATE    ");
        BienvenidaMenu.setHorizontalAlignment(SwingConstants.CENTER);
        BotonProgreso = new JButton("Progreso");
        PanelBotonesGeneral.add(BotonCerrarSesion, BorderLayout.EAST);
        PanelBotonesGeneral.add(BienvenidaMenu, BorderLayout.CENTER);
        PanelBotonesGeneral.add(BotonProgreso, BorderLayout.WEST);

        JPanel PanelTemas = new JPanel();
        PanelTemas.setLayout(new BoxLayout(PanelTemas, BoxLayout.Y_AXIS));
        JLabel TextoTituloTemas = new JLabel("Temas Disponibles");
        JLabel TextoTemasDisponibles = new JLabel("1. Factorizacion");
        TextoTituloTemas.setAlignmentX(Component.CENTER_ALIGNMENT);
        TextoTemasDisponibles.setAlignmentX(Component.CENTER_ALIGNMENT);
        PanelTemas.add(TextoTituloTemas);
        PanelTemas.add(Box.createVerticalStrut(10));
        PanelTemas.add(TextoTemasDisponibles);
        
        JPanel PanelBotonesTemas = new JPanel();
        PanelBotonesTemas.setLayout(new FlowLayout());
        BotonTema1 = new JButton("Tema 1");
        PanelBotonesTemas.add(BotonTema1);

        PanelPrincipal.add(PanelBotonesGeneral);
        PanelPrincipal.add(Box.createVerticalStrut(50));
        PanelPrincipal.add(PanelTemas);
        PanelPrincipal.add(Box.createVerticalStrut(50));
        PanelPrincipal.add(PanelBotonesTemas);

        add(PanelPrincipal);
        pack();
        setLocationRelativeTo(null);
    }

    public void presionarCerrarSesion(ActionListener accion) {
        BotonCerrarSesion.addActionListener(accion);
    }
    public boolean confirmarCerrarSesion() {
        int respuesta = JOptionPane.showConfirmDialog(
            this,
            "¿Esta seguro de cerrar sesion?",
            "Confirmar cerrar sesion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        return respuesta == JOptionPane.YES_OPTION;
    }

    public void presionarProgreso(ActionListener accion) {
        BotonProgreso.addActionListener(accion);
    }
    public void presionarTema1(ActionListener accion) {
        BotonTema1.addActionListener(accion);
    }

    public void cerrarVentanaMenuPrincipal(){
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
