package be.heh.strategie.tp2.ex2;

public class Validateur{
	public Validateur(Format format,String txt){
		this.format	= format;
		this.txt		= txt;
	}
	public boolean isValid(){
		return format.checkFormat(txt);
	}
}