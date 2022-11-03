package com.fernandopaniagua.multihilodemo;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Agregador extends Thread {
    //private static ArrayList<String> palabras = new ArrayList();//Provoca errores de concurrencia
    private static CopyOnWriteArrayList<String> palabras = new CopyOnWriteArrayList<String>();//No hay problemas de concurrencia

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            palabras.add(("Nueva palabra"));
            for (String palabra : palabras) {
                //NO HAGO NADA
            }
        }
        System.out.println("Palabras:" + palabras.size());
    }
    
    
}
