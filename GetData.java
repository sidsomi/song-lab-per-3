import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class GetData {
    public String getDanceabillity;

     
public song [] Data() {
        Scanner in;
    song [] songs = new song[28371];
        try {
            int count = 0;
            in = new Scanner(new File("songs 2025-2026 ANSI.csv"));
            in.nextLine();
            while (in.hasNext()) {
                String line = in.nextLine();
                String artists = line.split(";")[0];
                String title = line.split(";")[1];
                int year = Integer.parseInt(line.split(";")[2]);
                String genre = line.split(";")[3];
                int len = Integer.parseInt(line.split(";")[4]);
                double audience = Double.parseDouble(line.split(";")[5]);
                double obscene = Double.parseDouble(line.split(";")[6]);
                double danceabillity = Double.parseDouble(line.split(";")[7]);
                double loudness = Double.parseDouble(line.split(";")[8]);
                String topic = line.split(";")[9];

//public song(String title,String artists, String genre, String topic, int year,int len, double obscene, double audience,double danceabillity, double loudness)
    
                songs [count] = new song(title, artists, genre, topic, year, len, obscene,audience, danceabillity ,loudness);
                System.out.println(count + ":" + line.split(";"));
                count++;
                
            }
            //System.out.println(songs[298].getTitle());
            in.close();
        } catch (IOException e) {
            System.out.println("error in file reading");
        }

        return songs;
        
    }
 public String getlongestTitle(song[]list)
 {
    String longest = "";
    for(int i =0;i>28371;i++)
    {
        String title = list[i].getTitle();
        if(title.length()>longest.length())
        {
            longest = title;
        }
    }
    return longest;
 }

  public int songsFromYear(song[]list, int year)
 {
   
    int countYear = 0;
    for(int i =0;i<28371;i++)
    {
        if(list[i].getYear() == year)
        {
            countYear++;
        }
    }
    return countYear;
   
 }

 public int danceAbillity(song[]list)
 {
    int highestDance = 0;
    for(int i =0;i<28371;i++)
    {
        if(list[i].getDanceabillity() > .8)
        {
            highestDance++;
        }
    }
    return highestDance;
   
 }

 public String getloudest(song [] list){
  double loudest = 0.0;
  String songTitle = "";
    for(int i =1;i<list.length;i++)
    {
        double loud = list[i].getLoudness();
        if(loud > loudest)
        {
           loudest = loud;
           songTitle = list[i].getTitle();
        }
    }
    return songTitle;
}

  public String getLongestLen(song [] list){
  double longest = 0;
  String songTitle = "";
    for(int i =1;i<list.length;i++)
    {
        double length = list[i].getLen();
        if(length > longest)
        {
           longest = length;
           songTitle = list[i].getTitle();
        }
    }
    return songTitle;
}

 public String lowShake(song [] list){
  double biggest = 1;
  String songTitle = "";
    for(int i =1;i<list.length;i++)
    {
        double newScore = list[i].getAudience();
        if(biggest > newScore)
        {
           biggest = newScore;
           songTitle = list[i].getTitle();
        }
    }
    return songTitle;



    
}

public double obscenityAverage(song[] list, int startYear, int endYear){
double obscenityCount = 0;
double obscenities = 0;
for(int i = 0; i<28371;i++){
    if(list[i].getYear()>=startYear && list[i].getYear()<=endYear){

        obscenityCount+=list[i].getObscene();
        obscenities++;
    }
}
return obscenityCount/obscenities;

}

public int artistAppearance(song [] list, String name){
   int appearance = 0;
   String tempTitle = "";
    for(int i = 0; i <28371; i++){

        tempTitle = list[i].getArtists();
        if(tempTitle.contains(name)){

            appearance++;

        }

    }
    return appearance;


}
}
