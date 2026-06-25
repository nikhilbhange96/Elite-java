package Elite02;

interface Greeting{
	void sayHello();
}

public class GreetDemo {
	  class GreetingInnerImp implements Greeting{
		
		public void sayHello() {
			System.out.println("Greeting Inner Impl");
		}
	}
	 void anotherDemo() {
		  class GreetingNestedImp implements Greeting{
			 @Override
			public void sayHello() {
				System.out.println("Greeting Nested Impl ");
				
			}
		 }
		 new GreetingNestedImp().sayHello();
	 }
	public static void main(String[] args) {
		GreetDemo demo=new GreetDemo();
		Greeting g1=demo.new GreetingInnerImp();
		g1.sayHello();
		demo.anotherDemo();
		Greeting g= new Greeting() {
			public void sayHello() {
				System.out.println("Greeting from Annonymous inner class ");
				
			}
		};
		g.sayHello();
		Greeting greet=()-> System.out.println("Greeting from Lambda");
		greet.sayHello();
		
	}

}
