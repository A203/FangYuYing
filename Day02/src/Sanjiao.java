import java.util.Scanner;


public class Sanjiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner=new Scanner(System.in);
		  System.out.println("����������");
		  int num=scanner.nextInt();
		  int i,j;
		  for(i=1;i<=num;i++){
			  for(j=1;j<=i;j++){
				System.out.print('*');
			  }
			  System.out.println(' ');
		  }
		  scanner.close();  
	}

}
