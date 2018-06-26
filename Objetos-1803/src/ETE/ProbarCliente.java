package ETE;

public class ProbarCliente {
    public static void main(String[] args) {
        for(Cliente c:new GeneradordeTarjetas().getClientes()){
        System.out.println(c);
    }
    }
    
}
