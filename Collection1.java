import java.util.*;


public class Collection1{

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.remove(2);
        System.out.println(collection);
    }
}