package p17;

public class p17 {

	public static void main(String[] args) {
		Car cars[] = new Car[2];;//準備父類別的陣列 
		
		cars[0]= new Car();//建立父類別的物件
		cars[0].setCar(1234, 20.5);//設定汽車車號跟汽油量
		
		cars[1]= new RacingCar();//建立子類別的物件
		cars[1].setCar(4567, 30.5);//設定賽車車號跟汽油量
		
		for(int i=0;i<cars.length;i++)	//多型的程式架構
		{
			cars[i].show();
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

	public void setCar(int n,double g) 
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+ ",汽油量設為"+gas);
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class RacingCar extends Car
{
	private int course;
	
	public RacingCar() 
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c) 
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	
	public void show() 
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}
