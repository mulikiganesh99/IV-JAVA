import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionDemo {
    public static void main(string[] args)
    {
List<String> names = new  ArrayList<>();
names.add("C");
names.add("Java");
names.add("C++");
names.add("Python");
System.out.println(names);
Set<String> set=new HashSet<>(names);
System.out.println(set);
Map<Integer,String> map=new HashMap<>();
map.put(1,"siva");
map.put(2,"Rama");
System.out.println(map);
    }
}
