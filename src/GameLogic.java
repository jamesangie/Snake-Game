import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.IOException;
import java.util.*;

//This class implements the interface ActionListener so that it is called when the player makes a move. 
//It calculates the next step of the game
//It updates state and userInterface.


public class GameLogic implements ActionListener {

 // ADD YOUR INSTANCE VARIABLES HERE
    private GameState game;
    private GameUserInterface userInterface;



    public GameLogic(int size) throws IOException { //The parameter size is the size of the board on which the game will be played
	// YOUR CODE HERE
	// It creates the game's userInterface and the game's state instances
        game = new GameState(size);
        userInterface = new GameUserInterface(game, this);



    }

  
    /**
     * Starts the game
     */
    public void start(){
	// YOUR CODE HERE
        int i = 0;
    }

 
    /**
     * resets the game
     */
    public void reset(){
	// YOUR CODE HERE
        int i = 0;
    }


    public void actionPerformed(ActionEvent e) {
	//the logic of the game goes in this method        
	// YOUR CODE HERE
        int i = 0;
    }

 
}

