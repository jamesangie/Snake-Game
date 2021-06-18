import java.util.Random;

public class UseRandom{

	private static Random aRandom = new Random();


	//generate a random number between nim and max
	private static int generateRandom(int min, int max){
		//aRandom.nextInt(n) will generate a random number between 0 and n-1
		//so we adjust to get a random between min and max
		int randomNumber = aRandom.nextInt((max-min)+1)+min;
		return randomNumber;
	}


}