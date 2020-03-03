package checkedExcep;
class InvalidNameException extends Exception {
	public InvalidNameException() {
		super("Invalid Name");
	}
}
class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super("Invalid Age");
	}
}
class InvalidPostException extends Exception {
	public InvalidPostException() {
		super("Invalid Post");
	}
}
public class Validator {
	public void validate(Applicant applicant) throws Exception{
		if(!isValidName(applicant.getApplicantName())) {
			throw new InvalidNameException();
		}
		else if(!isValidAge(applicant.getApplicantAge())) {
			throw new InvalidAgeException();
		}
		else if(!isValidPost(applicant.getPostApplied())) {
			throw new InvalidPostException();
		}
		else {
			System.out.println("All valid values");
		}
			
	}
	public boolean isValidName(String name) {
		if(name != null && name.length() != 0) {
			return true;
		}return false;
		
	}
	public boolean isValidPost(String post) {
		if(post.equalsIgnoreCase("Probtionary Officer") || post.equalsIgnoreCase("Assitant") || post.equalsIgnoreCase("Special Cadre Officer")) {
			return true;
		}return false;
		
	}
	public boolean isValidAge(Integer age) {
		if(age > 18 && age < 35) {
			return true;
		}return false;
	}

}
