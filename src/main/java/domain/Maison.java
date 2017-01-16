package domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Maison {
	@Id
	@GeneratedValue
	long id;
	
	long taille;
	int nbrePiece;
	
	@OneToMany(mappedBy="maison", cascade={CascadeType.REMOVE, CascadeType.REFRESH})
	List<Chauffage> chauffages;

	@OneToMany(mappedBy="maison", cascade={CascadeType.REMOVE, CascadeType.REFRESH})
	List<EquipementElectronique> EquipementElectroniques;	
	
	@ManyToMany(mappedBy="residences")
	List<Person> habitants;
	
	public long getTaille() {
		return taille;
	}

	public void setTaille(long taille) {
		this.taille = taille;
	}

	public int getNbrePiece() {
		return nbrePiece;
	}

	public void setNbrePiece(int nbrePiece) {
		this.nbrePiece = nbrePiece;
	}

	public List<Chauffage> getChauffages() {
		return chauffages;
	}

	public void setChauffages(List<Chauffage> chauffages) {
		this.chauffages = chauffages;
	}

	public List<EquipementElectronique> getEquipementElectroniques() {
		return EquipementElectroniques;
	}

	public void setEquipementElectroniques(List<EquipementElectronique> equipementElectroniques) {
		EquipementElectroniques = equipementElectroniques;
	}

	
	
}
