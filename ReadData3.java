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
            int count = 0;
            in = new Scanner(new File("songs 2025-2026 ANSI (3).csv"));
            in.nextLine();
            while(in.hasNext()){
                String line = in.nextLine();
                String artist = line.split(";")[0];
                String title = line.split(";")[1];
                int year = Integer.parseInt(line.split(";")[2]);
                String genre = line.split(";")[3];
                int length = Integer.parseInt(line.split(";")[4]);
                double shake = Double.parseDouble(line.split(";")[5]);
                double obscene = Double.parseDouble(line.split(";")[6]);
                double dance = Double.parseDouble(line.split(";")[7]);
                double loud = Double.parseDouble(line.split(";")[8]);
                String topic = line.split(";")[9];
                
              
                songs[count] = new Song(artist, title, year, genre, length, shake, obscene, dance, loud, topic);

                count++;

            }

            System.out.println(songs[23457].getDance());
            in.close();
        }
        catch(IOException e){
            System.out.println("Error in file reading");
        }
        
    }
    public String getLongestTitle(Song [] list)
            {
                String longest = "";
                for(int i = 0; i < 28371; i++)
                {
                    String title = list[i].getTitle();

                    if(title.length() > longest.length())
                {
                    longest = title;
                }
                }

            return longest;
        }
}
