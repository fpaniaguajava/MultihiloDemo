package com.fernandopaniagua.multihilodemo;

public class Raton extends Thread {
    private String nombre;
    private int tiempoEntreBocado;

    public Raton(String nombre, int tiempoEntreBocado) {
        this.nombre = nombre;
        this.tiempoEntreBocado = tiempoEntreBocado;
    }
    private void comer(){
        System.out.println(String.format("El ratón %s está comiendo", nombre));
        try {
            Thread.sleep(tiempoEntreBocado);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(String.format("El ratón %s ha terminado de comer", nombre));
    }

    @Override
    public void run() {
        super.run();
        for(int i=0;i<5;i++){
            this.comer();
        }
    }
    
}
