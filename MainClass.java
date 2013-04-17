
public class MainClass {

	public static int add(int a, int b){
		return a + b; 
	}
	
	public static int multiply(int a, int b){
		return a * b; 
	}
	
	public static int pow(int a, int b){
		return (int) Math.pow(a, b); 
	}
	
	public static void main(String[] args){
		System.out.println(add(3,2));
		System.out.println(multiply(3,2));
		System.out.println(pow(3,2));
	}

	public static void sendMessage(){
		System.out.println("This is an important message.");
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
