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
public class StartMenuControler {
    
    
public void OpenStartMenu()
{
    StartMenuGui StartMenu = new StartMenuGui();
    
    StartMenu.setVisible(true);
    
    CharacterLoader startLoader = InitSystem.getInstance().getCharLoader();
    
    int count = startLoader.getNumCharacters();
    
    for (int i = 0 ; i < count ; i++)
    {
        StartMenu.AddCharacter(startLoader.getCharacterNum(i));
    }
    
         // Start Solo Game
                // New Character            Character Object Created 
                // Load Character           by each of these options
        // Start Multiplayer Game
                // Host
                    // Add Multiplayer logic
                // Join
                    // Add multiplayer logic
    
}
    
    
    
}
