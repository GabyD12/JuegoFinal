/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal;

import java.util.Random;

/**
 *
 * @author WILL
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dp1=0,dp2=0;
        //(String nombre, int ninjutsu, int defensa, int taijutsu, int chakra)
        Personaje p1= new Personaje("Naruto",100,90,80,300);
        Personaje p2= new Personaje ("Sasuke",100,95,80,300);
        
        p1.mostrar();
        System.out.println("");
        p2.mostrar();
        
        while (p1.getChakra()>0 && p2.getChakra()>0){
            Random random = new Random();
            dp1 = (int) (Math.random() * (6 - 1+1)) + 1;  
            dp2 = (int) (Math.random() * (6 - 1+1)) + 1; 
                
           if (dp2>dp1){
                if(dp2 == 5){
                   p2.chidori(p2);
                   System.out.println("Felicidades Sasuke Obtuviste un aumento de poder\n");
               }
                 p1.atacar(p2);
                 p1.mostrar();
             } 
           else if (dp1 > dp2) {
               if(dp1 == 5){  
                p1.rasengan();
                System.out.println("Felicidades Naruto Obtuviste un aumento de poder\n");
           }
           
           else if (dp1<dp2){
               
               p2.atacar(p1);
               p2.mostrar();
               
               
           }
           if(dp1==4){
               
               p1.subeChakra();
               System.out.println("Sube chakra Naruto\n");
           }
           else if (dp2==4){
               
               p2.subeChakra();
               System.out.println("sube chakra Sasuke\n");
           }
           }
        
        
        }
        System.out.println("");
        estadistica(p1, p2);        
        
        }
        public static void estadistica(Personaje p1, Personaje p2){
        System.out.println("Información del enfrentamiento\nGanador:");
        if(p1.getChakra()>= p2.getChakra()){
            p1.mostrar();
            System.out.println("Perdedor:");
            p2.mostrar();
        }else{
            p2.mostrar();
            System.out.println("Perdedor:");
            p1.mostrar();
        }
    }
}
