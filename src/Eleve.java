import java.util.Date;

public class Eleve implements Comparable {
	String cne, nom, prenom;
	int dateNaissance;
	
	public Eleve(String cne, String nom, String prenom, int dateNaissance) {
		super();
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		
		
	}
	

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(int dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	

	@Override
	public String toString() {
		return "Eleve [cne=" + cne + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}

	@Override
	public int compareTo(Object o) {
		if(o.getClass().equals(Eleve.class)) {
		Eleve eleve = (Eleve)o;
		return this.cne.compareTo(eleve.getCne());
		}
		// TODO Auto-generated method stub
	return -1;
	}


	}
	
	/* compare 2 eleve avec nom prenom
	 * public int compareTo(Object o) {
		if(o.getClass().equals(Eleve.class)) {
		Eleve eleve = (Eleve)o;
		if (this.prenom.compareTo(eleve.getPrenom()==0)
			return this.nom.compareTo(getNom));
		return this.prenom.compareTo(eleve.getPrenom());
		}
	return -1;
	}
	
	 */
	


