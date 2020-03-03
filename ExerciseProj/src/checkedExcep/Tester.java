package checkedExcep;


public class Tester{
	public static void main(String[] args) throws Exception {
		Applicant app1 = new Applicant();
		app1.setApplicantName("Pradeep");
		app1.setApplicantAge(23);
		app1.setPostApplied("Assitant");
		Validator val1 = new Validator();
		try {
			val1.validate(app1);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
