import java.util.ArrayList;

public class ListOperations {
    public static void main(String[] args)
    {
      ArrayList<String> li= new ArrayList<>();
      li.add("Java");
      li.add("Python");
      li.add("C++");
      System.out.println("ActualArray: "+li);//Java Python C++
      //specified----->Read() Method
      System.out.println("specified Array Element : "+li.get(2));//C++
      // update----->set() Method 
      li.set(2,"MySql");
      System.out.println("Updated Arrray List is : "+li);//Java Python MySql
      //Delete------>remove()
      li.remove(1);
      System.out.println("After delete Arrray List is : "+li);//Java MySql
    }
    
}
