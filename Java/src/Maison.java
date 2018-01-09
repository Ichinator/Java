public class Maison {
	private int taille;
	private int nbEtage;
	private String adresse;
	private boolean jardin;

	public Maison() {
	}
	public Maison(int taille, int nbEtage, String adresse, boolean jardin) {
		this.taille = taille;
		this.nbEtage = nbEtage;
		this.adresse = adresse;
		this.jardin = jardin;
	}
	
	public int getTaille() {
		return this.taille;
	}
	
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public String getAdresse() {
		return this.adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public int getNbEtage() {
		return this.nbEtage;
	}
	
	public void setNbEtage(int nbEtage) {
		this.nbEtage = nbEtage;
	}
	
	public boolean isJardin() {
		return this.jardin;
	}
	
	public void setJardin(boolean jardin){
		this.jardin = jardin;
	}
}

