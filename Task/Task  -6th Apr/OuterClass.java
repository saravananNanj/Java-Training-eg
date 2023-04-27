package New;

public class OuterClass {
	int x =7;
	 class  MyInner 
	{
		public void InnerMethod()
		{
			System.out.println("x == " + x);
		}
	}
	public void OuterMethod()
	{
		System.out.println("From outer method = " + x);
		MyInner inn = new MyInner();
		inn.InnerMethod();
	}
	public static void main(String[] a)
	{
		OuterClass mo = new OuterClass();
	//MyInner inn = new MyInner(); //invalid
	//inn.InnerMethod();
	//<outerclassname>.<innerclassname> objname = <outerclass instancename>.new <innerclassname>();
		OuterClass.MyInner mi = mo.new MyInner(); //instantiate inner class
	mi.InnerMethod();
	mo.OuterMethod();
	//mi.OuterMethod();  illegal
	//mo.InnerMethod();   illegal 
		
	}

}

//Check whether the inner class can be abstract  Yes but cnt be called out
//can it be inherited? Yes can be inherited
//scope of instance variable within the inner class  Yes
//scope of local variable within the inner class yEs
