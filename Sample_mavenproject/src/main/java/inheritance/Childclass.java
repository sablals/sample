package inheritance;

public class Childclass extends Parentclass
{
	
		public void  print()
		{
			System.out.println("Hello");
		}
		public static void main(String[] args)
		{
			Childclass c= new Childclass();
			c.print();
			c.sum();
		}
	}
	


