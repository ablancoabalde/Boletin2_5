
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
   
        float milla;
       
        System.out.println("Introduzca millas para pasarla a metros");
        Scanner entradamillas = new Scanner (System.in);
        
        milla= entradamillas.nextFloat();
        System.out.println(milla + " son tantos " + milla*1852 + " metros");
        
    }
    
}
