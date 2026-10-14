import javax.swing.*;
import java.awt.*;

public class DisenoMenuPrincipal {
    
    public static void disenarPanel(JPanel panel) {
        panel.setBackground(new Color(131, 180, 176));
    }

    public static void disenarBoton(JButton boton) {
        boton.setBackground(new Color(225, 246, 221));
        boton.setForeground(new Color(52, 70,82));
        boton.setFont(new Font("Arial", Font.BOLD, 14));
        boton.setFocusPainted(false);
        boton.setPreferredSize(new Dimension (130, 45));
    }

    public static void disenarTitulo(JLabel titulo){
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(52,70,82));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    public static void disenarTexto(JLabel texto) {
        texto.setFont(new Font("Arial", Font.BOLD, 17));
        texto.setForeground(new Color(52, 70, 82));
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
