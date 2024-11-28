package p26;

public class p26 {

	public static void main(String[] args) 
	{
		Car[] cars = new Car[2];
		
		cars[0]= new Car();//第一個物件為Car類別
		cars[1]= new RacingCar();//第二個物件為RacingCar類別
		
		for(int i=0;i<cars.length;i++)
		{
			Class cl = cars[i].getClass();//getClass方法回傳Class物件
			System.out.println("第"+(i+1)+"個物件的類別是"+cl);
		}
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
}

class RacingCar extends Car
{
	public RacingCar()
	{
		System.out.println("生產了賽車");
	}
}