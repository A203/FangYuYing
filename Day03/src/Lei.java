class Phone{
		String name;
		String band;
		int price;
		void call(){
		System.out.println("�˼ҿ��Դ�绰ŶŶŶŶŶ����������");
		}
		void sendMESSAGE(){
			System.out.println("�˼ҿ��Է���ϢŶŶŶŶŶŶŶ������");
		}
	}

public class Lei {
		/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p=new Phone();
		p.name="samsung";
		p.band="���׻�";
		p.price=1999;
		System.out.println(p.name);
		p.sendMESSAGE();
		
	}

}
