import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class SwingVerMenuPrincipal extends JFrame{
    private JButton BotonCerrarSesion;
    private JButton BotonProgreso;
    private JButton BotonTema1;
    private JButton BotonTema2;
    private JButton BotonTema3;
    private JButton BotonTema4;

    public SwingVerMenuPrincipal(){
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JPanel PanelPrincipal = new JPanel();
        PanelPrincipal.setLayout(new BoxLayout(PanelPrincipal, BoxLayout.Y_AXIS));
        PanelPrincipal.setBorder(new EmptyBorder(25, 35, 25, 35));
        DisenoMenuPrincipal.disenarPanel(PanelPrincipal);

        JPanel PanelBotonesGeneral = new JPanel(new BorderLayout(20, 0));
        PanelBotonesGeneral.setBackground(new Color(52, 70, 82));

        BotonCerrarSesion = new JButton("Cerrar sesion");
        BotonProgreso = new JButton("Progreso");
        DisenoMenuPrincipal.disenarBoton(BotonCerrarSesion);
        DisenoMenuPrincipal.disenarBoton(BotonProgreso);

        JLabel BienvenidaMenu = new JLabel("DUO-MATE");
        BienvenidaMenu.setHorizontalAlignment(SwingConstants.CENTER);
        BienvenidaMenu.setForeground(Color.WHITE);
        BienvenidaMenu.setFont(new Font("Arial", Font.BOLD, 22));

        PanelBotonesGeneral.add(BotonProgreso, BorderLayout.WEST);
        PanelBotonesGeneral.add(BienvenidaMenu, BorderLayout.CENTER);
        PanelBotonesGeneral.add(BotonCerrarSesion, BorderLayout.EAST);
        PanelBotonesGeneral.setMaximumSize(new Dimension(700, 65));

        JPanel PanelTemas = new JPanel();
        PanelTemas.setLayout(new BoxLayout(PanelTemas, BoxLayout.Y_AXIS));
        DisenoMenuPrincipal.disenarPanel(PanelTemas);

        JLabel TextoTituloTemas = new JLabel("Temas disponibles");
        JLabel TextoTemasDisponibles = new JLabel("Selecciona un tema para comenzar");
        DisenoMenuPrincipal.disenarTitulo(TextoTituloTemas);
        DisenoMenuPrincipal.disenarTexto(TextoTemasDisponibles);

        PanelTemas.add(TextoTituloTemas);
        PanelTemas.add(Box.createVerticalStrut(15));
        PanelTemas.add(TextoTemasDisponibles);

        JPanel PanelBotonesTemas = new JPanel();
        PanelBotonesTemas.setLayout(new BoxLayout(PanelBotonesTemas, BoxLayout.Y_AXIS));
        PanelBotonesTemas.setBackground(new Color(255, 246, 221));
        PanelBotonesTemas.setBorder(new EmptyBorder(25, 70, 25, 70));

        JLabel TituloTema1 = new JLabel("Tema 1");
        JLabel NombreTema1 = new JLabel("Factorizacion");
        DisenoMenuPrincipal.disenarTitulo(TituloTema1);
        DisenoMenuPrincipal.disenarTexto(NombreTema1);

        BotonTema1 = new JButton("Comenzar");
        DisenoMenuPrincipal.disenarBoton(BotonTema1);
        BotonTema1.setBackground(new Color(52, 70, 82));
        BotonTema1.setForeground(Color.WHITE);
        BotonTema1.setAlignmentX(Component.CENTER_ALIGNMENT);

        BotonTema2 = new JButton("Tema 2");
        DisenoMenuPrincipal.disenarBoton(BotonTema2);
        BotonTema2.setBackground(new Color(52, 70, 82));
        BotonTema2.setForeground(Color.WHITE);
        BotonTema2.setAlignmentX(Component.CENTER_ALIGNMENT);

        BotonTema3 = new JButton("Tema 3");
        DisenoMenuPrincipal.disenarBoton(BotonTema3);
        BotonTema3.setBackground(new Color(52, 70, 82));
        BotonTema3.setForeground(Color.WHITE);
        BotonTema3.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        BotonTema4 = new JButton("Tema 4");
        DisenoMenuPrincipal.disenarBoton(BotonTema4);
        BotonTema4.setBackground(new Color(52, 70, 82));
        BotonTema4.setForeground(Color.WHITE);
        BotonTema4.setAlignmentX(Component.CENTER_ALIGNMENT);

        PanelBotonesTemas.add(TituloTema1);
        PanelBotonesTemas.add(Box.createVerticalStrut(15));
        PanelBotonesTemas.add(NombreTema1);
        PanelBotonesTemas.add(Box.createVerticalStrut(25));
        PanelBotonesTemas.add(BotonTema1);
        PanelBotonesTemas.add(BotonTema2);
        PanelBotonesTemas.add(BotonTema3);
        PanelBotonesTemas.add(BotonTema4);

        PanelPrincipal.add(PanelBotonesGeneral);
        PanelPrincipal.add(Box.createVerticalStrut(50));
        PanelPrincipal.add(PanelTemas);
        PanelPrincipal.add(Box.createVerticalStrut(35));
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
    public void presionarTema2(ActionListener accion) {
        BotonTema2.addActionListener(accion);
    }
    public void presionarTema3(ActionListener accion) {
        BotonTema3.addActionListener(accion);
    }
    public void presionarTema4(ActionListener accion) {
        BotonTema4.addActionListener(accion);
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
