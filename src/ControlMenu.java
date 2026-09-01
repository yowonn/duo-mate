public class ControlMenu {
    private VerMenuPrincipal VerMenuPrincipal1;
    private Preguntas Preguntas1;

    public ControlMenu(){
        VerMenuPrincipal1 = new VerMenuPrincipal();
        Preguntas1 = new Preguntas();
    }

    public void elegirTema(){
        boolean VerificadorTema = false;

        while(VerificadorTema == false){
            VerMenuPrincipal1.mostrarTemas();
            int TemaSeleccionado = VerMenuPrincipal1.seleccionarTema();

            switch(TemaSeleccionado){
                case 1:
                    VerificadorTema = true;
                    Preguntas1.Preguntas_Factorizacion();
                    break;

                default:
                    VerMenuPrincipal1.errorTema();
                    break;
            }
        }
    }
}
