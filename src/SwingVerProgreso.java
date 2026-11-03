
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class SwingVerProgreso extends JFrame {

    private JButton BotonRegresarAlMenu;

    public SwingVerProgreso(String NombreEstudiante,
                            double PuntosActuales,
                            double IntentosTotal,
                            double PorcentajeAcierto) {

        setTitle("Duo-Mate - Mi Progreso");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JPanel PanelPrincipal = new JPanel(new GridBagLayout());
        DisenoMenuPrincipal.disenarPanel(PanelPrincipal);
        PanelPrincipal.setBorder(new EmptyBorder(25, 25, 25, 25));

        JPanel Contenedor = new JPanel();
        Contenedor.setLayout(
            new BoxLayout(Contenedor, BoxLayout.Y_AXIS)
        );
        DisenoMenuPrincipal.disenarPanel(Contenedor);
        Contenedor.setPreferredSize(new Dimension(460, 480));

        // Encabezado
        JPanel Encabezado = new JPanel();
        Encabezado.setBackground(DisenoMenuPrincipal.oscuro);
        Encabezado.setBorder(new EmptyBorder(20, 20, 20, 20));
        Encabezado.setMaximumSize(new Dimension(460, 90));

        JLabel Titulo = new JLabel("MI PROGRESO");
        Titulo.setForeground(Color.WHITE);
        Titulo.setFont(new Font("Arial", Font.BOLD, 25));
        Encabezado.add(Titulo);

        // Nombre del estudiante
        JPanel PanelNombre = DisenoMenuPrincipal.crearTarjeta();
        PanelNombre.setMaximumSize(new Dimension(460, 80));

        JLabel Nombre = new JLabel(
            "Estudiante: " + NombreEstudiante
        );
        DisenoMenuPrincipal.disenarTexto(Nombre);
        PanelNombre.add(Nombre);

        // Estadisticas
        JPanel PanelEstadisticas = new JPanel(
            new GridLayout(1, 2, 15, 15)
        );
        DisenoMenuPrincipal.disenarPanel(PanelEstadisticas);
        PanelEstadisticas.setMaximumSize(new Dimension(460, 130));

        PanelEstadisticas.add(crearEstadistica(
            "Puntos obtenidos", PuntosActuales
        ));

        PanelEstadisticas.add(crearEstadistica(
            "Intentos realizados", IntentosTotal
        ));

        // Porcentaje de aciertos
        JPanel PanelPorcentaje = DisenoMenuPrincipal.crearTarjeta();
        PanelPorcentaje.setLayout(
            new BoxLayout(PanelPorcentaje, BoxLayout.Y_AXIS)
        );
        PanelPorcentaje.setMaximumSize(new Dimension(460, 120));

        JLabel TextoPorcentaje = new JLabel(
            "Porcentaje de aciertos: "
            + String.format("%.2f", PorcentajeAcierto) + "%"
        );
        DisenoMenuPrincipal.disenarTexto(TextoPorcentaje);

        int porcentaje = (int) Math.round(PorcentajeAcierto);
        porcentaje = Math.max(0, Math.min(100, porcentaje));

        JProgressBar BarraProgreso = new JProgressBar(0, 100);
        BarraProgreso.setValue(porcentaje);
        BarraProgreso.setForeground(new Color(62, 235, 145));
        BarraProgreso.setBackground(Color.WHITE);
        BarraProgreso.setStringPainted(true);

        PanelPorcentaje.add(TextoPorcentaje);
        PanelPorcentaje.add(Box.createVerticalStrut(15));
        PanelPorcentaje.add(BarraProgreso);

        // Boton regresar
        BotonRegresarAlMenu = new JButton("Regresar al menu");
        DisenoMenuPrincipal.disenarBoton(BotonRegresarAlMenu);
        BotonRegresarAlMenu.setAlignmentX(Component.CENTER_ALIGNMENT);

        Contenedor.add(Encabezado);
        Contenedor.add(Box.createVerticalStrut(15));
        Contenedor.add(PanelNombre);
        Contenedor.add(Box.createVerticalStrut(15));
        Contenedor.add(PanelEstadisticas);
        Contenedor.add(Box.createVerticalStrut(15));
        Contenedor.add(PanelPorcentaje);
        Contenedor.add(Box.createVerticalStrut(20));
        Contenedor.add(BotonRegresarAlMenu);

        PanelPrincipal.add(Contenedor);
        add(PanelPrincipal);

        setSize(600, 650);
        setMinimumSize(new Dimension(550, 600));
        setLocationRelativeTo(null);
    }

    private JPanel crearEstadistica(String titulo, double valor) {
        JPanel tarjeta = DisenoMenuPrincipal.crearTarjeta();
        tarjeta.setLayout(new BoxLayout(tarjeta, BoxLayout.Y_AXIS));

        JLabel Numero = new JLabel(
            String.format("%.0f", valor)
        );
        DisenoMenuPrincipal.disenarTitulo(Numero);

        JLabel Texto = new JLabel(titulo);
        Texto.setFont(new Font("Arial", Font.PLAIN, 13));
        Texto.setForeground(DisenoMenuPrincipal.oscuro);
        Texto.setAlignmentX(Component.CENTER_ALIGNMENT);

        tarjeta.add(Numero);
        tarjeta.add(Box.createVerticalStrut(10));
        tarjeta.add(Texto);

        return tarjeta;
    }

    public void presionarAtras(ActionListener accion) {
        BotonRegresarAlMenu.addActionListener(accion);
    }

    public void cerrarVentanaProgreso() {
        dispose();
    }

    public void presionarCerrarPrograma(
        java.awt.event.WindowListener accion
    ) {
        addWindowListener(accion);
    }

    public boolean confirmarCerrarPrograma() {
        int respuesta = JOptionPane.showConfirmDialog(
            this,
            "Su progreso no sera guardado.\n"
            + "Para guardar su progreso haga click en Cerrar sesion.\n"
            + "¿Esta seguro de que desea salir?",
            "Confirmar salida",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        return respuesta == JOptionPane.YES_OPTION;
    }
}
