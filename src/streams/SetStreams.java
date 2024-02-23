package streams;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetStreams {
	public static void main(String[] args) {
		Set<Integer> expectedData = new HashSet<>();
		expectedData.add(7);
		expectedData.add(2);
		expectedData.add(4);
		expectedData.add(3);
		expectedData.add(1);

		//I have taken list here because 
		List<Integer> sortedList = expectedData
				.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(sortedList);

		Set<Integer> filterList = expectedData
				.stream()
				.filter(data-> data % 3 == 0)
				.collect(Collectors.toSet());
		System.out.println(filterList);
		
		Set<Integer> mapList = expectedData
				.stream()
				.map(data -> data * 2)
				.collect(Collectors.toSet());
		System.out.println(mapList);
	
	}

}
