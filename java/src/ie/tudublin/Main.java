package ie.tudublin;

public class Main
{

	public static void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }
	
	public static void main(String[] args)
	{
		
		System.out.println("Hello world");
		
		Cat fluffy = new Cat();
		fluffy.setName("fluffy");
		fluffy.setnumLives(9);
		//System.out.println(ginger.getnumLives());
		while(fluffy.getnumLives()>0)
		{
			fluffy.Kill();

			helloProcessing();

		}
	}
	
}