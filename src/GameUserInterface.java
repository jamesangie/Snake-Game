import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;

 /*the class GameUserInterface provides the user interface of the Game. It extends
 JFrame and lays out an instance of BoardUserInterface and  two instances of JButton: one to reset and the second the quit the game at any time.*/

public class GameUserInterface extends JFrame {

	private JButton reset;
	private JButton quit;

	private GameState gameState;
	private GameLogic gameLogic;
	// ADD YOUR INSTANCE VARIABLES HERE
	BoardUserInterface boardInterface;
	//ALL PRIVATE
 
    /* Constructor 
	 * initializes the board
     * takes as parameters the state of the game and the gameLogic */

    public GameUserInterface(GameState state, GameLogic gameLogic) throws IOException {
		//Your code here


		gameState = state;
		this.gameLogic = gameLogic;

		this.setTitle("Snake game");
		this.setSize(800, 900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// board interface
		boardInterface = new BoardUserInterface(state, gameLogic);

		// panel for btns
		JPanel panel = new JPanel();
		reset = new JButton("Reset");
		quit = new JButton("Quit");
		panel.add(reset);
		panel.add(quit);
		reset.addActionListener(gameLogic);
		quit.addActionListener(gameLogic);

		//add everything to the frame

//		java.net.URL img2Url = getClass().getResource("square-2.png");
//		ImageIcon icon0 = new ImageIcon(img2Url);
//		JButton b = new JButton(icon0);
//		b.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
//		panel.add(b, BorderLayout.PAGE_START);

		this.add(boardInterface, BorderLayout.PAGE_START);
		this.add(panel, BorderLayout.AFTER_LAST_LINE);
		this.setVisible(true);

    }


	public JButton getReset(){
		return this.reset;
	}
	public JButton getQuit(){
		return this.quit;
	}
    public BoardUserInterface getBoardUserInterface(){
		//YOUR CODE HERE
		return boardInterface;

   }


	public void exit() {
    	this.dispose();

	}
}
