package be.heh.strategie.tp2.ex2;

public class Client {
	public static void main(String[] args) {
		String txt = "6";
		System.out.println("La chaine de caractère : " + txt);
		Validateur valEntier = new Validateur(new FormatEntier(), txt);
		System.out.println("Est-ce que " + txt + " est un entier valide ?" + valEntier.isValid());

		Validateur valMail = new Validateur(new FormatMail(),txt);
		System.out.println("Est-ce que " + txt + " est un mail valide ?" + valMail.isValid());

		System.out.println("-----------------------------");

		txt = "louis.fitdevoie@std.heh.be";
		System.out.println("La chaine de caractère : " + txt);

		Validateur valEntier2 = new Validateur(new FormatEntier(),txt);
		System.out.println("Est-ce que " + txt + " est un entier valide ?" + valEntier2.isValid());

		Validateur valMail2 = new Validateur(new FormatMail(),txt);
		System.out.println("Est-ce que " + txt + " est un mail valide ?" + valMail2.isValid());

	}
}
