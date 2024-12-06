package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Harry Potter and the Mug on Fire");

        window.setLocationRelativeTo(null); // set window to center of the screen
        window.setVisible(true);
    }   
}
