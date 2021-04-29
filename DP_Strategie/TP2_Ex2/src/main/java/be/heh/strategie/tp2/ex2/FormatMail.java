package be.heh.strategie.tp2.ex2;

public class FormatMail implements Format {
	@Override
	public boolean checkFormat(String value){
		boolean ok;

		int a = value.indexOf("@");
		if (a >= 0)
		{
			ok = true;
		}
		else
		{
			ok = false;
		}

		return ok;
	}
}