package practice.test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyTest {
    static {
        new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("keyTyped : " + e.toString());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("keyPressed : " + e.toString());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("keyReleased : " + e.toString());
            }
        };
    }

    public static void main(String[] args) {
        KeyTest keyTest = new KeyTest();
        while(true) {

        }
    }
}
