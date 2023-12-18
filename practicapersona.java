import java.util.Scanner;

public class practicapersona {
private Scanner scanner;
private String nombre;
private int edad;
public  void inicializar () {
scanner = new Scanner(System.in);
 System.out.println("Ingrese nombre");
 nombre= scanner.nextLine();
  System.out.println("Digite edad");
  edad= scanner.nextInt();   
}

public  void imprimir () {
    System.out.println("Nombre ingresado= " + nombre);
      System.out.println("Edad digitado= " + edad);
      
    
}
 public  void buscamayor() {
    if (edad >= 18) {
        System.out.println(nombre + "es mayor de edad.");
} else {
     System.out.println(nombre + " es menor  de edad.");
}
 }
 public static void main(String[] args) {
   practicapersona practicapersona = new practicapersona();
    practicapersona.inicializar();
    practicapersona.imprimir ();
    practicapersona.buscamayor();
 }
}