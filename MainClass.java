
public class MainClass {

	static String difficulty = "Adding is hard.";	

	public static int add(int a, int b){
		return a + b; 
	}
	
	public static int multiply(int a, int b){
		return a * b; 
	}
	
	public static void sendMessage(String message){
		System.out.println(message);
	}
	public static int pow(int a, int b){
		return (int) Math.pow(a, b); 
	}

	public static void main (String [] args){
		sendMessage(difficulty);
	}
	
	public static void receiveMessage(){
		System.out.println("Receiving.......");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Received!!!");
	}
}
