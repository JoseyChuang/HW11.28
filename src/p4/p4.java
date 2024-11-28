package p4;

public class p4 {

	public static void main(String[] args) 
	{
		RacingCar rccar1;
		rccar1 = new RacingCar();//建立子類別的物件
		
		rccar1.setCar(1234,20.5);//呼叫子類別繼承的方法
		
		rccar1.setCourse(5);//呼叫子類別新增的方法
	}

}

class Car
{
	private int num;
	private double gas;//私有，子類別無法繼承
	
	public Car()//父類別建構式
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g) //被子類別繼承的方法
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+ ",汽油量設為"+gas);
	}
	
	/*public void show()//被子類別繼承的方法
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}*/
}

class RacingCar extends Car//賽車繼承了汽車
{
	private int course;//子類別新增的欄位
	
	public RacingCar() //子類別建構式
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c) //子類別新增的方法
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
}