import java.util.*;
class HashSetCRUD
{
      public static void main(String args[])
       {
         HashSet<String> hs = new HashSet<>();
          //create
          hs.add("India");
           hs.add("South Africa");
           hs.add("Russia");
          System.out.println("After Adding: "+hs);
  //Read
         System.out.println("Read elements from hashSet: ");
        for (String s:hs)
         {
          System.out.println(s);
         }
           //Update
          hs.remove("Russia");
          hs.add("UK");
           System.out.println("Updted Set: "+hs); 
         //Remove
          hs.remove("South Africa");
         System.out.println("After Deletion: "+hs);        
         
        }
}