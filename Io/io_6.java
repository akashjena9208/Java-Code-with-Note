package Io;

// FileReader40
import java.io.*;
public class io_6 
{
    public static void main(String[] args) throws Exception
    {
        File dir=new File("io");
        File file=new File(dir, "pw.txt");

        FileWriter fw=new FileWriter(file, true);
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("Java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[]={'p','w','s','j'};
        bw.write(ch);

        

        bw.flush();
        bw.close();

       


    }
    
}
