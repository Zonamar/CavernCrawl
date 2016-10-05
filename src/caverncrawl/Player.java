/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caverncrawl;

/**
 *
 * @author zonam_000
 */
public class Player {
    
    private GameLocation _loc;
    private float _moveSpeed;
    private float _rotSpeed;
    
    
    public Player()
    {
        _loc = new GameLocation(1,1,0,(float) .75);
        _moveSpeed = (float) 0.5;
        _rotSpeed = (float) 0.1;   
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
    
    public GameLocation getLocation()
    {
        return _loc;
    }
}
    