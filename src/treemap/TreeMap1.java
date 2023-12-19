package treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	/*
	 * TreeMap()---this constructor uses Comparable interface to sort you object
	 * TreeMap(Comparator)
	 * 
	 * 
	 */

	public static void main(String[] args) {
			TreeMap<Employee, String> tm1 = new TreeMap<Employee, String>(new EmpName());
			tm1.put(new Employee(101, "Gaurav", "Developer", 5000.45), "Java");
			tm1.put(new Employee(102, "Krushna", "Manager", 6000.45), "Python");
			tm1.put(new Employee(103, "Devesh", "Designer", 7000.45), "Testing");
			Set s = tm1.entrySet();
			Iterator<Entry<Employee,String>> i =s.iterator();
			while(i.hasNext()) {
				Entry<Employee,String> emp1 = i.next();
				Employee obj= emp1.getKey();
				String ss = emp1.getValue();
				
				System.out.println(obj.getEmpCode	()+" "+obj.getEmpName()+ " "+obj.getEmpDesignation()+" "+obj.getSalary()+" "+ss);	
//				System.out.println(ss);
				
				if(obj.getEmpDesignation().equals("Manager")) 
				{
					double sal = obj.getSalary()+5000;
					obj.setSalary(sal);
					System.out.println("---------------------------------");
					System.out.println("Salary Increment by");
					System.out.println(obj.getEmpCode()+" "+obj.getEmpName()+ " "+obj.getEmpDesignation()+" "+obj.getSalary());	
				}
			}
			
		/*Set<Entry<Employee, String>> entries=	 tm1.entrySet();
			for(Entry<Employee, String> e:entries)
			{
				System.out.println(e.getKey().getEmpCode()+" "+e.getKey().getEmpName()+ " "+e.getKey().getEmpDesignation()+" "+e.getKey().getSalary());
				System.out.println(e.getValue());
			}*/
		}
}