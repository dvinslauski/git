
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

	public static sendMessage(){
		System.out.println("This is an important message.");
	}
}
