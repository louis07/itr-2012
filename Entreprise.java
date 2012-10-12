/**
 * 
 */

/**
 * @author moreau
 *
 */
public class Entreprise implements Contactable{
	/**
	 * nom de l'entreprise
	 */
	private String nom;
	
	/**
	 * contact de l'entreprise
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
	 * constructeur qui cr�e une entreprise
	 */
	public Entreprise(String nom) {
		this.nom = nom;
	}
	
	public Contact getContactInfo(){
		return this.contact;
		
	}
	
	public void setContactInfo(Contact contact){
		this.contact = contact;
		
	}
	
	
}

