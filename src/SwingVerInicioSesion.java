import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class SwingVerInicioSesion extends JFrame{
    private JTextField NombreRecibido;
    private JTextField ContrasenaRecibido;
    private JButton BotonGuardar;

    public SwingVerInicioSesion(){
        setTitle("Inicio de Sesion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel PanelPrincipal = new JPanel();
        PanelPrincipal.setLayout(new BoxLayout(PanelPrincipal, BoxLayout.Y_AXIS));
        PanelPrincipal.setBorder(new EmptyBorder(10, 40, 30, 40));

        JPanel PanelInstrucciones = new JPanel();
        PanelInstrucciones.setLayout(new BoxLayout(PanelInstrucciones, BoxLayout.Y_AXIS));
        PanelInstrucciones.setBorder(new EmptyBorder(10, 40, 30, 40));
        JLabel NombrePrograma = new JLabel("MATE DUO");
        JLabel TituloInstruccionesInicioSesion = new JLabel("Para crear un usuario:");
        JLabel InstruccionesInicioSesion = new JLabel("Ingrese un nombre y una contrasena de 6 caracteres o mas");
        NombrePrograma.setAlignmentX(Component.CENTER_ALIGNMENT);
        TituloInstruccionesInicioSesion.setAlignmentX(Component.CENTER_ALIGNMENT);
        InstruccionesInicioSesion.setAlignmentX(Component.CENTER_ALIGNMENT);
        PanelInstrucciones.add(NombrePrograma);
        PanelInstrucciones.add(TituloInstruccionesInicioSesion);
        PanelInstrucciones.add(InstruccionesInicioSesion);
        PanelPrincipal.add(PanelInstrucciones);

        JPanel PanelDatos = new JPanel();
        PanelDatos.setLayout(new GridLayout(2,2,10,10));

        JLabel EtiquetaNombre = new JLabel("Nombre:");
        NombreRecibido = new JTextField(15);
        NombreRecibido.setMaximumSize(getPreferredSize());
        JLabel EtiquetaContrasena = new JLabel("Contrasena:");
        ContrasenaRecibido = new JTextField(15);
        ContrasenaRecibido.setMaximumSize(getPreferredSize());

        PanelDatos.add(EtiquetaNombre);
        PanelDatos.add(NombreRecibido);
        PanelDatos.add(EtiquetaContrasena);
        PanelDatos.add(ContrasenaRecibido);

        BotonGuardar = new JButton("Guardar");

        PanelPrincipal.add(PanelDatos);
        PanelPrincipal.add(Box.createVerticalStrut(20));
        PanelPrincipal.add(BotonGuardar);

        add(PanelPrincipal);
        pack();
        setLocationRelativeTo(null);

    }

    public String obtenerNombre(){
        return NombreRecibido.getText().trim();
    }
    public String obtenerContrasena(){
        return ContrasenaRecibido.getText().trim();
    }

    public void presionarGuardar(ActionListener accion) {
        BotonGuardar.addActionListener(accion);
    }

    public void mostrarMensajeExito(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Exito", JOptionPane.INFORMATION_MESSAGE);
    }
    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public boolean confirmarNombre(String nombre) {
        int respuesta = JOptionPane.showConfirmDialog(
            this,
            "¿El nombre \"" + nombre + "\" es correcto?",
            "Confirmar nombre",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        return respuesta == JOptionPane.YES_OPTION;
    }

    public void cerrarVentanaInicioDeSesion() {
        dispose();
    }
}
