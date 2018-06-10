package Abstraccion2;

public class Conversion2 {
    private Masa masa;

public float AlturayPeso(){
        float altura = 0;
    //Este metodo tiene logica
    float resultado= masa.getPeso () *altura*altura;
    return resultado;
    
}

    void setMasa(Masa m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}