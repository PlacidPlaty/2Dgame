package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Harry Potter and the Mug on Fire");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        // causes this window to be iszed to fit the preferred size and layouts of it ssubcomponents (=GamePanel)
        window.pack();

        window.setLocationRelativeTo(null); // set window to center of the screen
        window.setVisible(true);
    }   
}
