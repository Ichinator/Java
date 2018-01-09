import java.util.Scanner;

public class PointClass {
	private String name;
	private int abscisse;
	private int ordonnee;

	public PointClass(String name, int abscisse, int ordonnee) {
		this.name = name;
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAbscisse() {
		return abscisse;
	}

	public void setAbscisse(int abscisse) {
		this.abscisse = abscisse;
	}

	public int getOrdonnee() {
		return ordonnee;
	}

	public void setOrdonnee(int ordonnee) {
		this.ordonnee = ordonnee;
	}
	
	public void display () {
		System.out.println("Voici le nom: "+getName()+"\nVoici son abscisse: "
				+getAbscisse()+"\nVoici son ordonnée: "+getOrdonnee());
	}
	
	public void translate() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Donnez un nouveau nom: "); 
		String nouveauNom = reader.next(); // Lecture du nouveau nom
		
		System.out.println("Donnez une nouvelle abscisse: ");
		int nouvelleAbscisse = reader.nextInt(); // Lecture de la nouvelle abscisse
		
		System.out.println("Donnez une nouvelle ordonnée: ");
		int nouvelleOrdonnee = reader.nextInt(); // Lecture de la nouvelle ordonnée
		
		reader.close(); 
		
		setName(nouveauNom);
		setAbscisse(nouvelleAbscisse);
		setOrdonnee(nouvelleOrdonnee);
		
		
	}
}
