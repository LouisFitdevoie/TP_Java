package be.heh.strategie.tp2.ex2;

public interface FormatDomain{
	public boolean checkFormat(String value){
		if(value.isEmpty()) return false;
		if(value.charAt(0)=='.') return false;
		for(int i=0;i<value.length();i++){
			char current = value[i];
			lowerCase	= current >= 'a' && current <= 'z';
			upperCase	= current >= 'A' && current <= 'Z';
			number		= current >= '0' && current <= '9';
			specials		= current == '.' || current == '-';
			if(!lowerCase && !upperCase && !number && !specials)
				return false;
		}
		return true;
	}
}