
public class Shuzu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[];
        a=new int[5];
        a[0]=4;
        a[1]=2;
        a[2]=8;
        a[3]=17;
        a[4]=77;
        for(int i=0;i<=a.length-1;i++){
        	System.out.print(a[i]);
        	System.out.print("\t");
        	
        	}
        System.out.println(" ");
        int temp=0;
        	int b[]={13,5,2,19,7};
        	for(int i=b.length-1;i>0;i--){
        		for(int j=0;j<i;j++){
        			
        			if(b[i]<b[j])
        			{
        				temp=b[i];
        				b[i]=b[j];
        				b[j]=temp;
        			}
        			
						
						}
					}
        	for(int i=0;i<=b.length-1;i++){
				System.out.println(b[i]);
        		}
        	}
      
	
	}
      
