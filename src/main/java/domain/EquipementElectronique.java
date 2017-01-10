package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EquipementElectronique {
	@Id
	@GeneratedValue
	long id;
	
	double consoMoyenne;
	
	@ManyToOne
	Maison maison;

	public double getConsoMoyenne() {
		return consoMoyenne;
	}

	public void setConsoMoyenne(double consoMoyenne) {
		this.consoMoyenne = consoMoyenne;
	}

	public Maison getMaison() {
		return maison;
	}

	public void setMaison(Maison maison) {
		this.maison = maison;
	}
	
	
}
