public class ControlMenu {
    private VerMenuPrincipal VerMenuPrincipal1;
    private Preguntas Preguntas1;
    private ControlProgreso ControlProgreso1;

    public ControlMenu(Estudiante EstudianteActivo){
        VerMenuPrincipal1 = new VerMenuPrincipal();
        Preguntas1 = new Preguntas(EstudianteActivo);
        ControlProgreso1 = new ControlProgreso(EstudianteActivo);
    }

    public void elegirTema(){
        Integer TemaSeleccionado = -1;
        while(TemaSeleccionado != 0){
            boolean VerificadorTema = false;

            while(VerificadorTema == false){
                VerMenuPrincipal1.mostrarTemas();
                TemaSeleccionado = VerMenuPrincipal1.seleccionarTema();

                switch(TemaSeleccionado){
                    case 0:
                    //Aqui crear metodo para mensaje para cuando cierre sesion
                        VerificadorTema = true;
                        break;
                    case 1:
                        VerificadorTema = true;
                        ControlProgreso1.presentarEstadisticas();
                        break;
                    case 2:
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
}
