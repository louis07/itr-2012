import java.util.LinkedList;

/**
 * 
 */

/**
 * @author louis
 *
 */
public class Manager extends Employe {
	
	private LinkedList <Employe> employes;
	private Manager manager;

	/**
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param anneeNaissance
	 * @param numero
	 * @param entreprise
	 */
	public Manager(String nom, String prenom, boolean sexe, int anneeNaissance,
			int numero, Entreprise entreprise) {
		super(nom, prenom, sexe, anneeNaissance, numero, entreprise);
		this.manager = null;
		this.employes = new LinkedList <Employe> ();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	public void ajouteEmploye(Employe e){
		this.employes.add(e);
		if(e instanceof Manager){
			Manager m = (Manager) e;
			m.setManager(this);
		}
		
	}
	
	protected String getNomComplet(){
		return this.getNom()+" "+this.getPrenom();
	}
	public void afficheHierarchie(){
		if(this.manager == null)System.out.println(this.getNomComplet()+" est le patron.");
		else {
			System.out.println(this.manager.getNomComplet()+" est le chef de "+this.getNomComplet());
			this.manager.afficheHierarchie();
		}
	}
	
	public int nombreEmploye(){
		int s =0;
		s += this.employes.size();
		for (Employe e : this.employes){
			if(e instanceof Manager){
				Manager m = (Manager) e;
				s += m.nombreEmploye();
			}
		}
		return s;
	}
	
	public void afficheSubordonnees(){
		for (Employe e : this.employes){
			System.out.println("\t"+ e.getNom()+" "+e.getPrenom());
			if (e instanceof Manager){
				Manager m = (Manager) e;
				m.afficheSubordonnees();
			}
			
		}
	}
	
	public int nombreFemmes(){
		int nombreFemme =0;
		for(Employe e : this.employes){
			if(!e.isSexe())nombreFemme++;
			if(e instanceof Manager){
				Manager m = (Manager) e;
				nombreFemme += m.nombreFemmes();
				}
			}
		return nombreFemme;
		}
	public float pourcentFemme(){
		return (float) this.nombreFemmes()/this.nombreEmploye();
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Manager " + super.toString() ;
	}

	

}
