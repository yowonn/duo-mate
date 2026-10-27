public class ModeloPreguntas {
    

    public String[] Modulo1_Factorizacion(){
        String[] M1_p1 = new String[6];
        M1_p1[0] = "\nFactorizar: \n(a + b)(a^2) - a^2"; //Pregunta
        M1_p1[1] = "\n(-1)(-a^2 - b + 1)"; //Opcion 1
        M1_p1[2] = "\n(b -1)(a)"; //Opcion 2
        M1_p1[3] = "\n(a^2)(a + b - 1)"; //Opcion 3
        M1_p1[4] = "\n(1 - a)(b + a)"; //Opcion 4
        M1_p1[5] = "3"; //Respuesta correcta

        return M1_p1;
    }

    public String[] Modulo1_RACIONALIZACION(){
        String[] M1_p2 = new String[6];
        M1_p2[0] = "\nRacionalizar: \n56/√(2)"; //Pregunta
        M1_p2[1] = "\n56/2"; //Opcion 1
        M1_p2[2] = "\n(56)(√2)/√(2)"; //Opcion 2
        M1_p2[3] = "\n(a^2)(a + b - 1)"; //Opcion 3
        M1_p2[4] = "\n(28)(√2)/2"; //Opcion 4
        M1_p2[5] = "4"; //Respuesta correcta
        return M1_p2;
    }

    public String[] Modulo1_ECUACION_RECTA(){
        String[] M1_p2 = new String[6];
        M1_p2[0] = "\n¿Cual es la pendiente de la curva en la siguiente expresion?: \ny = mx + 2b"; //Pregunta CUAL ES LA PENDIENTE DE LA RECTA
        M1_p2[1] = "\nm"; //Opcion 1
        M1_p2[2] = "\n2"; //Opcion 2
        M1_p2[3] = "\nx"; //Opcion 3
        M1_p2[4] = "\nb"; //Opcion 4
        M1_p2[5] = "1"; //Respuesta correcta
        return M1_p2;
    }

    public String[] Modulo1_TRANSFORMACIONES_f(){
        String[] M1_p2 = new String[6];
        M1_p2[0] = "\n¿Que transformación provoca el +2?: \nf(x) = m(x+2) + b"; //Pregunta QUE TRASNFORMACION HACE EL +2
        M1_p2[1] = "\nSe desplaza 2 en x, hacia la derecha"; //Opcion 1
        M1_p2[2] = "\nSe desplaza 2 en x, hacia la izquierda"; //Opcion 2
        M1_p2[3] = "\nSe desplaza 2 en y, hacia arriba"; //Opcion 3
        M1_p2[4] = "\nSe desplaza 2 en y, hacia abajo"; //Opcion 4
        M1_p2[5] = "2"; //Respuesta correcta
        return M1_p2;
    }
    
    public String[] Modulo2_DOMINIOS_f(){
        String[] M2_p2 = new String[6];
        M2_p2[0] = "\nDominio de la siguiente función: \nf(x) = (5x^2 -2x + 1) / x"; //Pregunta: Cual es el dominio de la funcion
        M2_p2[1] = "\nD = R "; //Opcion 1
        M2_p2[2] = "\nD = R - {5}"; //Opcion 2
        M2_p2[3] = "\nD = 5x -2"; //Opcion 3
        M2_p2[4] = "\nD = R - {0}"; //Opcion 4
        M2_p2[5] = "4"; //Respuesta correcta
        return M2_p2;
    }

    public String[] Modulo2_RANGO_f(){
        String[] M2_p2 = new String[6];
        M2_p2[0] = "\n¿Cual es el rango de la funcion?: \nf(x) = x^2 + 4x - 10"; //Pregunta: Rango de la función
        M2_p2[1] = "\nRango: (-4, -∞]"; //Opcion 1
        M2_p2[2] = "\nRango: [-14, +∞) "; //Opcion 2
        M2_p2[3] = "\nRango: [-14, +∞]"; //Opcion 3
        M2_p2[4] = "\nRango: [-14, +∞]"; //Opcion 4
        M2_p2[5] = "2"; //Respuesta correcta
        return M2_p2;
    }

    public String[] Modulo2_Asintota_f(){
        String[] M2_p2 = new String[6];
        M2_p2[0] = "\n¿Cual es la asintota vertical de la funcion?: \nf(x) = 1/x-2"; //Pregunta: Rango de la función
        M2_p2[1] = "\nx = 2"; //Opcion 1
        M2_p2[2] = "\nx = -2"; //Opcion 2
        M2_p2[3] = "\nx = 0"; //Opcion 3
        M2_p2[4] = "\nx = 1"; //Opcion 4
        M2_p2[5] = "1"; //Respuesta correcta
        return M2_p2;
    }

    public String[] Modulo2_RAICEZ_NUM_i_f(){
        String[] M3_p2 = new String[6];
        M3_p2[0] = "\n¿a que es equivalente la siguiente expresion?: \ny = √(-9)"; //pregunta
        M3_p2[1] = "\ny = 3i"; //Opcion 1
        M3_p2[2] = "\ny = -3"; //Opcion 2
        M3_p2[3] = "\ny = 3"; //Opcion 3
        M3_p2[4] = "\ny = -3i"; //Opcion 4
        M3_p2[5] = "1"; //Respuesta correcta
        return M3_p2;
    }

    public String[] Modulo3_Logaritmos(){
        String[] M2_p2 = new String[6];
        M2_p2[0] = "\n¿a que es equivalente la siguiente expresion?: \nln( e^(2x+20) )"; //pregunta
        M2_p2[1] = "\n2x-20"; //Opcion 1
        M2_p2[2] = "\n20-2x"; //Opcion 2
        M2_p2[3] = "\ne^(2x)"; //Opcion 3
        M2_p2[4] = "\n2x+20"; //Opcion 4
        M2_p2[5] = "4"; //Respuesta correcta
        return M2_p2;
    }

    public String[] Modulo3_Dom_Range_f_log(){
        String[] M3_p2 = new String[6];
        M3_p2[0] = "\nDominio y rango de f(x): \nf(x) = ln(2x) - 1"; //pregunta: DOMINO Y RANGO DE LA FUNCIÓN
        M3_p2[1] = "\nD: (0,∞) ; R: (0, ∞]"; //Opcion 1
        M3_p2[2] = "\nD: (0,∞) ; R: (-∞, ∞)"; //Opcion 2
        M3_p2[3] = "\nD: [0,∞) ; R: [-∞, ∞]"; //Opcion 3
        M3_p2[4] = "\nD: (1,∞) ; R: (-∞, ∞)"; //Opcion 4
        M3_p2[5] = "2"; //Respuesta correcta
        return M3_p2;
    }

    public String[] Modulo3_Probabilidad(){
        String[] M3_p2 = new String[6];
        M3_p2[0] = "\nFormula para interes compuesto, por capitalizacion continua"; //pregunta
        M3_p2[1] = "\nm(t) = m0 * e^(-rt)"; //Opcion 1
        M3_p2[2] = "\nT = A + B * e^(-kt)"; //Opcion 2
        M3_p2[3] = "\nA = p * e^(rt)"; //Opcion 3
        M3_p2[4] = "\nA = p * (1-r/n)^(n*t)"; //Opcion 4
        M3_p2[5] = "3"; //Respuesta correcta
        return M3_p2;
    }

    public String[] Modulo3_Exponencial(){
        String[] M3_p2 = new String[6];
        M3_p2[0] = "\nEvalue f(2) si f(x)=3^x"; //pregunta
        M3_p2[1] = "9"; //Opcion 1
        M3_p2[2] = "6"; //Opcion 2
        M3_p2[3] = "27"; //Opcion 3
        M3_p2[4] = "8"; //Opcion 4
        M3_p2[5] = "1"; //Respuesta correcta
        return M3_p2;
    }

    public String[] Modulo4_Trigonometrica_circulo(){
        String[] M4_p1 = new String[6];
        M4_p1[0] = "\nQue ecuación describe un circulo de radio 1"; //pregunta
        M4_p1[1] = "x^2 + y^2 = 1"; //Opcion 1
        M4_p1[2] = "x^2 - y^2 = 0"; //Opcion 2
        M4_p1[3] = "x^2 - y^2 = 1"; //Opcion 3
        M4_p1[4] = "x^2 + y^2 = 0"; //Opcion 4
        M4_p1[5] = "1"; //Respuesta correcta
        return M4_p1;
    }

    public String[] Modulo4_Trigonometrica_sin(){
        String[] M4_p1 = new String[6];
        M4_p1[0] = "\nComo se restringe la función y = senθ  para que sea uno a uno"; //pregunta
        M4_p1[1] = " π/2 ≤ θ ≤ π"; //Opcion 1
        M4_p1[2] = "0 ≤ θ ≤ π"; //Opcion 2
        M4_p1[3] = "-π/2 ≤ θ ≤ π/2"; //Opcion 3
        M4_p1[4] = "-π ≤ θ ≤ π"; //Opcion 4
        M4_p1[5] = "3"; //Respuesta correcta
        return M4_p1;
    }

    public String[] Modulo4_Trigonometrica_cos(){
        String[] M4_p1 = new String[6];
        M4_p1[0] = "\nComo se restringe la función y = cosθ  para que sea uno a uno"; //pregunta
        M4_p1[1] = " π/2 ≤ θ ≤ π"; //Opcion 1
        M4_p1[2] = "0 ≤ θ ≤ π"; //Opcion 2
        M4_p1[3] = "-π/2 ≤ θ ≤ π/2"; //Opcion 3
        M4_p1[4] = "-π ≤ θ ≤ π"; //Opcion 4
        M4_p1[5] = "2"; //Respuesta correcta
        return M4_p1;
    }

    public String[] Modulo4_Trigonometrica_tan(){
        String[] M4_p1 = new String[6];
        M4_p1[0] = "\nComo se restringe la función y = tanθ  para que sea uno a uno"; //pregunta
        M4_p1[1] = " π/2 ≤ θ ≤ π"; //Opcion 1
        M4_p1[2] = "0 ≤ θ ≤ π"; //Opcion 2
        M4_p1[3] = "-π/2 ≤ θ ≤ π/2"; //Opcion 3
        M4_p1[4] = "-π ≤ θ ≤ π"; //Opcion 4
        M4_p1[5] = "3"; //Respuesta correcta
        return M4_p1;
    }



}
