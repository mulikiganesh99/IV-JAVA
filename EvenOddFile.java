import java.io.FileWriter;
import java.io.IOException;
public class EvenOddFile {
    public static void main(String[] args) throws IOException{
        int num[]={11,22,33,44,55,66,77,88,99,100};
        FileWriter even=new FileWriter("Even.txt");
        FileWriter odd=new FileWriter("Odd.txt");
       
        for(int n:num)
        {
            if(n%2==0)
            {
                even.write(n+"\n");
            }
            else
            {
                odd.write(n+"\n");
            }
        }
        even.close();
        odd.close();
        System.out.println("Even and Odd numbers are Generated");

    }
    
}
