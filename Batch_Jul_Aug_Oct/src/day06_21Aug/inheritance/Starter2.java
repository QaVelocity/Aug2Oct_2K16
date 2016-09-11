package day06_21Aug.inheritance;

public class Starter2 {

	public static void main(String[] args) {
		Players pl = new Players();
		
		Players2 pl2 = new Players2();
		System.out.println(pl2.s.isTopper());
		
		System.out.println(pl.isTopper());
	}
}
