package quiz;

public class ReverseString {
	
    public String reverse(String input) {
    	//Checks to see if the input string is null.
    	if(input == null) {
    		return null;
    	}
    	
    	StringBuilder output = new StringBuilder("");
    	//Takes each character from end to front and appends them to output one by one.
    	for(int i = input.length() - 1; i >= 0; i--) {
    		output.append(input.charAt(i));
    	}
    	
    	return output.toString();
    	
    }
}