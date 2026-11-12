
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class DisenoMensajes {

    private static Color fondo = new Color(255, 246, 221);
    private static Color oscuro = new Color(52, 70, 82);
    private static Color verde = new Color(35, 160, 95);
    private static Color rojo = new Color(220, 65, 65);

    public static void mostrarMensaje(JFrame ventana, String titulo,
                                      String mensaje, boolean exito) {

        JDialog dialogo = new JDialog(ventana, titulo, true);
        dialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialogo.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(fondo);
        panel.setBorder(new EmptyBorder(25, 35, 25, 35));

        JLabel etiquetaTitulo = new JLabel(titulo);
        etiquetaTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        etiquetaTitulo.setForeground(exito ? verde : rojo);
        etiquetaTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel etiquetaMensaje = new JLabel(
            "<html><div style='text-align:center; width:300px;'>"
            + mensaje + "</div></html>"
        );
        etiquetaMensaje.setFont(new Font("Arial", Font.PLAIN, 15));
        etiquetaMensaje.setForeground(oscuro);
        etiquetaMensaje.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton botonAceptar = new JButton("Entendido");
        botonAceptar.setBackground(oscuro);
        botonAceptar.setForeground(Color.WHITE);
        botonAceptar.setFont(new Font("Arial", Font.BOLD, 15));
        botonAceptar.setFocusPainted(false);
        botonAceptar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botonAceptar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botonAceptar.setPreferredSize(new Dimension(150, 40));

        botonAceptar.addActionListener(e -> dialogo.dispose());

        panel.add(etiquetaTitulo);
        panel.add(Box.createVerticalStrut(15));
        panel.add(etiquetaMensaje);
        panel.add(Box.createVerticalStrut(25));
        panel.add(botonAceptar);

        dialogo.add(panel);
        dialogo.pack();
        dialogo.setLocationRelativeTo(ventana);
        dialogo.setVisible(true);
    }

    public static boolean confirmar(JFrame ventana, String titulo,
                                    String mensaje) {

        JDialog dialogo = new JDialog(ventana, titulo, true);
        dialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialogo.setResizable(false);

        final boolean[] confirmado = {false};

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(fondo);
        panel.setBorder(new EmptyBorder(25, 35, 25, 35));

        JLabel etiquetaTitulo = new JLabel(titulo);
        etiquetaTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        etiquetaTitulo.setForeground(oscuro);
        etiquetaTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel etiquetaMensaje = new JLabel(
            "<html><div style='text-align:center; width:320px;'>"
            + mensaje.replace("\n", "<br>")
            + "</div></html>"
        );
        etiquetaMensaje.setFont(new Font("Arial", Font.PLAIN, 15));
        etiquetaMensaje.setForeground(oscuro);
        etiquetaMensaje.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton botonCancelar = new JButton("Cancelar");
        JButton botonConfirmar = new JButton("Confirmar");

        botonCancelar.setBackground(Color.WHITE);
        botonCancelar.setForeground(oscuro);
        botonCancelar.setFont(new Font("Arial", Font.BOLD, 14));
        botonCancelar.setFocusPainted(false);
        botonCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        botonConfirmar.setBackground(oscuro);
        botonConfirmar.setForeground(Color.WHITE);
        botonConfirmar.setFont(new Font("Arial", Font.BOLD, 14));
        botonConfirmar.setFocusPainted(false);
        botonConfirmar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        botonCancelar.addActionListener(e -> dialogo.dispose());

        botonConfirmar.addActionListener(e -> {
            confirmado[0] = true;
            dialogo.dispose();
        });

        JPanel panelBotones = new JPanel(new FlowLayout(
            FlowLayout.CENTER, 15, 0
        ));
        panelBotones.setBackground(fondo);
        panelBotones.add(botonCancelar);
        panelBotones.add(botonConfirmar);

        panel.add(etiquetaTitulo);
        panel.add(Box.createVerticalStrut(15));
        panel.add(etiquetaMensaje);
        panel.add(Box.createVerticalStrut(25));
        panel.add(panelBotones);

        dialogo.add(panel);
        dialogo.pack();
        dialogo.setLocationRelativeTo(ventana);
        dialogo.setVisible(true);

        return confirmado[0];
    }
}
