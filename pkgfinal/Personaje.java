/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;

import java.util.Random;

/**
 *
 * @author WILL
 */
public class Personaje {
    private String nombre;
    private int ninjutsu;
    private int defensa;
    private int taijutsu;
    private int chakra;
    
    private Random rand=new Random (System.nanoTime());
    
    //CONSTRUCTOR

    public Personaje(String nombre, int ninjutsu, int defensa, int taijutsu, int chakra) {
        this.nombre = nombre;
        this.ninjutsu = ninjutsu;
        this.defensa = defensa;
        this.taijutsu = taijutsu;
        this.chakra = chakra;
    }
   // GET AND SET
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNinjutsu() {
        return ninjutsu;
    }

    public void setNinjutsu(int ninjutsu) {
        this.ninjutsu = ninjutsu;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getTaijutsu() {
        return taijutsu;
    }

    public void setTaijutsu(int taijutsu) {
        this.taijutsu = taijutsu;
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }
    
    //METODOS
    
        public void mostrar (){
    
        System.out.println("Personaje:"+nombre);
        System.out.println("Ninjutsu:"+ ninjutsu);
        System.out.println("Taijutsu:"+taijutsu);
        System.out.println("Chakra:"+chakra);
        System.out.println("Defensa:"+defensa);
    
    
    }

    public void atacar (Personaje oponente){
        
        if (this.ninjutsu>oponente.defensa && this.defensa>oponente.taijutsu){
        
            oponente.chakra=oponente.chakra-(this.ninjutsu-oponente.defensa);
            oponente.mostrar();
           
            
        }
        else if (this.ninjutsu<oponente.defensa && this.defensa<oponente.taijutsu){
            
            this.chakra=this.chakra-(oponente.ninjutsu-this.defensa);
            this.mostrar();
       
        
        
        }
        
    }
     public void chidori (Personaje oponente){
       int  chidori=ninjutsu*3;
       oponente.ninjutsu=oponente.ninjutsu+chidori;

        
    }
     public void rasengan (){
        
       int rasengan=ninjutsu*4;
       this.ninjutsu=ninjutsu+rasengan;
}
     public void subeChakra (){
       chakra=chakra*2;
     
     
     
     }
}



