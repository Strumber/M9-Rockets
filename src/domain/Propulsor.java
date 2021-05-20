package domain;

public class Propulsor extends Thread {

	protected String id;
	protected int potencia;
	protected int pActual;
	protected int objectiu;
	protected Coet coet;

	public Propulsor(int potencia, String id) {
		this.id = id;
		this.potencia = potencia;
		this.pActual = 0;
		// this.objectiu = 0;

	}

	public void setObjectiu(int obj) {
		if (obj > potencia) {
			this.objectiu = potencia;
		} else if (obj <= 0) {
			this.objectiu = 0;
			System.out.println("Aturant Propulsor : " + this.id + "-->");

		} else {
			this.objectiu = obj;
		}

	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "[id propulsor = " + id + ", potencia= " + potencia + "]";
	}

	public void setObjetiu(int potencia) {
		this.potencia = potencia;
	}

	public void run() {

		boolean conseguida = false;

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if (objectiu < pActual) {
				pActual--;// frenar
				System.out.println("Propulsor : " + this.id + "-->" + Thread.currentThread().getName()
						+ " Pot. Actual: " + pActual + " Objectiu : " + objectiu + " Pot. Max: " + potencia);

				conseguida = false;

			} else if (objectiu > pActual) {
				pActual++; // acelerar
				System.out.println("Propulsor : " + this.id + "-->" + Thread.currentThread().getName()
						+ " Pot. Actual: " + pActual + " Objectiu : " + objectiu + " Pot. Max: " + potencia);

				conseguida = false;

			} else { // Actual = objectiu

				if (!conseguida) {

					System.out.println("Propulsor : " + this.id + "-->" + Thread.currentThread().getName()
							+ " Objectiu aconseguit !!!");

					conseguida = true;

				}
			}
		}

	}
}
