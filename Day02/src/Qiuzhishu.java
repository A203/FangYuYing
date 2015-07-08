
public class Qiuzhishu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
      for(int i=2;i<=100;i++)
      {
   for(int j=2;j<i;j++){
    		  if(i%j==0)
    		  {
    			  System.out.println(i+"不是质数");
    			 break;
    		  }
    	/*step:
    	 * for(int i=2;i<=100;i++)
      {
   for(int j=2;j<i;j++){
    		  if(i%j==0){
    		  continue step:
    		  }
    		  }
    		  system.out.println(i+"是质数")
    	 */
    	  }
    	
      }
	}
}

