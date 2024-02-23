package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreams {

	public static void main(String[] args) {
		List<Integer> expectedData = new ArrayList<>();
		expectedData.add(7);
		expectedData.add(2);
		expectedData.add(4);
		expectedData.add(3);
		expectedData.add(1);

		List<Integer> sortedList = expectedData
				.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(sortedList);

		List<Integer> filterList = expectedData
				.stream()
				.filter(data-> data % 3 == 0)
				.collect(Collectors.toList());
		System.out.println(filterList);
		
		List<Integer> mapList = expectedData
				.stream()
				.map(data -> data % 2)
				.collect(Collectors.toList());
		System.out.println(mapList);
	
	}

}
