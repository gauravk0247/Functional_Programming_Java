package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(12);
		list.add(56);
		list.add(78);
		list.add(90);
		list.add(34);
		list.add(59);
		list.stream().map(pr->{
			int percentage = (pr*100)/100;
			String msg = "Percentage of "+pr+" "+percentage;
		return msg;
		}).forEach(pr->System.out.println(pr));
	}
}