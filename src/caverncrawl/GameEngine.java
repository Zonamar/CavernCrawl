package caverncrawl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zonam_000
 */
public class GameEngine implements ActionListener{
    
    private GameControler _gameControler;
    private PlayerControler _playerControler;
    private MonsterControler _monsterControler;
    
    private Timer _gameClock;
    
    
    public void startGame()
    {
        _gameClock =  new Timer(100,this);
        
        _gameClock.start();
        
        
    }
   
    
    
    
        @Override
    public void actionPerformed(ActionEvent e)
    {
        
        _playerControler.updatePlayer();
        
        _monsterControler.updateMonsters();
        
        _gameControler.updateWindow();
        
        
        
        
        
    }
}
