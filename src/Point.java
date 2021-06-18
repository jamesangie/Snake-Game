
public class Point {

   // YOUR INSTANCE VARIABLES HERE
   private int x;
   private int y;

    /*Constructor 
     * The parameters x and y are the coordinates
     */
    public Point(int x1, int y1){
        x = x1;
        y = y1;
    }

    //Getter method, return the value of instance variable x
    public int getX(){
		return x;
    }
    
    //Getter method, return the value of instance variable y
    public int getY(){
		return y;
    }


    

    //Setter method, sets the values of instance variables x and y
    public void reset(int x1, int y1){
	    x = x1;
	    y = y1;
  }


 }
