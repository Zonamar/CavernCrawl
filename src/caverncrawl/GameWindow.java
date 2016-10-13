/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caverncrawl;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

/**
 *
 * @author ZonamarPC
 */
public class GameWindow {
    public static void main(String[] args)
            
    {
        MapTile testTile = new MapTile();
        Player newPlayer = new Player();
        
        //MapTile testTile2 = new MapTile();
        
        JFrame j = new JFrame("CavernCrawl");
        j.setBounds(0,0,500,500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.add(testTile);
        j.add(newPlayer);
        //j.add(testTile2);
        
        
        
        j.setIconImage(new ImageIcon("C:\\Users\\ZonamarPC\\GitHub\\CavernCrawl\\src\\img\\HammerAndSword.png").getImage());
        
        
    }
}
