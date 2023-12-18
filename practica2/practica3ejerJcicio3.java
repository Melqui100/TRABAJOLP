package practica2;
/**
 * practica5
 * @author Melqui Nuñez
 * 
 * 
*/
import java.util.Scanner;

public class practica3ejerJcicio3 {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner (System.in); 
   String caracter;
   System.out.println("Programa java condicional String");
   System.out.println("Tipee un caracter:");
    caracter = Scanner .nextLine();
    if (caracter.length() != 1 ) {
       System.out.println("El caracter no existe!"); 
    }else if ((caracter.compareTo("A") >=0) && (caracter.compareTo("Z") <= 0)) {
      System.out.println("El caracter es una mayuscula!");  
    } else {
        System.out.println("El caracter no es una mayuscula!");


 }
  Scanner.close();
}

}