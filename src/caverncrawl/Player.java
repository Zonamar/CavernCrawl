/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caverncrawl ;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author zonam_000
 */
public class Player extends JPanel{
    
    private GameLocation _loc;
    private float _moveSpeed;
    private float _rotSpeed;
    private BufferedImage _img;
    
    public Player()
    {
        _loc = new GameLocation(1,1,0,(float) .75);
        _moveSpeed = (float) 0.5;
        _rotSpeed = (float) 0.1;   
        
        try {
            _img = ImageIO.read(new File("C:\\Users\\ZonamarPC\\GitHub\\CavernCrawl\\src\\img\\Fother-penguin.png"));
        } catch (IOException e) {
            System.out.print("File Read Error\n");
            
        }
            
    }
    
      @Override 
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(_img.getSubimage(0,0,40,40), (int)_loc.getX(), (int)_loc.getY(), null);
        
        
    }
    
    public void moveUp(float y)
    {
        _loc.moveY(y*_moveSpeed);         
    }
    
    public void moveDown(float y)
    {
        _loc.moveY(y*-1*_moveSpeed); 
    }
    
    public void moveRight(float x)
    {
        _loc.moveX(x*_moveSpeed);
    }
    
    public void moveLeft(float x)
    {
        _loc.moveX(x*-1*_moveSpeed);
    }
    
    public void rotate(float rot)
    {
        _loc.rotate(rot);
    }
    
    public GameLocation getLoc()
    {
        return _loc;
    }
}
    