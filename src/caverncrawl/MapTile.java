/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caverncrawl;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.JPanel;


/**
 *
 * @author ZonamarPC
 */




//                                              fg | bg
//           //   Layout  |  Front  |  Back   |  Flags
//             0b0000_0000_0000_0001_0000_0000_0000_0000;
public class MapTile extends JPanel{
    
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
    
    private BufferedImage _bgImg;
    private BufferedImage _fgImg;
    private BufferedImage _img;
    
    MapTile(int newTile)
    {
     
        updateTileInfo(newTile);
        
    }
    MapTile()
    {             //   Layout    Front      Back      Flags
        _tileInfo = 0b1111_1111_0000_0001_0000_0000_0000_0000;    // full grass tile with black bg, no flags
        updateTileInfo(_tileInfo);
        
    }
    
    @Override 
    protected void paintComponent (Graphics g)
{ 
     super.paintComponent(g);
     //I would have image be a class variable that gets updated in your run() method
     g.drawImage(_img, 0, 0, this);

} 
    BufferedImage getTileImg()
    {
        return _img;
        
    }
    void updateTileInfo(int newTile)
            
    {
        _tileInfo = newTile;
        
        LoadBackgroundImage();
        LoadForegroundImage();
        MergeBGandFG();
                
    }
    
    private void LoadBackgroundImage()
    {
        byte bgTileInfo = (byte)( _tileInfo >>> 8);
        _bgImg = null;
        String fileName = new String();
      
        
        
        switch (bgTileInfo)
             {
            case 0: 
                    fileName = "C:\\Users\\zonam_000\\GitHub\\CavernCrawl\\src\\img\\SA1_Black.png";
                    break;
            case 1:
                    fileName = "img/SA1_Grass.png";
                    break;
            case 2:
                    fileName = "img/SA1_Stone.png";
                    break;
                    
            default:   
                    fileName = "img/SA1_Black.png";
                    break;
                    
            
             }
        
        try {
            _bgImg = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            System.out.print("File Read Error\n");
            
        }
            
    }
    
    private void LoadForegroundImage()
    {
        byte fgTileInfo = (byte)( _tileInfo >>> 16);
        String fileName = new String();
        _fgImg = null;
                
        
        switch (fgTileInfo)
             {
            case 0: 
                    fileName = "img/SA1_Black.png";
                    break;
            case 1:
                    fileName = "C:\\Users\\zonam_000\\GitHub\\CavernCrawl\\src\\img\\SA1_Grass.png";
                    break;
            case 2:
                    fileName = "img/SA1_Stone.png";
                    break;
                    
            default:   
                    fileName = "img/SA1_Black.png";
                    break;
                    
            
             }
        try {
            _fgImg = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            System.out.print("File Read Error\n");
        }
        
    }
    
    private void MergeBGandFG()
    {
        _img = null;
        


        // create the new image, canvas size is the max. of both image sizes
     //   int w = Math.max(_fgImg.getWidth(), _bgImg.getWidth());
      //  int h = Math.max(_fgImg.getHeight(), _bgImg.getHeight());
        _img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);

        // paint both images, preserving the alpha channels
        Graphics g = _img.getGraphics();
        g.drawImage(_bgImg, 0, 0, null);
        g.drawImage(_fgImg, 0, 0, null);
    }
    
}
