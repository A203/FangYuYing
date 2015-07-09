
  //public class Person1 {
  //}
  

    public class Person1{     
	  String name;
	    int age;
	     String address;
	      
	     Person1(){}
	    Person1(String n, int a, String addr){
		   name=n;
		   age=a;
		   address=addr;
	    }
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Person1 p=new Person1("所雄志",22,"东京牛郎街");
    
    	System.out.println(p.name);
    
    
	}

}
     