import java.util.*;
class StudentDriver
{
      public static void main(String args[])
         {
         ArrayList<Studentinfo> li = new ArrayList<>();
         li.add(new Studentinfo(1,"Santosh"));
         li.add(new Studentinfo(2,"Sagara kanya"));
         li.add(new Studentinfo(3,"Avengers"));
         Collections.sort(li,new NameComparator());
         System.out.println(li);
         }
}
