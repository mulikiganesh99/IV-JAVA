import java.util.*;
class TreeSetCRUD
{
      public static void main(String args[])
       {
         TreeSet<String> Ts = new TreeSet<>();
          //create
          Ts.add("India");
           Ts.add("South Africa");
           Ts.add("Russia");
          System.out.println("After Adding: "+Ts);
  //Read
         System.out.println("Read elements from hashSet: ");
        for (String s:Ts)
         {
          System.out.println(s);
         }
           //Update
          Ts.remove("Russia");
          Ts.add("UK");
           System.out.println("Updted Set: "+Ts); 
         //Remove
          Ts.remove("South Africa");
         System.out.println("After Deletion: "+Ts);        
         
        }
}