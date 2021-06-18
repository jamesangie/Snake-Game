import javax.swing.JButton;
import javax.swing.ImageIcon;


/********************************************************************
 * The Cube is a type of JButton that represents a cube in the game 
*********************************************************************/

public class Cube extends JButton {

    // ADD YOUR INSTANCE VARIABLES HERE
    private int row, column, type;
    private final java.net.URL img0Url = getClass().getResource("square-0.png");
    private final java.net.URL img1Url = getClass().getResource("square-1.png");
    private final java.net.URL img2Url = getClass().getResource("square-2.png");
    private final ImageIcon icon0 = new ImageIcon(img0Url);
    private final ImageIcon icon1 = new ImageIcon(img1Url);
    private final ImageIcon icon2 = new ImageIcon(img2Url);
    private JButton c;

    /**
     * Constructor*/

    public Cube(int row, int column, int type) {
		//YOUR CODE HERE
        this.row = row;
        this.column = column;
        this.type = type;
        if (type == 0) {
            c = new JButton(icon0);
        }
        else if (type == 1) {
            c = new JButton(icon1);
        }
        else if (type == 2) {
            c = new JButton(icon2);
        }
    }


     //Sets the type of a square. 
	 //sets the icon of the square.
	
    public void setType(int type) {
		//Your code here
        this.type = type;
        if (type == 0) {
            c = new JButton(icon0);
        }
        else if (type == 1) {
            c = new JButton(icon1);
        }
        else if (type == 2) {
            c = new JButton(icon2);
        }
    }

 
    // Getter method for the attribute row.
    public int getRow() {
		return row;
    }

    //Getter method for the attribute column.
    public int getColumn() {
		return column;
    }

    public int getType() {
        return type;
    }

    public JButton getC() {
        return c;
    }
}
