/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caverncrawl;
import java.util.*;

/**
 *
 * @author zonam_000
 */
public class CharacterLoader {
    
    private Integer _characterCount;
    private LinkedList<String> _characters;
    
    public CharacterLoader()
    {
        _characters = new LinkedList<String>();
        
        _characterCount = LoadChars();
        
    }
    public Integer getNumCharacters()
    {
        return _characterCount;
    }
    
    public String getCharacterNum(Integer x)
    {
        
        return _characters.get(x);
        
        
    }
    
    private Integer LoadChars()
    {
        _characters.add("Zonamar : Human : Wizard : LVL 45");
        _characters.add("Haikuna : Dwarf : Fighter: LVL 18");
                
        return 2;
    }
    
    
}
