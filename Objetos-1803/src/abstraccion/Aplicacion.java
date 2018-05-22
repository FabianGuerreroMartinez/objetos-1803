/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-101
 */
public class Aplicacion {
    public static void main(String[] args) {
        //Crear un objeto de tipo grados
        Grados g=new Grados();
        g.setcentigrados(20);
        Conversion c=new Conversion ();
    c.setGrados(g);
    
        System.out.println(c.centigradosAFarenheit());
    }
    
}
