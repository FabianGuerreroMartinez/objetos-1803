package Genericos;

import java.util.ArrayList;

public class AplicacionPregunta {
    
    public static void main(String[] args){
        Opcion o11=new Opcion();
        o11.setTitulo("Mizcalco");
        o11.setCorrecta(false);
        
        Opcion o21=new Opcion();
        o21.setTitulo("Texcoco");
        o21.setCorrecta(false);
        
        Opcion o31=new Opcion();
        o31.setTitulo("Madrid");
        o31.setCorrecta(true);
        
        Opcion o41=new Opcion();
        o41.setTitulo("Ecatepec");
        o41.setCorrecta(false);
    //Sigue Pregunta
    Pregunta p1=new Pregunta();
    p1.setTitulo("¿Cual es la Capital de España?");
    ArrayList<Opcion> opcionesp1=new ArrayList<>();
    opcionesp1.add(o11);
    opcionesp1.add(o21);
    opcionesp1.add(o31);
    opcionesp1.add(o41);
    
    p1.setOpciones(opcionesp1);
    
    Cuestionario c1=new Cuestionario();
    ArrayList<Pregunta> preguntas=new ArrayList<>();
    preguntas.add(p1);
    c1.setPreguntas(preguntas);
    
    for(Pregunta p:preguntas){
        System.out.println(p.getTitulo());
        
    }
    }
}
