package com.fernandopaniagua.multihilodemo;

import java.util.Timer;
import java.util.TimerTask;

public class SistemaRiego extends TimerTask{

    @Override
    public void run() {
        try {
            System.out.println("Abriendo el grifo...");
            Thread.sleep(1000);
            System.out.println("Cerrando el grifo...");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Timer temporizador = new Timer();
        SistemaRiego riego = new SistemaRiego();
        temporizador.schedule(riego, 10000, 3000);
    }
}
