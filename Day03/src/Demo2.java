


public class Demo2 {
	int age;
 static int number;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Demo2 d=new Demo2();
 System.out.println(d.number);
 d.show();
 System.out.println(Demo2.number);
 Demo2 demo2=new Demo2();
 demo2.show();
	}
public  void show(){
	number++;
	age++;
	System.out.println(number);
	System.out.println(age);
	
}
}
