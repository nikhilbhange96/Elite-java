package Elite02;

interface Hello{
	String greet();
	
	default void demo() {
		System.out.println("Demo Andre Betteile");
	}
	static void test() {
		System.out.println("Test Y.Singh");
	}
	
}
@FunctionalInterface
interface Printer{
	void print(String name);
}

public class LambdaDemo {
	public static void main(String[] args) {
		Hello h1=()->"Hello Lambda";
		System.out.println(h1.greet());
		
		Hello h2=()->{
			String msg="Bonjour Lambda";
			return msg;
		};
		System.out.println(h2.greet());
		
		Printer p1=(name)-> System.out.println(name);
		p1.print("Gail Omvedt");
		
		Printer p2=System.out::println;
		p2.print("Louis Dumont");
		
//		Hello h=System.out::println;
//		h.demo();
		
		h1.demo();
		Hello.test();
		
	}

}
