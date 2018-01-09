import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drawer {
	private int hauteur;
	private int largeur;
	private String signe;
	private String bordure;
	private boolean animation;
	
	public Drawer(int hauteur, int largeur) {
		this.hauteur = hauteur;
		this.largeur = largeur;
	}

	public int getHauteur() {
		return hauteur;
	}
	
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	
	public int getLargeur() {
		return largeur;
	}
	
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	public String getSigne() {
		return signe;
	}
	
	public void setSigne(String signe) {
		this.signe = signe;
		
	}
	
	public boolean isAnimation() {
		return animation;
	}

	public void setAnimation(boolean animation) {
		this.animation = animation;
	}
	
public void rectangle() {
	for (int i = 0; i < hauteur; i++) {
		for(int j = 0; j < largeur; j++) {
			// Condition if pour mettre en place la bordure interne 
			if (i == 0 || j == 0 || i == hauteur - 1 || j == largeur - 1) {
				System.out.print(bordure);
			}else {
				System.out.print(signe);
			}
		}
		System.out.println();
		if (animation) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	
	public void triangleInverse() {
		for (int i = 0; i < hauteur; i++) {
			List<String> list = new ArrayList<String>();
			for (int j = largeur-i; j > 0; j--) {
				list.add(signe);
			}
			System.out.println(list);
		}
	}
	
	public void triangle() {
		for (int i = hauteur; i > 0; i--) {
			List<String> list = new ArrayList<String>();
			for (int j = largeur-i; j > 0; j--) {
				list.add(signe);
			}
			System.out.println(list);
		}
	}
	
	public String getBordure() {
		return bordure;
	}

	public void setBordure(String bordure) {
		this.bordure = bordure;
	}
	
	// Données à passer au système
	public void dimension() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Donnez une hauteur: "); 
		int nouvelleHauteur = reader.nextInt();
		
		System.out.println("Donnez une largeur: ");
		int nouvelleLargeur = reader.nextInt();
		
		System.out.println("Donnez un signe: ");
		String nouveauSigne = reader.next();
		
		System.out.println("Donnez un signe pour la bordure: ");
		String nouvelleBordure = reader.next();
		
		System.out.println("Tapez true pour animer sinon tapez autre chose: ");
		boolean nouvelleAnimation = reader.hasNextBoolean();
				
		reader.close(); 
		setHauteur(nouvelleHauteur);
		setLargeur(nouvelleLargeur);
		setSigne(nouveauSigne);
		setBordure(nouvelleBordure);
		setAnimation(nouvelleAnimation);
	}

	
}
