import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drawer {
	private int hauteur;
	private int largeur;
	private String signe;
	
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
	
	public void rectangle() {
		for (int i = 0; i < hauteur; i++) {
			List<String> list = new ArrayList<String>();
			for (int j = 0; j < largeur; j++) {
				list.add(signe);
			}
			System.out.println(list);
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
	
	public void dimension() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Donnez une hauteur: "); 
		int nouvelleHauteur = reader.nextInt();
		
		System.out.println("Donnez une largeur: ");
		int nouvelleLargeur = reader.nextInt();
		
		System.out.println("Donnez un signe: ");
		String nouveauSigne = reader.next();
				
		reader.close(); 
		
		setHauteur(nouvelleHauteur);
		setLargeur(nouvelleLargeur);
		setSigne(nouveauSigne);
	}
}
