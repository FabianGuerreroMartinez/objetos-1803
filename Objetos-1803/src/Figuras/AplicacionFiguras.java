package Figuras;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AplicacionFiguras {
    public static void main(String[] args) {
        try {
            Cuadrado c=new Cuadrado();
            ValidarValores.validarNoNegativo(4);
            c.setLado(4);
            Calculos cal=new Calculos();
            System.out.println(cal.calcularArea(c));
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
