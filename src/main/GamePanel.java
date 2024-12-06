package main;

import javax.swing.JPanel;

public class GamePanel extends JPanel{

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

}
