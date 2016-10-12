/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caverncrawl;

/**
 *
 * @author ZonamarPC
 */
public class MapTile {
    
    public enum TileFlags{
        isPassible (0b0000_0000_0000_0000_0000_0000_0000_0001);
        
        
        private final int _flag;
        
        TileFlags(int flag)
        {
            this._flag = flag;
        }
    }
    
 
    private int _tileInfo;
    
    MapTile(int newTile)
    {
        _tileInfo = newTile;
    }
    MapTile()
    {             //   Layout    Front      Back      Flags
        _tileInfo = 0b0000_0000_0000_0000_0000_0000_0000_0000;
    }
    
    
}
