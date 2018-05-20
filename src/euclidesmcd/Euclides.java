/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package euclidesmcd;

/**
 *
 * @author InfoLabA-PC04
 */
import java.util.Scanner;

public class Euclides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ALGORITMO EUCLIDES");
        System.out.println("=====================");
        Scanner e = new Scanner(System.in);
        System.out.print(" ==> Ingrese primer numero : ");
        long num1 =   e.nextLong();
        System.out.print(" ==> Ingrese segundo numero: ");
        long num2 =   e.nextLong();
        System.out.println(" *********************************************");
        System.out.println("         ===>Algoritmo Euclides 1 <===");
        System.out.println("Respuesta Euclides1  =   "+ (mdc(num1,num2,0)));
        System.out.println(" *********************************************");
        System.out.println("          ===>Algoritmo Euclides 2 <===");
        System.out.println("Respuesta Euclides2  =   "+ (mdc(num1,num2,1)));
        System.out.println(" *********************************************");
        System.out.println("     ===>Algoritmo Euclides Extendido <===");
         System.out.println("Respuesta Euclides Extendido  =   "+ (mdc(num1,num2,2)));
        
    }
    
    static long mdc(long a,long b,int i){
        
        long temp;
        a =(a>0)?a:a-a-a;
        b =(b>0)?b:b-b-b;
        
        if(b>a){
            temp = a;
            a=b;
            b= temp;
        }
        System.out.println("***********************************************");
        //long res = euclides(a,b);
        long res=0;
        
        Long hIni = System.currentTimeMillis();
        switch(i){
            case 0:
                res = euclides1(a, b);
                break;
            case 1:
                res = euclides2(a, b);
                break;
            case 2:
                res = euextend(a, b);
                break;
        }
        Long hFin = System.currentTimeMillis();
        System.out.println(" ===> Tiempo : "+(hFin-hIni));
        return res;
    }
            
    static long euclides1(long a, long b){
       int i=0;  
            i++;
            System.out.println(" ==> iteracion :"+i);
            System.out.println("                a="+a+", b="+b);
        long r;
        while(b!=0){
            i++;
            r= a%b;
            a=b;
            b=r;
            System.out.println(" ==> iteracion :"+i);
            System.out.println("                a="+a+", b="+b);
        }
        return a;
    }
    static int iter=0;
    static long euclides2(long ma, long me){
        iter++;
        System.out.println(" ==> iteracion :"+iter);
        System.out.println("                a="+ma+", b="+me);
        if(me==0){
            return ma;
        }else{
            return euclides2(me,ma%me);
        }
    }
    
    
    static long euextend(long a,long b){
        int i=0;
        long d=0, x=1,y=1;
        if(b==0){
            i++;
            d=a;
            x=1;
            y=1;
            System.out.println(" ==> iteracion :"+i);
            System.out.println("           d="+d+" , x="+x+" , y="+y);
            return d;
        }else{
            long x1=0,x2=1,y1=1,y2=0;
            long q, r;
            while(b>0){
                i++;
                q=a/b; r=a-q*b;
                x=x2-q*x1; y= y2-q*y1;
                a  = b  ; b=r;
                x2 = x1 ; x1 = x ;
                y2 = y1 ; y1 = y ;
                d  = a  ; x  = y2; y = y2;
                System.out.println(" ==> iteracion :"+i);
            System.out.println("           d="+d+" , x="+x+" , y="+y);
            }
            return d;
            
        }
    }
            
    
    
    
}
