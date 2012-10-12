/**
 * Ceci est le fichier de ma classe Personne
 */

class NoContactInfoException extends Exception {}

/**
 * @author moreau
 * une classe Personne qui va d�finir les informations relatives � une Personne
 */
public class Personne implements Contactable {
	
	/** 
	 * Le nom de la personne
	 */
	private String nom;
	
	/**
	 *  Le pr�nom de la personne
	 */
	private String prenom;
	
	/**
	 *  Le sexe de la personne (vrai si c'est un homme)
	 */
	private boolean sexe;
	
	/**
	 *  L'ann�e de naissance de la personne
	 */
	private int anneeNaissance;
	
	/**
	 *  Le contact de la personne
	 */
	private Contact contact;
	
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @return the sexe
	 */
	public boolean isSexe() {
		return sexe;
	}


	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}


	/**
	 * @return the anneeNaissance
	 */
	public int getAnneeNaissance() {
		return anneeNaissance;
	}


	/**
	 * @param anneeNaissance the anneeNaissance to set
	 */
	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	
	/**
	 * @return the contact
	 * @throws NoContactInfoException 
	 */
	public Contact getContactInfo() throws NoContactInfoException {
		if(this.contact == null)throw new NoContactInfoException();
		else return this.contact;
	}


	/**
	 * @param contact the contact to set
	 */
	public void setContactInfo(Contact contact) {
		this.contact = contact;
	}


	public String toString() {
		String s = new String();
		s += this.nom + " " + this.prenom + " " + (this.sexe ? "H" : "F") + " "+this.anneeNaissance;
		return s;
	}
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param anneeNaissance
	 */
	public Personne(String nom, String prenom, boolean sexe, int anneeNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.anneeNaissance = anneeNaissance;
		this.contact = null;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne p = new Personne("Moreau","Guillaume",true,1973);
		
		try {
			p.getContactInfo();
		}
		catch (NoContactInfoException e){
			System.out.println("No ContactInfo registred yet.");
			
		}
		
		System.out.println(p);
		
	}


	

}
