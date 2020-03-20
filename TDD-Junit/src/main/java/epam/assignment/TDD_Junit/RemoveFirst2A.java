package epam.assignment.TDD_Junit;

public class RemoveFirst2A {

	public static String remove(String string) {
		String newString=string;
	
		if (string.length()>2)
		{
			String subString1=string.substring(0,2).replace("A", "");
			String subString2=string.substring(2);
			newString=subString1.concat(subString2);
		}
		if(string.equals("A"))
			newString="";
		return newString;
	}

}
