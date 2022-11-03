package com.fernandopaniagua.multihilodemo;

import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Notificador {
    public void showNotification() throws AWTException {
        if (SystemTray.isSupported()) {
            Notificador notificador = new Notificador();
            notificador.displayTray();
        } else {
            System.err.println("System tray not supported!");
        }
    }
    public void displayTray() throws AWTException {
        SystemTray tray = SystemTray.getSystemTray();

        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");

        TrayIcon trayIcon = new TrayIcon(image, "Mensaje");
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);
        trayIcon.displayMessage("Estira las piernas", "Alerta de salud", MessageType.INFO);
    }
    public static void main(String[] args) {
        try {
            new Notificador().showNotification();
        } catch (AWTException ex) {
            Logger.getLogger(Notificador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
