package AbstractEg;

public class NormalClass extends AbstractClass {
    public void print () { // defenition of abstract method
    	System.out.println("abstract method");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalClass obj = new NormalClass();
		obj.display();
		obj.print();
		/*AbstractClass ob =new AbstractClass();
		ob.name();
		ob.display(); */

	}

}
