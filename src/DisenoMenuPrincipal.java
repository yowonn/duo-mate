
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisenoMenuPrincipal {

    public static Color fondo = new Color(131, 180, 176);
    public static Color crema = new Color(255, 246, 221);
    public static Color oscuro = new Color(52, 70, 82);

    public static void disenarPanel(JPanel panel) {
        panel.setBackground(fondo);
    }

    public static void disenarBoton(JButton boton) {
        boton.setBackground(crema);
        boton.setForeground(oscuro);
        boton.setFont(new Font("Arial", Font.BOLD, 15));
        boton.setFocusPainted(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setPreferredSize(new Dimension(145, 45));

        boton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                if (boton.isEnabled()) {
                    boton.setBackground(new Color(205, 235, 224));
                }
            }

            public void mouseExited(MouseEvent e) {
                boton.setBackground(crema);
            }
        });
    }

    public static void disenarTitulo(JLabel titulo) {
        titulo.setFont(new Font("Arial", Font.BOLD, 25));
        titulo.setForeground(oscuro);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    public static void disenarTexto(JLabel texto) {
        texto.setFont(new Font("Arial", Font.BOLD, 16));
        texto.setForeground(oscuro);
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    public static JPanel crearTarjeta() {
        JPanel panel = new JPanel();
        panel.setBackground(crema);
        panel.setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );
        return panel;
    }
}
