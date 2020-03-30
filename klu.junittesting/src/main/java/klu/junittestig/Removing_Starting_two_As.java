package klu.junittestig;

public class Removing_Starting_two_As {
String remove(String string)
{
	String answer = "";
	String lowercase = string.toLowerCase();
	if(lowercase=="")
		answer = "";
	else if(lowercase.length()==1)
	{
		if(lowercase.charAt(0)=='a')
			answer = "";
		else
			answer = lowercase;
	}
	else
	{
	if(lowercase.charAt(0)=='a')
     {
	 if(lowercase.charAt(1)=='a')
	 {
		 answer = lowercase.substring(2);
	 }
	 else
	 {
		 answer = lowercase.substring(1);
	 }
     }
	else if(lowercase.charAt(1)=='a')
	{
		
		answer = lowercase.charAt(0)+lowercase.substring(2);
	}
	else
		answer = lowercase;
	
}
	return answer;
}
}
