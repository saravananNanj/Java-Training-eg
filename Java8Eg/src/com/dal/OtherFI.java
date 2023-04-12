package com.dal;

import java.io.IOException;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;
import com.dal.AuthController;


public class OtherFI  {

	public static void main(String[] args) throws IOException {
		
		AuthController obj = new AuthController();
		 
		obj.ValidateUser();
		
		BiPredicate<String, String> res = (un, pw) -> un.equals(pw);
		System.out.println(res.test("abc", "abc"));
		
		if (res.test("Priya", "Priya")) {
			System.out.println("Welcome ");
		} else {
			System.out.println("Welcome Guest");
		}
		
		if (res.test("Priya", " ")) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
				
		BiPredicate<Long, Long> p1 = (x, y) -> x >= y;
		BiPredicate<Long, Long> p2 = (x, y) -> x == y;

		System.out.println(p1.test(102L, 101L));
		System.out.println("Equal");
		System.out.println(p1.test(100l, 100l));
		System.out.println("AND");
		System.out.println(p1.and(p2).test(101L, 101L));

		Supplier<String> s = () -> {
			return "Priya";
		};
		System.out.println(s.get());

		Supplier<Integer> s1 = () -> {
			return 123;
		};
		System.out.println(s1.get());
		
		Function<Integer,String> evenorodd = (num)->{
			if(num%2 == 0) {
			return num + " is even .";
			}
			else
			{
				return num + " is odd";
			}
			
		};
		System.out.println(evenorodd.apply(52));
		
		
	}

}
