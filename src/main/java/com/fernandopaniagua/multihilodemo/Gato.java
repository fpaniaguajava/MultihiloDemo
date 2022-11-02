package com.fernandopaniagua.multihilodemo;

public class Gato implements Runnable {
    private String nombre;
    private int tiempoEntreBocado;

    public Gato(String nombre, int tiempoEntreBocado) {
        this.nombre = nombre;
        this.tiempoEntreBocado = tiempoEntreBocado;
    }
    private void comer(){
        System.out.println(String.format("El gato %s está comiendo", nombre));
        try {
            Thread.sleep(tiempoEntreBocado);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(String.format("El gato %s ha terminado de comer", nombre));
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            this.comer();
        }
    }
}
