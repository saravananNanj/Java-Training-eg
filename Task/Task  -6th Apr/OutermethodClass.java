package New;

public class OutermethodClass {
	int x =10;
	public void OuterMethod()
	{
		int j=90;
		class MinnerClass
		{
			public void minnerMethod()
			{
			System.out.println("Hello ..." + x + j);
			}
		}
		MinnerClass mic = new MinnerClass();
		mic.minnerMethod();		
		
	}	
	public static void main(String[] a)
	{
		OutermethodClass moc = new OutermethodClass();
		moc.OuterMethod();		
	
		//MinnerClass mic = new MinnerClass();
		//mic.minnerMethod();
	}
}
