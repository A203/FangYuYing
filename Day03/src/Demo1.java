  public class Demo1{
        public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person02 p=new Person02("tom",26,"newyork");
      p.introduce();
        }
  }
class Person02 {
    String name;
    int age;
    String address;
    
    public Person02(){}
   public  Person02(String name,int age){
    	this.name=name;
    	this.age=age;
    	
    }	
    public  Person02(String name,int age,String address){
			this(name,age);
			this.address=address;
		}
    void hello(){
    	System.out.println("hello....");
    }
    void introduce(){
    	System.out.println("����"+this.name+"�ҽ���"+this.age+",������"+this.address);
    	this.hello();
    	}
 }
           

	
	/**
	 * @param args
	 */
	
