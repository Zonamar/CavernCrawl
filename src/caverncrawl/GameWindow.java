/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caverncrawl;

import java.awt.Color;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.*;

/**
 *
 * @author ZonamarPC
 */
        


public class GameWindow extends JPanel implements ActionListener {
    
    
    private GameControler _gameControler;
    
    private Player _newPlayer;
    
    
    
    
    
    public void gameStart()
    {
        
        MapTile testTile = new MapTile();
        _newPlayer = new Player();
        
        //MapTile testTile2 = new MapTile();
        
        JFrame j = new JFrame("CavernCrawl");
        j.setBounds(0,0,500,500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
      //  j.add(testTile);
        j.add(_newPlayer);
        //j.add(testTile2);
         j.setIconImage(new ImageIcon("C:\\Users\\ZonamarPC\\GitHub\\CavernCrawl\\src\\img\\HammerAndSword.png").getImage());
         
         
    }

    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        _newPlayer.animate();
        
    }
    
    
    
    
}
