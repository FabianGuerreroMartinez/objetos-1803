package Figuras;

public class Calculos {
    public String calcularArea(Cuadrado c){
        float area=c.getLado()*c.getLado();
        return "El area es "+area;
    }
    public String calcularPerimetro (Cuadrado c){
        float perimetro= 4*c.getLado();
        return "El perimetro es "+perimetro;
    }
}
