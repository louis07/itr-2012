/**
 * 
 */

/**
 * @author louis
 *
 */
public class EntrepriseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entreprise comac = new Entreprise("Comac");
		Manager patron = new Manager("LI","Nicolas",true,1989,1,comac);
		Manager m1 = new Manager("J.A","Ayrault",true,1988,2,comac);
		Employe e1 = new Employe("D.","Boho",true,1990,3,comac);
		Manager m2 = new Manager("G.","Pierre",true,1991,4,comac);
		Manager m3 = new Manager("Fan","Sonia",false,1989,5,comac);
		Employe e2 = new Employe("Liu","nIU",true,1988,6,comac);
		Employe e3 = new Employe("Zhang","Xiao",true,1988,7,comac);
		
		patron.ajouteEmploye(m1);
		m1.ajouteEmploye(e1);
		m1.ajouteEmploye(m2);
		m2.ajouteEmploye(m3);
		m3.ajouteEmploye(e2);
		m3.ajouteEmploye(e3);
		
		patron.afficheHierarchie();
		System.out.println("------------------");
		m1.afficheHierarchie();
		System.out.println("------------------");
		
		System.out.println(patron.nombreEmploye());
		System.out.println(m3.nombreEmploye());
		
		System.out.println("------------------");
		System.out.println("------------------");
		patron.afficheSubordonnees();
		System.out.println(patron.nombreEmploye());
		System.out.println(patron.nombreFemmes());
		System.out.println(patron.pourcentFemme());

	}

}
