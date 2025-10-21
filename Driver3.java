public class Driver {
    public static void main(String[] args) {
        GetData r = new GetData();
        song[] list = r.Data();


    System.out.println("Total Number of Songs: 28371"  );
System.out.println("1982: " + r.songsFromYear(list, 1982));
System.out.println("2000: " + r.songsFromYear(list, 2000));
System.out.println("2015: " + r.songsFromYear(list, 2015));
System.out.println("There are: " + r.danceAbillity(list) + " Songs With a Danceability Above 0.8");
System.out.println("The Song With the Longest Length is: " + r.getLongestLen(list));
System.out.println("The Song With the Lowest Shakeability Score is: " + r.lowShake(list));
System.out.println("The Loudest Song is: " + r.getloudest(list));
System.out.println("The Average Obscenity Level for Decades\n1950 - 1959: " + r.obscenityAverage(list, 1950, 1959)+"\n 1960-1969:" + r.obscenityAverage(list, 1960, 1969)+"\n 1970-1979:" + r.obscenityAverage(list, 1970, 1979)+"\n 1980-1989:" + r.obscenityAverage(list, 1980, 1989)+"\n 1990-1999:" + r.obscenityAverage(list, 1990, 1999)+"\n 2000-2009:" + r.obscenityAverage(list, 2000, 2009)+"\n 2010-2019:" + r.obscenityAverage(list, 2010, 2019));
System.out.println("There are: " + r.artistAppearance(list, "michael jackson")+ " Michael Jackson Songs");
System.out.println("There are: " + r.artistAppearance(list, "whitney houston")+ " Whitney Houston Songs");
}
}
