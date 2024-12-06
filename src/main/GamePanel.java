package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/*
 * Creates Game screen
 */

// subclass of JPanel
public class GamePanel extends JPanel implements Runnable{

    // SCREEN SETTINGS
    final int ORIGINALTILESIZE = 16; // 16x16 tile size
    // need to scale 16X16 tile size or they will look small on modern screens
    final int SCALE = 3;

    final int TILESIZE = ORIGINALTILESIZE * SCALE; // 48x48 tile size

    // game screen size will be 16x12 tiles big (4:3 ratio)
    final int MAXSCREENCOL = 16;
    final int MAXSCREENROW = 12;
    final int SCREENWIDTH = TILESIZE * MAXSCREENCOL; // 768 pixels
    final int SCREENHEIGHT = TILESIZE * MAXSCREENROW; // 576 pixels

    // Create threads for multiple things running in game
    Thread gameThread;

    public GamePanel() {
        // new Dimension(width, height)
        this.setPreferredSize(new Dimension(SCREENWIDTH, SCREENHEIGHT));
        this.setBackground(Color.black);

        // If set to true, all the drawing from this component will be done in an
        // offscreen painting buffer
        this.setDoubleBuffered(true);
    }

    // method to start new thread
    public void startGameThread() {
        
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        /*
         * Game Loop for the core of the game
         */
        // TODO Auto-generated method stub

        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
