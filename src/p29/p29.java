package p29;

public class p29 {

	public static void main(String[] args) 
	{
		Vehicle[] vc = new Vehicle[2];//準備抽象類別的陣列
		//Car[] cars = new Car[2];
		vc[0]=new Car(1234,20.5);//第一個物件是Car類別
		vc[0].setSpeed(60);//Car速度
		
		vc[1]=new Plane(232);//第二個物件是Plane類別
		vc[1].setSpeed(500);//Plane速度
	
		for(int i=0;i<vc.length;i++)
		{
			vc[i].show();
		}
	}

}

abstract class Vehicle//抽象類別
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed=s;
		 System.out.println("將速度設為"+speed+ "了");
	}
	abstract void show();//抽象方法show
}

class Car extends Vehicle//延伸抽象類別:Car
{
	private int num;
	private double gas;
	
	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+ "汽油量為"+gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}

class Plane extends Vehicle//延伸抽象類別:Plane
{
	private int flight;
	
	public Plane(int f)
	{
		flight=f;
		System.out.println("生產了"+flight+ "班次的飛機");
	}
	
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}