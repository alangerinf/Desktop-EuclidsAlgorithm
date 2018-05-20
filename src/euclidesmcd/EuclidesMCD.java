/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidesmcd;

import java.time.LocalTime;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class EuclidesMCD {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner   e =new Scanner(System.in);
        System.out.println("Euclides");
        long mayor;
        long menor;
        System.out.println("Ingrese num : ");
        mayor = e.nextLong();
        System.out.println("Ingrese segundo num :");
        menor = e.nextLong();
        long mdc =obtener_mcd(mayor, menor);
        System.out.println("el mcd es: "+mdc);
    }
    static long obtener_mcd(long a,long b) throws InterruptedException{
        long temp;
        
     
        if(b>a){
            temp =a;
            a = b;
            b = temp;
        }
        LocalTime time = LocalTime.now();
        Long horaIni = time.toNanoOfDay();
        
        long res = MCD(a,b);
        
        time = LocalTime.now();
        long horaFin =time.toNanoOfDay();
        System.out.println("Tiempo en milisegundos : "+(horaFin-horaIni));
        return res;
    }
    
    static long MCD(long may,long men) throws InterruptedException{
        System.out.println("MDC("+may+","+men+")");
        if(men==0){
            return may;
        }else{
            return MCD(men,may%men);
        }
        
    }
    
    
}
