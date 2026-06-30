package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamDemo {

	public static void main(String[] args) {
		Map<String,String> people=new HashMap<>();
		
		people.put("Polo", "Pune");
		people.put("jack", "Mumbai");
		people.put("Deny", "Delhi");
		
		people.values().stream().forEach(System.out::println);
		
		List<String> cities=people.values().stream().map(c->c.toUpperCase()).sorted().collect(Collectors.toList());
		
		cities.forEach(System.out::println);
		
		Map<String,List<String>> contacts=new HashMap();
		contacts.put("Frudo", Arrays.asList("1212-3434","5656-7878"));
		contacts.put("sean", Arrays.asList("2212-3435","5657-7778"));
		contacts.put("Bean", Arrays.asList("3212-3438","5757-7600"));
		
		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
		
//		System.out.println(contacts.containsKey(8));
		
		//Print all phone numbers containing 8;
		List<String> lucky = contacts.values().stream().flatMap(Collection::stream)
				.filter(c -> c.contains("8")).collect(Collectors.toList());
		lucky.forEach(System.out::println);
		
		//print all phone numbers removing "-";
		contacts.values().stream().flatMap(Collection::stream).map(c -> c.replace("-", "")).forEach(System.out::println);

	}

}
