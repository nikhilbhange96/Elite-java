package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStreamDemo {
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Integer[]arr= {3,8,4,5,6,7};
		List<Integer>numbers=Arrays.asList(arr);
		
//		for(int i:arr) {
//			System.out.println(i);
//		}
		
		Stream<Integer> str1=numbers.stream();
//		str1.forEach(System.out::println);
//		System.out.println(str1.count());
		
//		numbers.stream().distinct().forEach(System.out::println);
		
//		System.out.println(numbers.stream().distinct().count());
		
//		System.out.println(numbers.stream().filter(n ->n>5).count());
		
//		numbers.stream().distinct().forEach(System.out::println);
		
//		System.out.println(numbers.stream().reduce(0, (n, m) -> n + m));
		
		System.out.println(numbers.stream().reduce(0, Integer::sum));
		System.out.println(numbers.stream().reduce(0, FirstStreamDemo::add));
		
		numbers.stream().limit(5).forEach(System.out::println);	// limit is intermediate
		
		IntStream istr = IntStream.range(1, 99);
//		System.out.println(istr.count());
//		System.out.println(istr.sum());
//		System.out.println(istr.skip(50).sum());
		
//		IntStream istr2 = IntStream.of(5, 7, 6, 9, 3, 2, 4);
//		System.out.println(istr2.count());
//		System.out.println(istr2.sum());
		
		IntSummaryStatistics statics = istr.summaryStatistics();
//		System.out.println(statics)
	}

}
