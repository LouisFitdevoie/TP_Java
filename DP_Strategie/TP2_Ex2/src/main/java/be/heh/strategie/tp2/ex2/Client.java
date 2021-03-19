package be.heh.strategie.tp2.ex2;

public class Client {
	public static void main(String[] args){
		testChaine("6");
		System.out.println("----------------------");
		testChaine("toto@gmail.com");
	}
	private static final void testChaine(String txt){
		System.out.println("La chaaine de caractere : "+txt);
		
		Validateur valEntier = new Validateur(new FormatEntier(),txt);
		System.out.println("Est-ce que "+txt+" est un entier valide ? "
		+ (valEntier.isValid() ? "oui":"non"));
		
		Validateur valMail = new Validateur(new FormatMail(),txt);
		System.out.println("Est-ce que "+txt+" est un mail valide ? "
		+ (valEntier.isValid() ? "oui":"non"));
	}
}
