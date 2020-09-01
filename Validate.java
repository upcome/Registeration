import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validate {

	public boolean checkname(String parameter) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("(\\b[A-Z]{1}[a-z]+)( )([A-Z]{1}[a-z]+\\b)");
		Matcher matcher = pattern.matcher(parameter);

		return matcher.matches();
	}
	public boolean checkemail(String parameter) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(parameter);

		return matcher.matches();
	}
	public boolean checkpassword(String parameter) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16})");
		Matcher matcher = pattern.matcher(parameter);

		return matcher.matches();
	}
	public boolean checkdob(String parameter) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$");
		Matcher matcher = pattern.matcher(parameter);

		return matcher.matches();
	}
	public boolean checkgender(String parameter) {
		// TODO Auto-generated method stub
		if(parameter.equalsIgnoreCase("male")||parameter.equalsIgnoreCase("female"))
		{
			return true;
		}
		return false;
	}

	

}
