
public class MainClass {

	String difficulty = "Adding is hard.";	

	public static int add(int a, int b){
		return a + b; 
	}
	
	public static int multiply(int a, int b){
		return a * b; 
	}
	
	public static sendMessage(String message){
		System.out.println(message);
	}
	public static int pow(int a, int b){
		return (int) Math.pow(a, b); 
	}

	public static void main (String [] args){
		sendMessage(difficulty);
	}
}
