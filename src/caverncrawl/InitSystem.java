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
    
    private boolean _isSinglePlayer;
    
    private StartMenuControler _startMenuControler;
    
    private CharacterLoader _characterLoader;
    
    private String _selectedCharacter;
    
    
    private InitSystem() {
        
        
    }
    
    
    public void InitGame()
    {
        _startMenuControler = new StartMenuControler();
        _characterLoader = new CharacterLoader();
        _isSinglePlayer = true;
        
                    
    }
    
    public CharacterLoader getCharLoader()
    {
        return _characterLoader;
    }
    
    public void makeMultiPlayer()
    {
        _isSinglePlayer = false;
        // Add code to setup networking
        
    }

    
    public boolean isSinglePlayer()
    {
        
        
        return _isSinglePlayer;
    }
    
    public void setCharacter(String charSel)    
    {
        
        _selectedCharacter = charSel;
        
    }
    
    public void loadSelectedChar()
    {
        // Load the selected char into local player
    }
    
    public void StartMenu()
    {
        
        _startMenuControler.OpenStartMenu();

    }
    
    public static InitSystem getInstance() {
        return InitSystemHolder.INSTANCE;
    }
    
    private static class InitSystemHolder {

        private static final InitSystem INSTANCE = new InitSystem();
    }
    
    
}
