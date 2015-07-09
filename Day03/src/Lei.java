class Phone{
		String name;
		String band;
		int price;
		void call(){
		System.out.println("人家可以打电话哦哦哦哦哦。。。。。");
		}
		void sendMESSAGE(){
			System.out.println("人家可以发信息哦哦哦哦哦哦哦。。。");
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
		p.band="爆米花";
		p.price=1999;
		System.out.println(p.name);
		p.sendMESSAGE();
		
	}

}
