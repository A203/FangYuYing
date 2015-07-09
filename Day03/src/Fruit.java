
public class Fruit {
    String name;
    int price;
    String address;
    void Smell(){
    	System.out.println("it is good taste!");
    }
     Fruit() {}
     Fruit(String n,int p,String a){
    	 name=n;
    	 price=p;
    	 
    	 address=a;
     }
		// TODO Auto-generated constructor stu}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Fruit f=new Fruit("Æ»¹û",6,"É½¶«");
       System.out.println(f.price);
       f.Smell();
	}

}
