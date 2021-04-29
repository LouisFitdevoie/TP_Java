package be.heh.strategie.tp2.ex2;

public class Validateur{
	private String txt;
	private Format format;

	public String getTxt()
	{
		return txt;
	}

	public Format getFormat()
	{
		return format;
	}

	public Validateur(Format format,String txt)
	{
		this.format = format;
		this.txt = txt;
	}

	public boolean isValid()
	{
		boolean valid;

		valid = getFormat().checkFormat(getTxt());

		return valid;
	}
}