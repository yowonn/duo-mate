
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class SwingVerMenuPrincipal extends JFrame {

    private JButton BotonCerrarSesion;
    private JButton BotonProgreso;
    private JButton BotonTema1;
    private JButton BotonTema2;
    private JButton BotonTema3;
    private JButton BotonTema4;

    public SwingVerMenuPrincipal() {

        setTitle("Duo-Mate - Menu Principal");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);


        JPanel PanelPrincipal = new JPanel(new GridBagLayout());
        PanelPrincipal.setBackground(DisenoMenuPrincipal.fondo);
        PanelPrincipal.setBorder(new EmptyBorder(25, 25, 25, 25));


        JPanel Contenedor = new JPanel(new BorderLayout(0, 25));
        Contenedor.setBackground(DisenoMenuPrincipal.fondo);
        Contenedor.setPreferredSize(new Dimension(950, 680));

    
        JPanel PanelEncabezado = new JPanel(new BorderLayout(15, 0));
        PanelEncabezado.setBackground(DisenoMenuPrincipal.oscuro);
        PanelEncabezado.setBorder(new EmptyBorder(15, 15, 15, 15));
        PanelEncabezado.setPreferredSize(new Dimension(950, 85));

        BotonProgreso = new JButton("Progreso");
        BotonCerrarSesion = new JButton("Cerrar sesion");

        DisenoMenuPrincipal.disenarBoton(BotonProgreso);
        DisenoMenuPrincipal.disenarBoton(BotonCerrarSesion);


        JLabel Titulo = new JLabel("DUO-MATE", SwingConstants.CENTER);
        Titulo.setFont(new Font("Arial", Font.BOLD, 25));
        Titulo.setForeground(Color.WHITE);

        PanelEncabezado.add(BotonProgreso, BorderLayout.WEST);
        PanelEncabezado.add(Titulo, BorderLayout.CENTER);
        PanelEncabezado.add(BotonCerrarSesion, BorderLayout.EAST);

        
        JPanel PanelContenido = new JPanel();
        PanelContenido.setLayout(
            new BoxLayout(PanelContenido, BoxLayout.Y_AXIS)
        );
        PanelContenido.setBackground(DisenoMenuPrincipal.fondo);


        JLabel TituloTemas = new JLabel("Temas disponibles");
        DisenoMenuPrincipal.disenarTitulo(TituloTemas);

        JLabel Subtitulo = new JLabel(
            "Selecciona un tema para comenzar"
        );
        DisenoMenuPrincipal.disenarTexto(Subtitulo);

        JPanel PanelTitulos = new JPanel();
        PanelTitulos.setLayout(
            new BoxLayout(PanelTitulos, BoxLayout.Y_AXIS)
        );
        PanelTitulos.setBackground(DisenoMenuPrincipal.fondo);
        PanelTitulos.setAlignmentX(Component.CENTER_ALIGNMENT);

        TituloTemas.setAlignmentX(Component.CENTER_ALIGNMENT);
        Subtitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        PanelTitulos.add(TituloTemas);
        PanelTitulos.add(Box.createVerticalStrut(10));
        PanelTitulos.add(Subtitulo);

        PanelContenido.add(PanelTitulos);
        PanelContenido.add(Box.createVerticalStrut(20));

        
        JPanel PanelTemas = new JPanel(
            new GridLayout(2, 2, 20, 20)
        );
        PanelTemas.setBackground(DisenoMenuPrincipal.fondo);
        PanelTemas.setPreferredSize(new Dimension(950, 500));

        BotonTema1 = new JButton("Comenzar Tema 1");
        BotonTema2 = new JButton("Comenzar Tema 2");
        BotonTema3 = new JButton("Comenzar Tema 3");
        BotonTema4 = new JButton("Comenzar Tema 4");

        PanelTemas.add(crearTema(
            "Tema 1",
            "Algebra basica",
            "Factorizacion, racionalizacion, rectas y transformaciones",
            BotonTema1
        ));

        PanelTemas.add(crearTema(
            "Tema 2",
            "Funciones",
            "Dominio, rango, asintotas y numeros imaginarios",
            BotonTema2
        ));

        PanelTemas.add(crearTema(
            "Tema 3",
            "Logaritmos y exponenciales",
            "Logaritmos, exponenciales e interes compuesto",
            BotonTema3
        ));

        PanelTemas.add(crearTema(
            "Tema 4",
            "Trigonometria",
            "Circunferencia, seno, coseno y tangente",
            BotonTema4
        ));

        JPanel PanelCentro = new JPanel(new GridBagLayout());
        PanelCentro.setBackground(DisenoMenuPrincipal.fondo);
        PanelCentro.setAlignmentX(Component.CENTER_ALIGNMENT);

        PanelCentro.add(PanelTemas);

        PanelContenido.add(PanelCentro);

        Contenedor.add(PanelEncabezado, BorderLayout.NORTH);
        Contenedor.add(PanelContenido, BorderLayout.CENTER);

        PanelPrincipal.add(Contenedor);

        add(PanelPrincipal);

        setSize(1100, 850);
        setMinimumSize(new Dimension(1050, 820));
        setLocationRelativeTo(null);
    }

    private JPanel crearTema(String numero, String nombre,
                             String descripcion, JButton boton) {

        JPanel Tarjeta = DisenoMenuPrincipal.crearTarjeta();

        Tarjeta.setLayout(
            new BoxLayout(Tarjeta, BoxLayout.Y_AXIS)
        );

        JLabel TituloTema = new JLabel(numero);
        DisenoMenuPrincipal.disenarTitulo(TituloTema);
        TituloTema.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel NombreTema = new JLabel(nombre);
        DisenoMenuPrincipal.disenarTexto(NombreTema);
        NombreTema.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel Descripcion = new JLabel(
            "<html><div style='text-align:center; width:230px;'>"
            + descripcion + "</div></html>"
        );

        Descripcion.setForeground(DisenoMenuPrincipal.oscuro);
        Descripcion.setFont(new Font("Arial", Font.PLAIN, 14));
        Descripcion.setAlignmentX(Component.CENTER_ALIGNMENT);

        DisenoMenuPrincipal.disenarBoton(boton);
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);

        Tarjeta.add(TituloTema);
        Tarjeta.add(Box.createVerticalStrut(10));
        Tarjeta.add(NombreTema);
        Tarjeta.add(Box.createVerticalStrut(15));
        Tarjeta.add(Descripcion);
        Tarjeta.add(Box.createVerticalGlue());
        Tarjeta.add(boton);

        return Tarjeta;
    }

    public void presionarCerrarSesion(ActionListener accion) {
        BotonCerrarSesion.addActionListener(accion);
    }


    public void presionarProgreso(ActionListener accion) {
        BotonProgreso.addActionListener(accion);
    }

    public void presionarTema1(ActionListener accion) {
        BotonTema1.addActionListener(accion);
    }

    public void presionarTema2(ActionListener accion) {
        BotonTema2.addActionListener(accion);
    }

    public void presionarTema3(ActionListener accion) {
        BotonTema3.addActionListener(accion);
    }

    public void presionarTema4(ActionListener accion) {
        BotonTema4.addActionListener(accion);
    }

    public boolean confirmarCerrarSesion() {
        return DisenoMensajes.confirmar(
            this,
            "Cerrar sesión",
            "¿Estás seguro de que deseas cerrar sesión?"
        );
    }

    public void cerrarVentanaMenuPrincipal() {
        dispose();
    }

    public void presionarCerrarPrograma(
        java.awt.event.WindowListener accion
    ) {
        addWindowListener(accion);
    }

    public boolean confirmarCerrarPrograma() {
        return DisenoMensajes.confirmar(
            this,

            "Confirmar salida",
            "Tu progreso podría no guardarse.\n"
            + "Para conservarlo, utiliza Cerrar sesión.\n"
            + "¿Estás seguro de que deseas salir?"
        );
        
    }

}
