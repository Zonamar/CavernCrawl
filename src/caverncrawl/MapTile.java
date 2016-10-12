/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caverncrawl;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;


/**
 *
 * @author ZonamarPC
 */




//                                              fg | bg
//           //   Layout  |  Front  |  Back   |  Flags
//             0b0000_0000_0000_0001_0000_0000_0000_0000;
public class MapTile {
    
    public enum TileFlags{
        bgisPassible (0b0000_0000_0000_0000_0000_0000_0000_0001),
        fntisPassible(0b0000_0000_0000_0000_0000_0000_0001_0000);
        
        private final int _flag;
        
        TileFlags(int flag)
        {
            this._flag = flag;
        }
    }
    
    
    private int _tileInfo;
    
    private BufferedImage img;
    
    private BufferedImage _bgImg;
    private BufferedImage _fgImg;
    private BufferedImage _img;
    
    MapTile(int newTile)
    {
        _tileInfo = newTile;
    }
    MapTile()
    {             //   Layout    Front      Back      Flags
        _tileInfo = 0b1111_1111_0000_0001_0000_0000_0000_0000;    // full grass tile with black bg, no flags
    }
    
    void LoadBackgroundImage()
    {
        byte bgTileInfo = 0;
        
        switch (bgTileInfo)
             {
            case 0:
                    break;
            case 1:
                    break;
                    
            default: 
                    break;
                    
            
             }
        }
    }
    
    void LoadForgoudImage()
    {
        
        
    }
    
}
