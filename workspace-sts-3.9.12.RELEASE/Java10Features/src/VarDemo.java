import java.util.HashMap;
import java.util.List;

public class VarDemo {

	public static void main(String[] args)
	{
		var x = 100;
		var y = new HashMap<String, List<String>>();
		for (var z:y.entrySet())
		{
			var a=z.getValue();
		}
		

	}

}
