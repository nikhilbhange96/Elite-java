import java.util.HashMap;

public class MapDemo {
	
	public static void main(String[] args) {
		HashMap<String,String> mp=new HashMap();
		
		mp.put("Jack","Sparraw");
		mp.put("Rob","Stark");
		mp.put("John","Snow");
		mp.put("Ned","Stark");
		
		System.out.println("jack"+mp.get(" Sparraw"));
		
		for(String e:mp.keySet())
			System.out.println(e+":"+mp.get(e));
		
		System.out.println("😂😂😂 ");
		mp.forEach((key,value)->
			System.out.println(key+":"+value));
		
		
		
	}

}
