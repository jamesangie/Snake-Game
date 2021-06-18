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



    }

  
    /**
     * Starts the game
     */
    public void start() throws IOException {
	// YOUR CODE HERE
        game = new GameState(game.getSize());
        userInterface = new GameUserInterface(game, this);
    }

 
    /**
     * resets the game
     */
    public void reset() throws IOException {
	// YOUR CODE HERE
        userInterface.setVisible(false);
        start();
    }


    public void actionPerformed(ActionEvent e) {
	//the logic of the game goes in this method        
	// YOUR CODE HERE
        if (e.getSource() == userInterface.getQuit()) {
            userInterface.exit();
        }
        else if (e.getSource() == userInterface.getReset()) {
            try {
                this.reset();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        else if (e.getSource() instanceof Cube) {
            System.out.println(((Cube) e.getSource()).getX());
        }
    }

 
}

