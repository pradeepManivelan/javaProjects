package abstractEx;

public class Tester {
	public static void main(String[] args) {
		Graduate grad1 = new Graduate("Pradeep");
		grad1.setTestScore(0, 70);
		grad1.setTestScore(1,69);
		grad1.setTestScore(2,71);
		grad1.setTestScore(3,55);
		grad1.generateResult();
		Undergraduate ug1 = new Undergraduate("Arthi");
		ug1.setTestScore(0,70);
		ug1.setTestScore(1,69);
		ug1.setTestScore(2,71);
		ug1.setTestScore(3,55);
		ug1.generateResult();
		System.out.println(grad1.getName()+" "+grad1.getResult());
		System.out.println(ug1.getName()+" "+ug1.getResult());
		
	}

}
