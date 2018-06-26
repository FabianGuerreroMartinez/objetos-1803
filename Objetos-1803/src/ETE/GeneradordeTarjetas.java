package ETE;
import java.util.*;
public class GeneradordeTarjetas {
    
    private ArrayList <Cliente> clientes;

    public ArrayList <Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList <Cliente> clientes) {
        this.clientes = clientes;
    }
    public GeneradordeTarjetas(){
        clientes=new ArrayList<>();
       
        clientes.add(new Cliente ("Juan", new Tarjeta(1234,"Banamex", 32000)));
        clientes.add(new Cliente ("HSBC", new Tarjeta(5378,"HSBC", 17500)));
        clientes.add(new Cliente ("Pedro", new Tarjeta(8765,"Sestra", 19600)));
        clientes.add(new Cliente ("Irma", new Tarjeta(4321,"Bancomer", 48000)));
        
    }
    
    
}
