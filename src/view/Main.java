package view;

//import java.util.ArrayList;
import domain.Coet;
import domain.Propulsor;

public class Main {
	
	public static void main(String[] args) {
		//Coet amb 3 propulsors
		Coet c1 = new Coet("32WESSDS");
		c1.addPropulsor(new Propulsor(10,"p1"));
		c1.addPropulsor(new Propulsor(30,"p2"));
		c1.addPropulsor(new Propulsor(80,"p3"));
		
		//coet amb 6 propulsors
		Coet c2 = new Coet("LDSFJA32");
		c2.addPropulsor(new Propulsor(30,"p1"));
		c2.addPropulsor(new Propulsor(40,"p2"));
		c2.addPropulsor(new Propulsor(50,"p3"));
		c2.addPropulsor(new Propulsor(50,"p4"));
		c2.addPropulsor(new Propulsor(30,"p5"));
		c2.addPropulsor(new Propulsor(10,"p6"));
		
		System.out.println ("M9 Rockets");
		System.out.println(c1);
		System.out.println(c2);
	
		
		
		
		
		

	}

}
