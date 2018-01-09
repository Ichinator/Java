import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drawer {
	private int hauteur;
	private int largeur;
	private String signe;
	private String bordure;
	private boolean animation;
	private int dureeAnimation;
	
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
	
	public String getBordure() {
		return bordure;
	}

	public void setBordure(String bordure) {
		this.bordure = bordure;
	}
	
	public int getDureeAnimation() {
		return dureeAnimation;
	}

	public void setDureeAnimation(int dureeAnimation) {
		this.dureeAnimation = dureeAnimation;
	}

	/**

	 * Draw a rect

	 * @param hauteur

	 * 			height of the rect (int)

	 * @param largeur

	 * 			width of the rect (int)

	 * @param animate

	 * 			whether the drawing should be animated or not (boolean)

	 * @param bordure

	 * 			the bordure character

	 *

	 */
	
public void rectangle() {
	for (int i = 0; i < hauteur; i++) {
		for(int j = 0; j < largeur; j++) {
			// Condition if pour mettre en place la bordure interne 
			if (i == 0 || j == 0 || i == hauteur - 1 || j == largeur - 1) {
				System.out.print(bordure);
				System.out.print(" ");
			}else {
				System.out.print(signe);
				System.out.print(" ");
			}
		}
		System.out.println();
		if (animation) {
			try {
				Thread.sleep(dureeAnimation);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	
/**

 * Draw a reverse triangle

 * @param hauteur

 * 			height of the triangle (int)

 * @param largeur

 * 			width of the triangle (int)

 */
	
	public void triangleInverse() {
		for (int i = 0; i < hauteur; i++) {
			List<String> list = new ArrayList<String>();
			for (int j = largeur-i; j > 0; j--) {
				list.add(signe);
			}
			System.out.println(list);
		}
	}
	
	/**

	 * Draw a triangle

	 * @param hauteur

	 * 			height of the triangle (int)

	 * @param largeur

	 * 			width of the triangle (int)

	 */
	
	public void triangle() {
		for (int i = hauteur; i > 0; i--) {
			List<String> list = new ArrayList<String>();
			for (int j = largeur-i; j > 0; j--) {
				list.add(signe);
			}
			System.out.println(list);
		}
	}
	
/*public void pyramide() {
	for (int i = 0; i < hauteur; i++) {
		for (int j = 0; j < largeur; j++) {
			if () {
				System.out.print(" ");
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
}*/

public void test () {;
    int i, j;
    for(i=0;i<hauteur;i++) {
      for(j=0;j<hauteur;j++) {
        if((i+j)>hauteur) {
          System.out.print(signe);
          System.out.print(" ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
      if (animation) {
			try {
				Thread.sleep(dureeAnimation);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
      }
}

public void Maison() {
	test();
	rectangle();
}
	/**

	 * Ask user for parameters

	 * @param hauteur

	 * 			height(int)

	 * @param largeur

	 * 			width(int)

	 * @param animate

	 * 			whether the drawing should be animated or not (boolean)

	 * @param bordure

	 * 			the bordure character
	 * @return 

	 *

	 */
	
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
		
		
		if(nouvelleAnimation) {
			dureeAnimation();
		}
				
		reader.close(); 
		setHauteur(nouvelleHauteur);
		setLargeur(nouvelleLargeur);
		setSigne(nouveauSigne);
		setBordure(nouvelleBordure);
		setAnimation(nouvelleAnimation);
	}
	
	public void dureeAnimation() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Entrez la durée de l'animation: ");
		int nouvelleDureeAnimation = reader.nextInt();
		reader.close();
		setDureeAnimation(nouvelleDureeAnimation);
	}
}
