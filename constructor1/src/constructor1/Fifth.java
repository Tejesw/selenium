package constructor1;

public class Fifth 
{
	Fifth (int a)
	{
		System.out.println("My first constructor");
	}
    Fifth (double b,int a)
    {
    	System.out.println("My second constructor");
    }
    Fifth (char c,double b,int a)
    {
    	System.out.println("My third constructor");
    }
    Fifth(char c,double b)
    {
    	System.out.println("My fourth constructor");
    }
    Fifth(double b)
    {
    	System.out.println("My fifth constructor");
    }
	public static void main(String[] args) {
		System.out.println("We love software testing");
		new Fifth(1);
		new Fifth(0.1,1);
		new Fifth('M',12.98,1);
		new Fifth('c',92.1);
		new Fifth(0.01);

	}

}

