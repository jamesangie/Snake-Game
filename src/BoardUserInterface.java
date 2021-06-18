import javax.swing.*;
import java.awt.*;

public class BoardUserInterface extends JPanel {

    //YOUR INSTANCE VARIABLES HERE
	public JPanel panel;
	private GameState gameState;
	private GameLogic gameLogic;
    private final java.net.URL img0Url = getClass().getResource("square-0.png");
    private final java.net.URL img1Url = getClass().getResource("square-1.png");
    private final java.net.URL img2Url = getClass().getResource("square-2.png");
    private final ImageIcon icon0 = new ImageIcon(img0Url);
    private final ImageIcon icon1 = new ImageIcon(img1Url);
    private final ImageIcon icon2 = new ImageIcon(img2Url);

    public BoardUserInterface(GameState GameState, GameLogic GameLogic) {
		//Your code goes here
        panel = new JPanel();
        gameState = GameState;
        gameLogic = GameLogic;
        int size = gameState.getSize();

        // Cube array to contain information of the game board
        Cube[][] cubeBoard = new Cube[size][size];
        Cube[] cubeRow = new Cube[size];

        JButton btn = new JButton();

//        java.net.URL img2Url = getClass().getResource("square-2.png");
//        ImageIcon icon0 = new ImageIcon(img2Url);
//        JButton b = new JButton(icon0);
//        b.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
//
//        panel.add(b);
//        panel.add(btn);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // in each outer loop, assign a new row of cubes and display on the interface
        for (int i = 0; i < size; i++) {
            JPanel row = new JPanel();
            cubeRow = new Cube[size];
            //in each inner loop, create each cube according to board[][], also add cube to cubeRow.
            for (int j = 0; j < size; j++) {
                Cube c = new Cube(i, j, GameState.getBoard()[i][j]);
                cubeRow[j] = c;
                if (GameState.getBoard()[i][j] == 0) {
                    c.setIcon(icon0);
                    c.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
                    row.add(c);
                }
                else if (GameState.getBoard()[i][j] == 1) {
                    c.setIcon(icon1);
                    c.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
                    row.add(c);
                }
                else if (GameState.getBoard()[i][j] == 2) {
                    c.setIcon(icon2);
                    c.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
                    row.add(c);
                }
            }
            if (i % 2 != 0) {
                row.setBorder(BorderFactory.createEmptyBorder(0,30,0,0));
            }
            else {
                row.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
            }
            panel.add(row);
            cubeBoard[i] = cubeRow;
        }

    }

    public JPanel getPanel() {
        return panel;
    }


    //updates the status of the board's cubes instances following the game state
	//calls setType() from the class Cube, as needed.
    public void update(){
		//Your code goes here
        }

}
