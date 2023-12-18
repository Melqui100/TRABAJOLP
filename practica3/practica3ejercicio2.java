package practica3;
/**
 * practica5
 * @author Melqui Nuñez 
 * 
 * 
*/
import java.util.Scanner;

//
public class practica3ejercicio2 {
    public static void main(String[] args) {
       //variables
        Scanner scanner = new Scanner (System.in);
        int tabla,result;
        //Entrada
        System.out.println("Que tabla que seas Mostrar?"); 
        tabla = scanner.nextInt();
    //bucle
        for (int i = 1; i < 11; i++) {
    result= tabla * i;
    System.out.println(tabla + "X"+i+ "="+ result);
 
}
 
 scanner.close();
    }
}