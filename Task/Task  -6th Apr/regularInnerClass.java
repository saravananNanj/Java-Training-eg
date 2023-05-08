package com.extra;


class regularInnerClass
{
	int x =10;
	public void OuterMethod()
	{
		int j=90;
		abstract class Test 
		{
			public void minnerMethod()
			{
				int m= 54;
				System.out.println(m);
			System.out.println("Hello ..." + x + j);
			}
		}
	
		class secondclass extends Test
		{
			public void msecondmethod()
			{
			System.out.println("from innerclass");
			//minnerMethod() ;
			}
		}
		
 
	}	
	public static void main(String[] a)
	{
		regularInnerClass moc = new regularInnerClass();
		moc.OuterMethod();		
	
		//MinnerClass mic = new MinnerClass();
		//mic.minnerMethod();
	}
}

