package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Names {

	public static void main(String[] args) {
	
		List<String> names = new ArrayList<String>();
		names.add("Sreekar");
		names.add("Shiva");
		names.add("Chitra");
		names.add("Padma");
		
		long d = Stream.of("Ravi", "Kamal").filter(s-> 
		{
			s.startsWith("s");
			return true;
		}).count();
		System.out.println(d);
		
		long count = names.stream().filter(s->s.startsWith("S")).count();
		System.out.println(count);

	}

}
