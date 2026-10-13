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
        
        JPanel PanelBotones = new JPanel(new GridLayout(2, 2, 15, 15));

        DisenoPreguntas.disenarPanel(PanelPrincipal);
        DisenoPreguntas.disenarPanel(PanelOpciones);
        DisenoPreguntas.disenarPanel(PanelBotones);

        JLabel PlantearPregunta = new JLabel(InformacionPregunta[0]);
        DisenoPreguntas.disenarPregunta(PlantearPregunta);

        Eleccion1 = new JButton("<html><center>" + InformacionPregunta[1] + "</center></html>");
        Eleccion2 = new JButton("<html><center>" + InformacionPregunta[2] + "</center></html>");
        Eleccion3 = new JButton("<html><center>" + InformacionPregunta[3] + "</center></html>");
        Eleccion4 = new JButton("<html><center>" + InformacionPregunta[4] + "</center></html>");

        DisenoPreguntas.disenarBoton(Eleccion1);
        DisenoPreguntas.disenarBoton(Eleccion2);
        DisenoPreguntas.disenarBoton(Eleccion3);
        DisenoPreguntas.disenarBoton(Eleccion4);

         PanelOpciones.add(PlantearPregunta);
        PanelOpciones.add(Box.createVerticalStrut(30));

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

    public void mostrarMensajeRespuestaCorrecta() {
        JOptionPane.showMessageDialog(this, "Respuesta Correcta", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarMensajeRespuestaIncorrecta(String RespuestaCorrecta) {
        JOptionPane.showMessageDialog(this, "Respuesta Incorrecta. Respuesta: " + RespuestaCorrecta, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public void cerrarVentanaPreguntas() {
        dispose();
    }

    public void presionarCerrarPrograma(java.awt.event.WindowListener accion) {
        addWindowListener(accion);
    }

    public boolean confirmarCerrarPrograma() {
        int respuesta = JOptionPane.showConfirmDialog(
            this,
            "Su progreso no será guardado.\nPara guardar su progreso haga click en Cerrar Sesion en el Menu Principal" +
            "\n¿Está seguro de que desea salir?",
            "Confirmar salida",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        return respuesta == JOptionPane.YES_OPTION;
    }

    public void cambiarColorRespuesta(int numero, boolean correcta) {
    JButton boton = null;

    if(numero == 1) boton = Eleccion1;
    if(numero == 2) boton = Eleccion2;
    if(numero == 3) boton = Eleccion3;
    if(numero == 4) boton = Eleccion4;

    if(boton != null) {
        if(correcta) {
            DisenoPreguntas.respuestaCorrecta(boton);
        } else {
            DisenoPreguntas.respuestaIncorrecta(boton);
        }
    }
    }
}