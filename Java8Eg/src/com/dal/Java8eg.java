package com.dal;

interface Additionn {
	public int add(int a, int b,int c);
	public int sub(int a, int b);	
}

public class Java8eg {

	public static void main(String[] args) {
		//	Func_inter var=()->{}
		Additionn  sum=(a,b,c)->{
			return a+b+c;
		};
		Additionn  sub1=(a,b)->{
			return a-b;
		};
		System.out.println(sum.add(8,1,1));
		//System.out.println(sub1.sub(8, 1));
	}

}
