import java.util.Scanner;
import java.io.File;

import java.io.IOException;


public class ReadData
{
    public void read()
    {
        Scanner in;
        Song [] songs = new Song[28372];
        try{
            int count = 1;
            in = new Scanner(new File("songs 2025-2026 ANSI (3).csv"));
            while(in.hasNext()){
                String line = in.nextLine();
                System.out.println(count + ": " + line.split(";")[2]);
                count++;


            }
            in.close();
        }
        catch(IOException e){
            System.out.println("Error in file reading");
        }
    }
}
