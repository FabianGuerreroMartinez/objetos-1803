/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;
public class Aplicacion {
public static void main(String[] args) throws Exception{

Cliente c=Persistenciausuario.leer();
    System.out.println("Vamos a checar el nombre "+c.getNombre());
  /*
Cliente c=new Cliente();
c.setNombre("Becky");
c.setEdad(4);
Persistenciausuario.guardar(c);
*/
}   
}
