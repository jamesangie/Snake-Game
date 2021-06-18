import java.util.Random;


public class GameState {


    //static final variables public
    public static final int FREE_CUBE = 0;
    public static final int SELECTED = 1;
    public static final int RED_CUBE = 2;
    public static final int MAX_SELECTED = 5;
    private static Random aRandom = new Random();

    //non-final variables private
    private final int boardSize;
    private Point redCube;
    private int[][] board;


    /**
     * Constructor 
	 * initializes the state to the size of board
     *  The parameter size is the size of the board
     */
    public GameState(int size) {
        boardSize = size;
        // YOUR INSTANCE VARIABLES HERE
        board = new int[size][size];
        // initialize the board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = FREE_CUBE;
            }
        }
        // set the location of the mouse
        if (size % 2 == 1) {
            redCube = new Point(size/2 + 1, size/2 + 1);
            board[size/2 + 1][size/2 + 1] = RED_CUBE;
        }
        else {
            int red_x = aRandom.nextInt(2) + (size/2 - 1);
            int red_y = aRandom.nextInt(2) + (size/2 - 1);
            redCube = new Point(red_x, red_y);
            board[red_x][red_y] = RED_CUBE;
        }

        // set the number and location of the snakes
        int num_of_snake = (size*size - 1) / 10;
        int snake_x;
        int snake_y;
        while (num_of_snake > 0) {
            snake_x = aRandom.nextInt(size);
            snake_y = aRandom.nextInt(size);
            if (board[snake_x][snake_y] == 0) {
                select(snake_x, snake_y);
                num_of_snake--;
            }
        }

    }

	//



    public int getSize(){
	//YOUR CODE HERE
		return boardSize;
   }

    /**
     * returns the current status (FREE_CUBE, SELECTED or RED_CUBE) of a given cube in the game
     * 
     * i is the x coordinate of the cube
     * j is the y coordinate of the cube
     * return the status of the cube at location (i,j)
     */   
    public int getCurrentStatus(int i, int j){
		return board[i][j];
    }


    /**
     * Sets the status of the cube at coordinate (i,j) to SELECTED
     * i is the x coordinate of the cube
     * j is the y coordinate of the cube
     */   
    public void select(int i, int j){
        board[i][j] = SELECTED;
    }

    /**
     * Puts the red cube at coordinate (i,j). Clears the previous location 
     * of the red cube.
     *
      * i is the x coordinate of the cube
     * j is the y coordinate of the cube
     */   
    public void setCube(int i, int j){
	    board[i][j] = RED_CUBE;
	    redCube.reset(i, j);
   }

    /* Getter method for the current red cube
     * return the location of the current red cube */
    public Point getCurrentCube(){
		return redCube;//REPLACE THIS LINE WITH YOUR CODE
    }

    public int[][] getBoard() {return board;}

}
