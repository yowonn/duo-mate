
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class SwingVerInicioSesion extends JFrame {

    private JTextField NombreRecibido;
    private JPasswordField ContrasenaRecibido;
    private JButton BotonGuardar;
    private JButton BotonIniciarSesion;
    private JCheckBox MostrarContrasena;

    public SwingVerInicioSesion() {

        setTitle("Duo-Mate - Inicio de Sesion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel PanelPrincipal = new JPanel(new GridBagLayout());
        PanelPrincipal.setBackground(DisenoInicioSesion.fondo);
        PanelPrincipal.setBorder(new EmptyBorder(25, 25, 25, 25));


        JPanel Contenedor = new JPanel();
        Contenedor.setLayout(new BoxLayout(Contenedor, BoxLayout.Y_AXIS));
        Contenedor.setBackground(DisenoInicioSesion.fondo);
        Contenedor.setPreferredSize(new Dimension(450, 650));

    
        JPanel PanelEncabezado = new JPanel();
        PanelEncabezado.setLayout(new BoxLayout(PanelEncabezado, BoxLayout.Y_AXIS));
        PanelEncabezado.setBackground(DisenoInicioSesion.oscuro);
        PanelEncabezado.setBorder(new EmptyBorder(20, 20, 20, 20));
        PanelEncabezado.setAlignmentX(Component.CENTER_ALIGNMENT);
        PanelEncabezado.setMaximumSize(new Dimension(450, 110));

        JLabel NombrePrograma = new JLabel("DUO-MATE");
        NombrePrograma.setFont(new Font("Arial", Font.BOLD, 28));
        NombrePrograma.setForeground(Color.WHITE);
        NombrePrograma.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel Subtitulo = new JLabel("Aprende matematicas a tu ritmo");
        Subtitulo.setFont(new Font("Arial", Font.PLAIN, 14));
        Subtitulo.setForeground(Color.WHITE);
        Subtitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        PanelEncabezado.add(NombrePrograma);
        PanelEncabezado.add(Box.createVerticalStrut(8));
        PanelEncabezado.add(Subtitulo);


        JPanel PanelFormulario = new JPanel();
        PanelFormulario.setLayout(new BoxLayout(PanelFormulario, BoxLayout.Y_AXIS));
        PanelFormulario.setBackground(DisenoInicioSesion.crema);
        PanelFormulario.setBorder(new EmptyBorder(25, 40, 25, 40));
        PanelFormulario.setAlignmentX(Component.CENTER_ALIGNMENT);
        PanelFormulario.setMaximumSize(new Dimension(450, 510));

        JLabel Bienvenida = new JLabel("¡Bienvenido!");
        DisenoInicioSesion.disenarTitulo(Bienvenida);

        JLabel Instrucciones = new JLabel("Ingresa tus datos para comenzar");
        DisenoInicioSesion.disenarTexto(Instrucciones);
        Instrucciones.setAlignmentX(Component.CENTER_ALIGNMENT);


        JLabel EtiquetaNombre = new JLabel("Nombre de usuario:");
        DisenoInicioSesion.disenarTexto(EtiquetaNombre);
        EtiquetaNombre.setAlignmentX(Component.CENTER_ALIGNMENT);

        NombreRecibido = new JTextField(20);
        DisenoInicioSesion.disenarCampo(NombreRecibido);
        NombreRecibido.setMaximumSize(new Dimension(350, 40));
        NombreRecibido.setAlignmentX(Component.CENTER_ALIGNMENT);


        JLabel EtiquetaContrasena = new JLabel("Contraseña:");
        DisenoInicioSesion.disenarTexto(EtiquetaContrasena);
        EtiquetaContrasena.setAlignmentX(Component.CENTER_ALIGNMENT);

        ContrasenaRecibido = new JPasswordField(20);
        DisenoInicioSesion.disenarCampo(ContrasenaRecibido);
        ContrasenaRecibido.setMaximumSize(new Dimension(350, 40));
        ContrasenaRecibido.setAlignmentX(Component.CENTER_ALIGNMENT);

        char caracterOriginal = ContrasenaRecibido.getEchoChar();

        JLabel Indicacion = new JLabel("Mínimo 6 caracteres para registrarte");
        Indicacion.setFont(new Font("Arial", Font.PLAIN, 12));
        Indicacion.setForeground(DisenoInicioSesion.oscuro);
        Indicacion.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Mostrar contraseña
        MostrarContrasena = new JCheckBox("Mostrar contraseña");
        MostrarContrasena.setBackground(DisenoInicioSesion.crema);
        MostrarContrasena.setForeground(DisenoInicioSesion.oscuro);
        MostrarContrasena.setFocusPainted(false);
        MostrarContrasena.setAlignmentX(Component.CENTER_ALIGNMENT);

        MostrarContrasena.addActionListener(e -> {
            if(MostrarContrasena.isSelected()) {
                ContrasenaRecibido.setEchoChar((char) 0);
            } else {
                ContrasenaRecibido.setEchoChar(caracterOriginal);
            }
        });

        // Botones
        BotonGuardar = new JButton("Crear usuario");
        BotonIniciarSesion = new JButton("Iniciar sesión");

        DisenoInicioSesion.disenarBoton(BotonGuardar);
        DisenoInicioSesion.disenarBoton(BotonIniciarSesion);

        BotonGuardar.setMaximumSize(new Dimension(350, 45));
        BotonIniciarSesion.setMaximumSize(new Dimension(350, 45));

        BotonGuardar.setAlignmentX(Component.CENTER_ALIGNMENT);
        BotonIniciarSesion.setAlignmentX(Component.CENTER_ALIGNMENT);

        
        PanelFormulario.add(Bienvenida);
        PanelFormulario.add(Box.createVerticalStrut(10));
        PanelFormulario.add(Instrucciones);
        PanelFormulario.add(Box.createVerticalStrut(25));

        PanelFormulario.add(EtiquetaNombre);
        PanelFormulario.add(Box.createVerticalStrut(8));
        PanelFormulario.add(NombreRecibido);
        PanelFormulario.add(Box.createVerticalStrut(20));

        PanelFormulario.add(EtiquetaContrasena);
        PanelFormulario.add(Box.createVerticalStrut(8));
        PanelFormulario.add(ContrasenaRecibido);
        PanelFormulario.add(Box.createVerticalStrut(10));
        PanelFormulario.add(Indicacion);
        PanelFormulario.add(Box.createVerticalStrut(12));
        PanelFormulario.add(MostrarContrasena);
        PanelFormulario.add(Box.createVerticalStrut(25));

        PanelFormulario.add(BotonGuardar);
        PanelFormulario.add(Box.createVerticalStrut(12));
        PanelFormulario.add(BotonIniciarSesion);

        Contenedor.add(PanelEncabezado);
        Contenedor.add(Box.createVerticalStrut(20));
        Contenedor.add(PanelFormulario);

        PanelPrincipal.add(Contenedor);
        add(PanelPrincipal);

        setSize(650, 780);
        setMinimumSize(new Dimension(540, 750));
        setLocationRelativeTo(null);
    }

    public String obtenerNombre() {
        return NombreRecibido.getText().trim();
    }

    public String obtenerContrasena() {
        return new String(ContrasenaRecibido.getPassword());
    }

    public void presionarGuardar(ActionListener accion) {
        BotonGuardar.addActionListener(accion);
    }

    public void presionarIniciarSesion(ActionListener accion) {
        BotonIniciarSesion.addActionListener(accion);
    }

    public void mostrarMensajeExito(String mensaje) {
        JOptionPane.showMessageDialog(
            this, mensaje, "Exito",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(
            this, mensaje, "Error",
            JOptionPane.ERROR_MESSAGE
        );
    }

    public boolean confirmarNombre(String nombre) {
        int respuesta = JOptionPane.showConfirmDialog(
            this,
            "¿El nombre \"" + nombre + "\" es correcto?",
            "Confirmar nombre",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        return respuesta == JOptionPane.YES_OPTION;
    }

    public void cerrarVentanaInicioDeSesion() {
        dispose();
    }
}
