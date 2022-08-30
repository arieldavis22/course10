package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a high level language");
        languages.put("Python", "Interpreted OO program");
        languages.put("Algol", "Algorithmic language");
        System.out.println(languages.put("BASIC", "beginner code"));
        System.out.println(languages.put("Lisp", "therein lies madness"));

        if(languages.containsKey("Java")) {
            System.out.println("Java already in map");
        } else {
            System.out.println(languages.put("Java", "course about java"));
        }
//        System.out.println(languages.get("Java"));

        System.out.println("===============================================");

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
