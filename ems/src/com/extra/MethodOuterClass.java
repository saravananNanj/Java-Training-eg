package com.extra;

public class MethodOuterClass {
			int x =10;
			abstract class M2innerClass
			{
				public void minnerMethod()
				{
				System.out.println("Hello ..." + x);
				}
			}
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
			MethodOuterClass moc = new MethodOuterClass();
			moc.OuterMethod();		
		}
	}


	//Create instance and local variable inside the inner class and access
	// Can the method local inner class be abstract?













