import java.swing.*;
import java.awt.*;

public class DisenoPreguntas {

    public static void disenarBoton(JButton boton){
        boton.setbackground(new Color(225, 246, 221));
        boton.setForeground(new Color(52, 70,82));
        boton.setFont(new Font("Arial", Font.BOLD, 16));
        boton.setFocusPainted(false);
        boton.setPreferredSize(new Dimension (220, 90));
        boton.setOpaque(true);
    }

    public static void respuestaCorrecta(JButton boton) {
        boton.setBackground(new Color(62, 235, 145));
    }

    public static void respuestaIncorrecta(JButton boton) {
        boton.setBackground(new Color(255, 82, 82));
    }

    public static void disenarPanel(JPanel panel) {
        panel.setBackground(new Color(131, 180, 176));
    }

    public static void disenarPregunta(JLabel pregunta) {
        pregunta.setFont(new Font("Arial", Font.BOLD, 20));
        pregunta.setForeground(new Color(52, 70, 82));
        pregunta.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}

