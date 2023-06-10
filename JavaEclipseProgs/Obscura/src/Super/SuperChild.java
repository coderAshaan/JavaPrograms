package Super;

public class SuperChild extends SuperParent {
    public void display() {
     super.print();
     System.out.println("superchild");	
     System.out.println(super.a);
     System.out.println(super.b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild schildObj = new SuperChild();
		schildObj.display();

	}

}
