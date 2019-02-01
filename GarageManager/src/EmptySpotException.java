
public class EmptySpotException extends Exception{
	public EmptySpotException(int s) {
		System.out.println("No one is in spot " + s);
	}
}
