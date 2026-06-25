package Elite02;



public class Demo<T>{
	private T data;
	public Demo (T data) {
		this.data=data;
	}
	public T getData(){
		return data;
	}
	public void setdata(T data) {
		this.data=data;
	}
	public class SubDemo<T,P> extends Demo<T>{
		private P temp;
		public SubDemo(T data ,P temp) {
			super (data);
			this.temp=temp;
		}
		public P getTemp() {
			return temp;
		}
		public void setTemp(P temp) {
			this.temp = temp;
		}
		
	}
	public static void main(String[] args) {
		Demo<String> d1= new Demo<>("Talcott");
		System.out.println(d1.getData());
		
		//SubDemo<String,Integer>=new SubDemo<String,Integer>("Ann ",23);
	}
}

//public class Demo {
//	private Object data;
//
//	public Demo(Object data) {
//		super();
//		this.data = data;
//	}
//
//	public Object getData() {
//		return data;
//	}
//
//	public void setData(Object data) {
//		this.data = data;
//	}
//	
//	public static void main(String[] args) {
//		Demo d1= new Demo("Max Weber");
//		d1.setData("Ideal types");
//		System.out.println(d1.getData());
//		
//		
//		Demo d2= new Demo(1839);
//		System.out.println(d2.getData());
//		
//		Demo d3= new Demo(new Person("Karl",22));
//		System.out.println(d3.getData());
//	}
//
//}
