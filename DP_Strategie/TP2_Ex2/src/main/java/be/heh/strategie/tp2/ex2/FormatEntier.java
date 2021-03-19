package be.heh.strategie.tp2.ex2;

public interface FormatEntier{
	public boolean checkFormat(String value){
		boolean ok;
		try{
			Integer.parseInt(value);
			ok = true;
		}catch(NumberFormatException nfe){
			ok = false;
		}
		return ok;
	}
}