public class Driver {
    public static void main (String [] args)
    {
        ReadData r = new ReadData();
        r.read();
        System.out.println(r.getLongestTitle(mySongs));
    }
}
