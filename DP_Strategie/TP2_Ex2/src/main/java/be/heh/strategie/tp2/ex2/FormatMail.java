package be.heh.strategie.tp2.ex2;

public interface FormatMail{
	private static final DOMAIN_FORMAT = new FormatDomain();
	
	public boolean checkFormat(String value){
		int arobase = value.indexOf('@');
		if(arobase < 0) return false;
		return 
			DOMAIN_FORMAT.checkFormat(value.substring(0,arobase))
			&&	DOMAIN_FORMAT.checkFormat(value.substring(arobase+1))
		;
	}
}