/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.fernandopaniagua.multihilodemo;

/**
 *
 * @author ferna
 */
public class MultihiloDemo {
    
    public static void main(String[] args) {
        //crearRatones();
        //crearGatos();
        //crearSumadores();
        crearAgregadores();
    }

    private static void crearAgregadores(){
        for(int i=0;i<10;i++){
            new Agregador().start();
        }
    }
    
    private static void crearSumadores(){
        Sumador s = new Sumador("Sumador", 100000, 0);
        for (int i=0;i<10;i++){
            new Thread(s).start();
        }
    }
    
    private static void crearGatos() {
        //Gatos
        Gato garfield = new Gato("Garfield",8000);
        Gato tom = new Gato("Tom",12000);
        Gato felix = new Gato("Felix", 15000);
        new Thread(garfield).start();
        new Thread(tom).start();
        new Thread(felix).start();
    }

    private static void crearRatones() {
        //Ratones
        Raton mickey = new Raton("Mickey",5000);
        Raton jerry = new Raton("Jerry",20000);
        Raton speedy = new Raton("Speedy",30000);
        mickey.start();//10
        jerry.start();//15
        speedy.start();//5
    }
}
