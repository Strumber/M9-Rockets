package domain;

public class Propulsor {// extends Thread

	protected String id;
	protected int potencia;
	// protected Coet coet;

	public Propulsor(int potencia, String id) {
		this.id = id;
		this.potencia = potencia;

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

}
