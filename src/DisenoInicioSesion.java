
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisenoInicioSesion {

    public static Color fondo = new Color(131, 180, 176);
    public static Color crema = new Color(255, 246, 221);
    public static Color oscuro = new Color(52, 70, 82);

    public static void disenarPanel(JPanel panel) {
        panel.setBackground(fondo);
    }

    public static void disenarTitulo(JLabel titulo) {
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setForeground(oscuro);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    public static void disenarTexto(JLabel texto) {
        texto.setFont(new Font("Arial", Font.BOLD, 15));
        texto.setForeground(oscuro);
    }

    public static void disenarCampo(JTextField campo) {
        campo.setFont(new Font("Arial", Font.PLAIN, 15));
        campo.setForeground(oscuro);
        campo.setBackground(Color.WHITE);
        campo.setPreferredSize(new Dimension(250, 40));
        campo.setCaretColor(oscuro);
    }

    public static void disenarBoton(JButton boton) {
        boton.setFont(new Font("Arial", Font.BOLD, 15));
        boton.setBackground(crema);
        boton.setForeground(oscuro);
        boton.setFocusPainted(false);
        boton.setPreferredSize(new Dimension(250, 45));
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        boton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                boton.setBackground(new Color(205, 235, 224));
            }

            public void mouseExited(MouseEvent e) {
                boton.setBackground(crema);
            }
        });
    }
}
