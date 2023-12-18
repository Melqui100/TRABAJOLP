package practica4;

/**
 * Banco
 */
public class Banco {

}
public Banco(Cliente cliente1, Cliente cliente2, Cliente cliente3) {
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
        this.cliente3 = cliente3;
    }
private Cliente cliente1, cliente2,cliente3 ;

// costructor
    public banco (){
cliente1 = new Cliente("Pablo");
cliente2 = new Cliente( "Julia") ;
cliente3 = new Cliente("Sofia") ;
    }
    public  void operar() {
        cliente1.depositar(50000);
        cliente2.depositar(15000);
        cliente3.depositar(250000);

    }
    public void mostrartotalclientes () {
    System.out.println("Total del cliente, " + cliente1 .retornarnombre()+ "=" + cliente1.retornarmonto());
     System.out.println("Total del cliente, " + cliente2 .retornarnombre()+ "=" + cliente2.retornarmonto());
      System.out.println("Total del cliente, " + cliente3 .retornarnombre()+ "=" + cliente3.retornarmonto());
    }
     public void mostrartotalbanco () {
        int Total = cliente1.retornarmonto()+ cliente2.retornarmonto()+ cliente3.retornarmonto();
        System.out.println("total del banco: "+ Total) ;
     }
public static void main (String [] args) {
    Banco banco = new Banco ();
    banco.operar();
    banco.mostrartotalclientes();
}
}