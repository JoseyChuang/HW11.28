package p24;

public class p24 {

	public static void main(String[] args) {
		Car car1 = new Car();//呼叫建構式會顯示生產了車子
		
		car1.setCar(1234, 20.5);//將車號設為1234,汽油量設為20.5
		System.out.println(car1);//// 直接印出物件，會自動呼叫 toString() 方法
	}

}

class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
	 public void setCar(int n, double g)
	 {
		 num=n;
		 gas=g;
		 System.out.println("將車號設為"+num+ ",汽油量設為"+gas);
	 }
	 
	 public String toString() //覆寫Object類別的toString方法
	 {
		 String str ="車號"+num+"汽油量"+gas;
		 return str;//傳回值
	 }
}