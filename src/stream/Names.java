package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Names {

	public static void main(String[] args) {
	
		List<String> names = new ArrayList<String>();
		names.add("Sreekar");
		names.add("Shiva");
		names.add("Chitra");
		names.add("Padmavathi");
		
		//returns true or false no matter the condition
		long d = Stream.of("Ravi", "Kamal").filter(s-> 
		{
			s.startsWith("s");
			return true;
		}).count();
		System.out.println(d);
		
		//to print count of names starting with S
		long count = names.stream().filter(s->s.startsWith("S")).count();
		System.out.println(count);
		
		//to print all names in the list whose length greater than 5
		names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		
		//print upper case names with last letter with A
		Stream.of("Sreekar", "Padma", "Shiva")
			.filter(s->s.endsWith("a"))
			.map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
		
		//print first letter A name sorted way
		List<String> namesList = Arrays.asList("Az", "Abhishek", "Abhilash", "Kiran", "Kumar");
		namesList.stream()
			.filter(s->s.startsWith("A"))
			.sorted()
			.map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
		
		//merging two streams
		Stream.concat(namesList.stream(), Stream.of("Sreekar","Nagraj"))
			.sorted()
			.forEach(s->System.out.println(s));
		
		//collect into a list
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 22, 11, 4, 5, 6, 6, 7);
		//sort the array
		List<Integer> sorted = numbers.stream()
			.sorted()
			.collect(Collectors.toList());
		System.out.println(sorted);
		//print unique numbers
		Set<Integer> unique = numbers.stream()
									.collect(Collectors.toSet());
		System.out.println(unique);
		

	}

}
