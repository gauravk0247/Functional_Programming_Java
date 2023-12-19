package stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Service{
	public static List<String> convertMapToList(Map<Integer, String> map){
		List<String> listOfSkill = map.entrySet().stream().map(
				entry->entry.getValue()).map(value->{
					String[] str= value.split("-");
//					return str[0];
					return str[1];
				}).collect(Collectors.toList());
		return listOfSkill;
	}
}
public class TestWithMapStreamDemo2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(108, "Gopal-java");
		map.put(109, "Sarthak-python");
		map.put(110, "Abhishek-java");
		map.put(111, "Ritesh-ST");
		List<String> resultList = Service.convertMapToList(map);
		resultList.forEach(v->System.out.println(v));
	}
}