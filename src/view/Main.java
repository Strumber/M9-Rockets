package view;

import java.util.Scanner;
import domain.Coet;
import domain.Propulsor;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Coet amb 3 propulsors
		Coet c1 = new Coet("32WESSDS");
		c1.addPropulsor(new Propulsor(10, "32WESSDS p1"));
		c1.addPropulsor(new Propulsor(30, "32WESSDS p2"));
		c1.addPropulsor(new Propulsor(80, "32WESSDS p3"));

		// coet amb 6 propulsors
		Coet c2 = new Coet("LDSFJA32");
		c2.addPropulsor(new Propulsor(30, "LDSFJA32 p1"));
		c2.addPropulsor(new Propulsor(40, "LDSFJA32 p2"));
		c2.addPropulsor(new Propulsor(50, "LDSFJA32 p3"));
		c2.addPropulsor(new Propulsor(50, "LDSFJA32 p4"));
		c2.addPropulsor(new Propulsor(30, "LDSFJA32 p5"));
		c2.addPropulsor(new Propulsor(10, "LDSFJA32 p6"));

		System.out.println("M9 Rockets");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("compte enrere");
		for (int i = 10; i >= 0; i--) {
			System.out.println("--> "+i);

			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		// inici threads

		c1.iniciar();
		c2.iniciar();
		while (true) {
			int obj = sc.nextInt();
			c1.setObjectiu(obj);
			c2.setObjectiu(obj);

		}

	}

}
