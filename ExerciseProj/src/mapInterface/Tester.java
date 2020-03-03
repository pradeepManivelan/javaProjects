package mapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		List<String> employeeList = new ArrayList<String>();
		employeeList.add("Ajay");
		employeeList.add("Sachin");
		employeeList.add("Kamal");
		employeeList.add("Swati");
		employeeList.add("Ajay");
		employeeList.add("Rahul");
		
		Map<String, Integer> employees = new HashMap<String, Integer>();
		for(String employee:employeeList) {
			if(employees.containsKey(employee)) {
				employees.put(employee,employees.get(employee)+1);
			}
			else {
				employees.put(employee,1);
			}
		}
		Set<Entry<String, Integer>> entrySet = employees.entrySet();
		for(Entry<String, Integer> entry:entrySet) {
			System.out.println(entry.getKey()+entry.getValue());
		}
	
	}

}
