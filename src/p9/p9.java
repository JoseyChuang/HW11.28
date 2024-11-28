package p9;

public class p9 {
	public static void main(String[] args) {
		RacingCar rccar1 = new RacingCar();
		
		rccar1.Show();//呼叫子類別的方法
	}
}

class Car
{
	protected int num;
	protected double gas;//父類別的成員設為保護成員
	
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

class RacingCar extends Car//子類別的成員設為私人成員
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
	
	public void Show() 
	{
		System.out.println("賽車的車號是"+num);//子類別的成員可以存取保護成員
		System.out.println("汽油量是"+gas);//子類別的成員可以存取保護成員
		System.out.println("賽車編號是"+course);
	}
}