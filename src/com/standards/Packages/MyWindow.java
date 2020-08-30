package com.standards.Packages;

import java.awt.*; //* adds everything inside the awt package
import java.awt.event.WindowEvent; //awt.event package is different from awt.event thus why it needs to be imported
import java.awt.event.WindowListener;



public class MyWindow extends Frame {

    public MyWindow(String title){
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("Java course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("Taken by Mo", 60, 100);
    }
}
