import java.util.Scanner;


public class Sanjiao2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { Scanner scanner=new Scanner(System.in);
	  System.out.println("ÇëÊäÈëĞĞÊı");
	  int num=scanner.nextInt();
	  int i,j,k;
	  for(i=1;i<=num;i++){
		  for(j=1;j<=num-i;j++){
			System.out.print(" ");
		  }
		  for(k=1;k<=i*2-1;k++){
		  System.out.print("*");
		  }
		  System.out.println();
		// TODO Auto-generated method stub

	}
	  scanner.close();
	}
}
