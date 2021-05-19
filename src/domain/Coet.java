package domain;

import java.util.ArrayList;

public class Coet {

	protected String codi;
	protected ArrayList<Propulsor> propulsors;

	
	public Coet(String codi) {

		this.codi = codi;
		this.propulsors = new ArrayList<Propulsor>();
	}

	public void addPropulsor(Propulsor p) {
		this.propulsors.add(p);
	}

	public String getCodi() {
		return codi;
	}

	public void setCodi(String codi) {
		this.codi = codi;
	}

	public ArrayList<Propulsor> getPropulsor() {
		return propulsors;
	}

	@Override
	public String toString() {
		String res = "Coet [id_coet :=" + getCodi() + ", nº propulsor:" + propulsors.size() + "\n";
		for (Propulsor p : propulsors) {
			res += p + "\n";
		}
		return res;
	}

}
