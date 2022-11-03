package com.fernandopaniagua.multihilodemo;

public class Sumador implements Runnable{
    Object candado;
    private static int total=0;
    private String nombre;
    private int cantidad;
    private int delay;
    public Sumador(String nombre, int cantidad, int delay){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.delay = delay;
    }
    @Override
    public void run() {
        try {
            for (int i=0;i<cantidad;i++){
                incrementar();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(String.format("Total %d", total));
    }

    private synchronized void incrementar() {
        //Thread.sleep(delay);
        total++;
    }
}
