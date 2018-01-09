
public class Main {

	public static void main(String[] args) {
		for (String arg : args) {

			try {

				int cpt = Integer.parseInt(arg);



				Maison[] maisons = new Maison[cpt];

				

				for (int i = cpt-1; i >= 0; i--) {

					maisons[i] = new Maison();

					if (i%2 == 0) {

						maisons[i].setJardin(true);

					} else {

						maisons[i].setJardin(false);

					}

				}

				

				for (Maison m : maisons) {

					String str = "La maison ";

					str += m.isJardin() ? "a un jardin" : "n'a pas de jardin";

					System.out.println(str);

				}

			} catch (NumberFormatException e) {

				System.out.println("Le code ne fonctionne pas");

			}

		}

		

		System.out.println("Fin du programme");

		

	}

}



