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



}
