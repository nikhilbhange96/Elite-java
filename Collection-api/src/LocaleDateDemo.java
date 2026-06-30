import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class LocaleDateDemo {

	public static void main(String[] args) {
		
		LocalDate d1=LocalDate.now();
		System.out.println(d1);
		LocalDate d2=LocalDate.of(2012,02,13);
		System.out.println(d2);
		LocalDate d3=LocalDate.parse("2019-05-18");
		System.out.println(d3);
		
		System.out.println(d1.plusDays(1));
		System.out.println(d1.minus(1, ChronoUnit.DAYS));
	}

}
