package functionalInterface;

public interface StringFormatter {
	@FunctionalInterface
	public interface String StringFormatter(String s1, String s2){
		String format(String s1, String s2);
	}

}
