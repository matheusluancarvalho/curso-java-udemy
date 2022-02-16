package Colecoes.Map;

import java.util.Map;
import java.util.TreeMap;

public class MainMap {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "61 9 9874-1520");

        cookies.remove("email");
        cookies.put("phone", "61 9 9874-1820"); // Substitui o phone anterior

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Contains 'Maria' value: " + cookies.containsValue("Maria"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Empty Map: " + cookies.isEmpty());
        System.out.println("Username contains Maria? " + cookies.get("username").contains("Maria"));
        System.out.println("Contains Maria? " + cookies.values().contains("Maria"));
        System.out.println("Size: " + cookies.size());

        System.out.println("\nALL COOKIES:");

        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
