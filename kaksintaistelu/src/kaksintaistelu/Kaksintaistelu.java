package kaksintaistelu;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.Scanner;

public class Kaksintaistelu {

    public static void main(String[] args) {
        JFrame ikkuna = new JFrame();
        grafiikka Graf = new grafiikka();
        Container container = ikkuna.getContentPane();
        container.add(Graf);
        ikkuna.addKeyListener(Graf);
        ikkuna.setSize(799, 830);
        ikkuna.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ikkuna.setVisible(true);
        
       

    }
}
