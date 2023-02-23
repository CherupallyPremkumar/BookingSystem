import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Multiplex> multiplexes=new ArrayList<>();
        Map<String,Show> shows=new HashMap<>();
        ArrayList<Screen> screens=new ArrayList<>();
        //Data creation manually
        Multiplex multiplex=new Multiplex("M1001","PVR");
        Multiplex multiplex2=new Multiplex("M1002","MIRAJ");

        Movie rrr=new Movie("M1001","RRR");
        Movie kgf=new Movie("M1002","KGF");

        Screen screen=new Screen("S1001","Screen 1");
        screen.addSeats(30);
        screens.add(screen);
        multiplex.addScreen(screen);

        Screen screen1=new Screen("S1002","Screen 2");
        screen1.addSeats(30);
        screens.add(screen1);
        multiplex.addScreen(screen1);
        Screen screen2=new Screen("S1003","Screen 3");
        screen2.addSeats(30);
        screens.add(screen2);
        multiplex.addScreen(screen2);
        Screen scr=new Screen("S1001","Screen 1");
        scr.addSeats(30);
        screens.add(scr);
        multiplex2.addScreen(scr);
        Screen scr1=new Screen("S1002","Screen 2");
        scr1.addSeats(30);
        screens.add(scr1);
        multiplex2.addScreen(screen);
        Screen scr2=new Screen("S1003","Screen 3");
        scr2.addSeats(30);
        screens.add(scr2);
        multiplex2.addScreen(scr2);
        multiplexes.add(multiplex);
        multiplexes.add(multiplex2);
        Show show=new Show("Show1001",rrr,screen);
        shows.put(show.showId,show);
        Show show1=new Show("Show1002",kgf,scr1);
        shows.put(show1.showId,show1);

        //taking input form User

        for (String show2:shows.keySet()) {
            System.out.println( "shows Running  "+shows.get(show2));
        }
        System.out.println("booking counter");
        System.out.println("Select movie and tickets");
        Scanner scanner=new Scanner(System.in);
       String m= scanner.nextLine();

        for (String s: shows.keySet()) {
            if(shows.get(s).movie.movieName.equals(m))
            {

            }
        }











    }
}
