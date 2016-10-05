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
public class GameLocation {
    
    private float _s;           // diameter of object;
    private float _x;           // x location 
    private float _y;           // y location
    private float _rotation;    // rotation ----   0 is 90 deg  
                                //                .25is 180deg
                                //                .5 is 270deg
                                //                .75is 0 deg
    
    
    public GameLocation(float x,float y,float rot, float s)
    {
        _x = x ;
        _y = y ;
        _rotation = rot;
        _s = s;
    }
    void moveX(float xloc)
    {
        _x+=xloc;
    }
    
    void moveY(float yloc)
    {
        _y+=yloc;
        
    }
    
    void rotate(float rotation)
    {
        _rotation += rotation;
    }
    
    void setXloc(float xloc)
    {
        _x = xloc;
    }
    
    void setYloc(float yloc)
    {
        _y = yloc;
    }
    
    void setRotation (float rotation)
    {
        _rotation = rotation;
    }
    
    float getX ()
    {
        return _x;
    }
    
    float getY ()
    {
        return _y;
    }
    
    float getRotation()
    {
        return _rotation;
    }
    
    static float degToRotation(float rot)    // turns a deg amount into a float 
    {                                        // useable by GameLocation
        rot -=  90;                // for ofset 90 deg
        
        while (rot >360)
        {
            rot -= 360;
        }
        while (rot < 0 )
        {
            rot += 360;
        }
                
        
        return rot/360;
    }
    
    
}
