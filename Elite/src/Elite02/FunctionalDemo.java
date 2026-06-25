package Elite02;

import java.util.*;
import java.util.function.*;
public class FunctionalDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Consumer<String> c= (s)-> System.out.println(s);
		c.accept("Adios");
		
		Consumer<String>c1=System.out::println;
		c1.accept("Hello");
		c1.accept("Ghurye");
		c1.accept("srinivas");
		
		Consumer<String>c2=FunctionalDemo::print;
		c2.accept("Aann");
		
		Supplier<String> s1=()->"S.C.Dubey";
		System.out.println(s1.get());
		print(s1.get());
		
		Supplier<Double> random =()->Math.random();
		System.out.println(random.get());
		
		Predicate<Integer> nonNegative =(x)->x>=0;
		System.out.println(nonNegative.test(-3));
		System.out.println(nonNegative.test(2));
		
		Predicate<Integer> isEven=(x)->x%2==0;
		System.out.println(isEven.test(6));
		
		BiPredicate<String,String> contains=(str,con)->str.contains(con);
		System.out.println(contains.test("Mumbai", "z"));
		
		Function<Integer,Integer> square=(x)->x*x;
		System.out.println(square.apply(5));
		
		BiFunction<Integer,Integer,Integer> greater=(a,b) ->a>b?a:b;
		System.out.println(greater.apply(10,20));
		
	}

}
