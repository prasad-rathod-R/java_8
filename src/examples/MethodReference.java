package examples;

import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		
		List<String> courses = List.of("Java","Aws","Sprig Boot");
        courses.
        stream().
        map(str -> str.
        		toUpperCase()).
        forEach(System.
        		out::
        		println);
	}

}
