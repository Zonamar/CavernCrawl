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
public class InitSystem {
    
    private InitSystem() {
        
        
    }
    
    public void InitGame()
    {
        
        
        
    }
    
    public static InitSystem getInstance() {
        return InitSystemHolder.INSTANCE;
    }
    
    private static class InitSystemHolder {

        private static final InitSystem INSTANCE = new InitSystem();
    }
    
    
}
