import java.util.*;
public class list {
	public static void main(String[] arggs) {
		List<String> name = new ArrayList();
		name.add("madhav");
		name.add("Mithun");
		name.add("Rohith");
		name.add("Deepak");
		name.add("sudeesh");
		System.out.println(name);
		System.out.println(name.get(0));
		name.remove(0);
		System.out.println(name);
		name.remove("Deepak");
		System.out.println(name);
		System.out.println(name.size()); 
	}
}
