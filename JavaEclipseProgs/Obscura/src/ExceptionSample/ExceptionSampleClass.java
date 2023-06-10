package ExceptionSample;

public class ExceptionSampleClass {
   
	public void display() {
		try {
		int a = 100;
		int b = a/0;
		System.out.println(b);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("EXCEPTION HANDLED");
			System.out.println(e);
		}
		
		finally {
			System.out.println("Finally Block");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSampleClass clssObj = new ExceptionSampleClass();
		clssObj.display();

	}

}
