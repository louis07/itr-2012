import java.util.LinkedList;

/**
 * 
 */

/**
 * @author louis
 *
 */
public class Annuaire {
	/**
	 * List des elements enregistres dans l'annuaire
	 */
	
	private LinkedList <Contactable> annuaire;
	/**
	 * @param annuaire
	 */
	public Annuaire() {
		this.annuaire = new LinkedList <Contactable> ();
	}
	
	/**
	 * 
	 * @param sujet
	 * @return
	 */
	public boolean estEnregistre(Contactable sujet){
		if(this.annuaire.contains(sujet))return true;
		else return false;
	}
	/**
	 * 
	 * @param sujet
	 */
	public void enregistrer(Contactable sujet){
		this.annuaire.add(sujet);
		
	}
	
	/**
	 * 
	 * @param sujet
	 */
	public void deregistrer(Contactable sujet){
		this.annuaire.remove(sujet);
	}

}
