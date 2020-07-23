import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) 
	{
		List<Integer> list = List.of(10,15,20,35);
		List<Integer> newList = list.stream().filter(x -> x%3 == 0).collect(Collectors.toList());
		List<Integer> newList = list.stream().filter(x -> x%3 == 0).collect(Collectors.toUnmodifiableList());
		newList.add(50);
	}

}
