import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class SwingVerPregunta extends JFrame{


    private JButton Eleccion1;
    private JButton Eleccion2;
    private JButton Eleccion3;
    private JButton Eleccion4;

    public SwingVerPregunta(String[] InformacionPregunta){
        setTitle("Pregunta");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JPanel PanelPrincipal = new JPanel();
        PanelPrincipal.setLayout(new BoxLayout(PanelPrincipal, BoxLayout.Y_AXIS));
        PanelPrincipal.setBorder(new EmptyBorder(30, 40, 30, 40));
        JPanel PanelOpciones = new JPanel();
        PanelOpciones.setLayout(new BoxLayout(PanelOpciones, BoxLayout.Y_AXIS));
        JPanel PanelRespuestas = new JPanel();
        PanelRespuestas.setLayout(new BoxLayout(PanelRespuestas, BoxLayout.Y_AXIS));
        JPanel PanelBotones = new JPanel();

        JLabel PlantearPregunta = new JLabel(InformacionPregunta[0]);
        JLabel Opcion1 = new JLabel("1.) "+InformacionPregunta[1]);
        JLabel Opcion2 = new JLabel("2.) "+InformacionPregunta[2]);
        JLabel Opcion3 = new JLabel("3.) "+InformacionPregunta[3]);
        JLabel Opcion4 = new JLabel("4.) "+InformacionPregunta[4]);
        Eleccion1 = new JButton("1");
        Eleccion2 = new JButton("2");
        Eleccion3 = new JButton("3");
        Eleccion4 = new JButton("4");

        PanelRespuestas.setAlignmentX(Component.CENTER_ALIGNMENT);
        PlantearPregunta.setAlignmentX(Component.CENTER_ALIGNMENT);
        Opcion1.setAlignmentX(Component.LEFT_ALIGNMENT);
        Opcion2.setAlignmentX(Component.LEFT_ALIGNMENT);
        Opcion3.setAlignmentX(Component.LEFT_ALIGNMENT);
        Opcion4.setAlignmentX(Component.LEFT_ALIGNMENT);
        

        PanelRespuestas.add(Opcion1);
        PanelRespuestas.add(Opcion2);
        PanelRespuestas.add(Opcion3);
        PanelRespuestas.add(Opcion4);

        PanelOpciones.add(PlantearPregunta);
        PanelOpciones.add(Box.createVerticalStrut(20));
        PanelOpciones.add(PanelRespuestas);
        PanelOpciones.add(Box.createVerticalStrut(20));

        PanelBotones.add(Eleccion1);
        PanelBotones.add(Eleccion2);
        PanelBotones.add(Eleccion3);
        PanelBotones.add(Eleccion4);

        PanelPrincipal.add(PanelOpciones);
        PanelPrincipal.add(PanelBotones);
        add(PanelPrincipal);

        pack();
        setLocationRelativeTo(null);
    }

    public void seleccion1(ActionListener accion) {
        Eleccion1.addActionListener(accion);
    }
    public void seleccion2(ActionListener accion) {
        Eleccion2.addActionListener(accion);
    }
    public void seleccion3(ActionListener accion) {
        Eleccion3.addActionListener(accion);
    }
    public void seleccion4(ActionListener accion) {
        Eleccion4.addActionListener(accion);
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
