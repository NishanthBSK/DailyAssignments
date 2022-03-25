
public class DayFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pulsar p=new Pulsar();

	}
	
	
	

}
class Bike
{
	Bike()
	{
	System.out.println("Bike");
	}
}
class Pulsar extends Bike
{
	Engine e;

	public Pulsar() {
		super();
		System.out.println("Pulsar");
		e= new Engine();
	}
	
	
}

class Engine
{
	Engine()
	{
		System.out.println("Engine");
	}
}
