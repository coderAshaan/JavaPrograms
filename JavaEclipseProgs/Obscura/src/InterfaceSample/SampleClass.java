package InterfaceSample;

public class SampleClass implements SampleOne {
	
	// Abstract method definition
	public void display() {
		System.out.println("DISPLAY");
	}
	
	public void add() {
		int c = a + b;
		System.out.println(c);
	}
	
	// Method in class
	
	public void SampleClassMethod() {
		System.out.println("Sample method class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass smpleClassObj = new SampleClass();
		smpleClassObj.display();
		smpleClassObj.add();
		smpleClassObj.SampleClassMethod();
		System.out.println(smpleClassObj.a);
		System.out.println(smpleClassObj.b);

	}

}
