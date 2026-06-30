import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;



public class CollectionDemo {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("Microsoft");
		list.add("Apple");
		list.addFirst("Facebook");
		list.add(2,"Amazon");
		list.addLast("Google");
		
		System.out.println("Traversing Using For Loop");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Traversing Using Iterator");
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Traversing Using For each");
		for(String e:list)
			System.out.println(e);
		
		System.out.println("Traversing Using for-each method");
		list.forEach(System.out::println);
		
		ArrayList<String> ar=new ArrayList<>();
		
		ar.add("IBM");
		ar.add("JpMorgan");
		ar.add("Infosys");
		
		ar.addAll(list);
		System.out.println("Traversing over Merged Collection ");
		for(String e:ar)
			System.out.println(e);
		
		HashSet<String>set=new HashSet<>(ar);
		System.out.println("Traversing over Set collection");
		for(String e:set)
			System.out.println(e);
		
		TreeSet<String>tree=new TreeSet<>(ar);
		System.out.println("Traversing over Sorted collection");
		for(String e:tree)
			System.out.println(e+" 😊");
	}

}
