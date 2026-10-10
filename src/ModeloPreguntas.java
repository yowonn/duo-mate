public class ModeloPreguntas {
    
  
    public String[] Modulo1_Factorizacion(){
        String[] M1_p1 = new String[6];
        M1_p1[0] = "\n(a + b)(a^2) - a^2"; //Pregunta
        M1_p1[1] = "\n(-1)(-a^2 - b + 1)"; //Opcion 1
        M1_p1[2] = "\n(b -1)(a)"; //Opcion 2
        M1_p1[3] = "\n(a^2)(a + b - 1)"; //Opcion 3
        M1_p1[4] = "\n(1 - a)(b + a)"; //Opcion 4
        M1_p1[5] = "\n(a^2)(a + b -1)"; //Respuesta correcta

        return M1_p1;
    }

    public String[] Modulo1_RACIONALIZACION(){
        String[] M1_p2 = new String[6];
        M1_p2[0] = "\n56/√(2)"; //Pregunta
        M1_p2[1] = "\n56/2"; //Opcion 1
        M1_p2[2] = "\n(56)(√2)/√(2)"; //Opcion 2
        M1_p2[3] = "\n(a^2)(a + b - 1)"; //Opcion 3
        M1_p2[4] = "\n(28)(√2)"; //Opcion 4
        M1_p2[5] = "\n(28)(√2)/2"; //Respuesta correcta
        return M1_p2;
    }

    public String[] Modulo1_ECUACION_RECTA(){
        String[] M1_p2 = new String[6];
        M1_p2[0] = "\ny = mx + 2b"; //Pregunta CUAL ES LA PENDIENTE DE LA RECTA
        M1_p2[1] = "\nm"; //Opcion 1
        M1_p2[2] = "\n2"; //Opcion 2
        M1_p2[3] = "\nx"; //Opcion 3
        M1_p2[4] = "\nb"; //Opcion 4
        M1_p2[5] = "\ny"; //Respuesta correcta
        return M1_p2;
    }

    public String[] Modulo1_TRANSFORMACIONES_f(){
        String[] M1_p2 = new String[6];
        M1_p2[0] = "\nf(x) = m(x+2) + b"; //Pregunta QUE TRASNFORMACION HACE EL +2
        M1_p2[1] = "\nSe desplaza 2 en x, hacia la derecha"; //Opcion 1
        M1_p2[2] = "\nSe desplaza 2 en x, hacia la izquierda"; //Opcion 2
        M1_p2[3] = "\nSe desplaza 2 en y, hacia arriba"; //Opcion 3
        M1_p2[4] = "\nSe desplaza 2 en y, hacia abajo"; //Opcion 4
        M1_p2[5] = "\nSe desplaza 2 en x, hacia la izquierda"; //Respuesta correcta
        return M1_p2;
    }
    
    public String[] Modulo2_DOMINIOS_f(){
        String[] M2_p2 = new String[6];
        M2_p2[0] = "\nf(x) = (5x^2 -2x + 1) / x"; //Pregunta: Cual es el dominio de la funcion
        M2_p2[1] = "\nD = R "; //Opcion 1
        M2_p2[2] = "\nD = R - {5}"; //Opcion 2
        M2_p2[3] = "\nD = 5x -2"; //Opcion 3
        M2_p2[4] = "\nD = R - {0}"; //Opcion 4
        M2_p2[5] = "\nD = R - {0}"; //Respuesta correcta
        return M2_p2;
    }

    public String[] Modulo2_RANGO_f(){
        String[] M2_p2 = new String[6];
        M2_p2[0] = "\nf(x) = x^2 + 4x - 10"; //Pregunta: Rango de la función
        M2_p2[1] = "\nRango: (-4, -∞)"; //Opcion 1
        M2_p2[2] = "\nRango: [-14, +∞) "; //Opcion 2
        M2_p2[3] = "\nRango: (-14, +∞)"; //Opcion 3
        M2_p2[4] = "\nRango: [-14, -∞)"; //Opcion 4
        M2_p2[5] = "\nRango: [-14, +∞)"; //Respuesta correcta
        return M2_p2;
    }

    public String[] Modulo2_RAICEZ_NUM_i_f(){
        String[] M2_p2 = new String[6];
        M2_p2[0] = "\ny = √(-9)"; //pregunta
        M2_p2[1] = "\ny = 3i"; //Opcion 1
        M2_p2[2] = "\ny = -3"; //Opcion 2
        M2_p2[3] = "\ny = 3"; //Opcion 3
        M2_p2[4] = "\ny = -3i"; //Opcion 4
        M2_p2[5] = "\ny = 3i"; //Respuesta correcta
        return M2_p2;
    }




}
