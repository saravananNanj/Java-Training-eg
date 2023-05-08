package com.extra;

class MOuter
{
  int count;
  public void Print()
  {
    for(int i=0;i<5;i++)
    {
     
      class InnerClassExample
      {
        public void show()
        {
          System.out.println("From inner class "+(count++));
        }
      }
      InnerClassExample innerEg=new InnerClassExample();
      innerEg.show();
    }
  }
}

class MethodLocalInnerClassExample
{
  public static void main(String[] args)
  {
    MOuter oout = new MOuter();
    oout.Print();
  }
}