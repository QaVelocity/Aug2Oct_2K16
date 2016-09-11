package day06_21Aug.abstarction.secondpck;

import day06_21Aug.abstarction.firstpck.DummyA;
import day06_21Aug.abstarction.firstpck.Familly;
import day06_21Aug.abstarction.firstpck.GrandFamilly;
import day06_21Aug.abstarction.firstpck.Lab;

public class Initiator2 {
	public static void main(String[] args) {
		GrandFamilly gf =  new GrandFamilly("Wow");
		
		Familly samFam  = new Familly("Samer");
		System.out.println(samFam.getNickName());
		
		/*DummyA da =  new DummyA("Samer", "Sam");
		da.setNickName("Sameera");		
		System.out.println(da.getNickName());*/
		
		/*Lab compL =  new Lab();
		//compL.
		Stu*/
	}
}
