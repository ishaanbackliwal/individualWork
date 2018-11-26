package strings;


public class EssayClass {

	private String name;
	private String text;
	
	public EssayClass() {

	}
	public void setName(String newName) {
		name = newName;
	}
	public void setText(String newText) {
		text = newText;
	}
	public String getLastName() {
		int space = name.indexOf(' ') + 1;
		String lastName = name.substring(space);
		return lastName.toUpperCase();
	}
	public int getFirstNameChar() {
		int space = name.indexOf(' ');
		String firstName = name.substring(0, space);
		int num = firstName.length();
		return num;
	}
	public boolean containsX() {
		boolean decision = name.contains("x");
		return decision;
	}
	public int wordCount() {
		int numSpace = 1;
		for (int counter = 0; counter < (text.length()); counter++) {
			if (text.charAt(counter) == ' ') {
				numSpace++;
			}
		}
		return numSpace;
	}

}
