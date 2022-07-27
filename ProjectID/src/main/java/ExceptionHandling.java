
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello World");
			
			int i = 1/0;
			
			System.out.println("Test Completed");
	
		}
		catch(Exception e){
			System.out.println("I am inside the catch block");
			System.out.println("Message is : "+e.getMessage());
			System.out.println("Cause is : "+e.getCause());
			e.printStackTrace();
			
		}
		finally {
			System.out.println("I am inside finally block");
		}
	}

}
