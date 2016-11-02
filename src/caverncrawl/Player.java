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
    private BufferedImage[][] _subImg;
    final static int ROWS = 8;
    final static int COLS = 8;
    final static int WIDTH = 41;
    final static int HIGHT = 42;
    int _walkState;
    int _facingState;
    
    public Player()
    {
        _loc = new GameLocation(1,1,0,(float) .75);
        _moveSpeed = (float) 0.5;
        _rotSpeed = (float) 0.1;   
        
        _subImg = new BufferedImage[ROWS][COLS];
        
        _walkState=0;
        _facingState=2;
        
        
        try {
            _img = ImageIO.read(ClassLoader.getSystemResource("Fother-penguin.png"));
            
            for(int i= 0 ; i< ROWS; i++)
                for(int j =0; j<COLS;j++)
                {
                    _subImg[i][j]=_img.getSubimage(j*WIDTH,i*HIGHT,WIDTH,HIGHT);
                                       
                }
            
            
        } catch (IOException e) {
            System.out.println(" Player File Read Error -- "+ e.toString());
            
        }
            
    }
    
      @Override 
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(_subImg[0][_walkState], 50,  50, null);
        g.drawImage(_subImg[1][_walkState], 50, 100, null);
        g.drawImage(_subImg[2][_walkState], 50, 150, null);
        g.drawImage(_subImg[3][_walkState], 100, 50, null);
        g.drawImage(_subImg[4][_walkState], 100, 100, null);
        g.drawImage(_subImg[5][_walkState], 100, 150, null);
        g.drawImage(_subImg[6][_walkState], 150, 50, null);
        g.drawImage(_subImg[7][_walkState], 150, 100, null);
        
    }
    
    // probably should be moved later
    
    public void animate()
    {   
        _walkState = (_walkState +1)%8;
        System.out.println(_walkState);
        repaint();
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
    