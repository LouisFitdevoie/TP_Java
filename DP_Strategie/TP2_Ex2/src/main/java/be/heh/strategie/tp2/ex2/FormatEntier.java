package be.heh.strategie.tp2.ex2;

public class FormatEntier implements Format {
	@Override
	public boolean checkFormat(String value){
		boolean ok;
		try{
			int i = Integer.parseInt(value);
			ok = true;
		}catch(Exception e){
			ok = false;
		}
		return ok;
	}
}