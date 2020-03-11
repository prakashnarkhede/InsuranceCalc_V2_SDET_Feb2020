package javaPractice;

public class Encapsulation {
	
	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Encapsulation d = new Encapsulation();
		d.setName("Prakash");
		d.setRollNo(1);
		System.out.println("Roll no is: "+d.getRollNo());
		System.out.println("Roll no is: "+d.getName());
		
		Encapsulation d1 = new Encapsulation();
		d1.setName("John");
		d1.setRollNo(2);
		System.out.println("Roll no is: "+d1.getRollNo());
		System.out.println("Roll no is: "+d1.getName());

	}
}
 