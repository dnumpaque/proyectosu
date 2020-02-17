/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taylor;
import java.util.Scanner;

/**
 *
 * @author DIEGO NUMPAQUE
 */
public class Taylor {

       public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        double sen=0;
        double x;
        int numero;    
        
        
        System.out.println("Ingrese la base:");         
        x = Double.parseDouble(ingreso.nextLine());    
        System.out.println("Ingrese el numero de terminos:");      
        numero = Integer.parseInt(ingreso.nextLine()); 


        int i=1;
        while(i<=numero){
        int fact = 1;
        int j=1;
        while(j<=(1+(2*(i-1)))){
        fact= fact*j;j++;
        }

        if(i%2==0)
        sen = sen - (Math.pow(x,(1+(2*(i-1)))) /fact);
        else
        sen = sen + (Math.pow(x,(1+(2*(i-1)))) /fact);
        i++;
        }

        System.out.println("El seno de: " +x+ " es " +sen);

    }

}
