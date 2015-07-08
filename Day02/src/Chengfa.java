import java.util.Scanner;


public class Chengfa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scanner=new Scanner(System.in);
  System.out.println("ÇëÊäÈëĞĞÊı");
  int num=scanner.nextInt();
  int i,j;
  for(i=1;i<=num;i++){
	  for(j=1;j<=i;j++){
		System.out.print(i+"*"+j+"="+(i*j)+'\t');
	  }
	  System.out.println(' ');
	}
  scanner.close();
	}
}
