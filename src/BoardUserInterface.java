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
        JButton btn = new JButton();

//        java.net.URL img2Url = getClass().getResource("square-2.png");
//        ImageIcon icon0 = new ImageIcon(img2Url);
//        JButton b = new JButton(icon0);
//        b.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
//
//        panel.add(b);
//        panel.add(btn);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (int i = 0; i < GameState.getSize(); i++) {
            JPanel row = new JPanel();
            for (int j = 0; j < GameState.getSize(); j++) {
                if (GameState.getBoard()[i][j] == 0) {
                    btn = new JButton(icon0);
                    btn.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
                    row.add(btn);
                }
                else if (GameState.getBoard()[i][j] == 1) {
                    btn = new JButton(icon1);
                    btn.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
                    row.add(btn);
                }
                else if (GameState.getBoard()[i][j] == 2) {
                    btn = new JButton(icon2);
                    btn.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
                    row.add(btn);
                }
            }
            if (i % 2 != 0) {
                row.setBorder(BorderFactory.createEmptyBorder(0,30,0,0));
            }
            else {
                row.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
            }
            panel.add(row);
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
