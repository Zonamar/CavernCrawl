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
public class CavernCrawl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        // Init Basic Classes
        InitSystem gameSystem = InitSystem.getInstance();
        gameSystem.InitGame();
               
        
        // Open Start Menu
        gameSystem.StartMenu();
               
        
        if (gameSystem.isSinglePlayer() )
        {
            
         // Init Solo Game
            
        // Start solo game  (pass Character object)   
        }
        else
        {
            // Host or Join?
            
        }
        
        
        
        
        
    }
    
}
