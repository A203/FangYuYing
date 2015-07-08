import java.util.Scanner;


public class IfUse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scanner=new Scanner(System.in);
           int score=scanner.nextInt();
           if(score>=90&&score<=100)
           {
        	   System.out.println("等级A");
           }
           else if(score>=80){
        	   System.out.println("等级B");
           }
           else if(score>=70){
        	   System.out.println("等级C");
           }
           else if(score>=60){
        	   System.out.println("等级D");
           }
           else{
        	   System.out.println("不及格！");
           }
           scanner.close();
	}

}
