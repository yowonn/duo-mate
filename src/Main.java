public class Main {
    public static void main(String[] args) {
        ControlEstudiante ControlEstudiante1 = new ControlEstudiante();
        Estudiante EstudianteActivo = ControlEstudiante1.registroEstudiante();

        ControlMenu ControlMenu1 = new ControlMenu(EstudianteActivo);
        ControlMenu1.elegirTema();
    }
}
