package CollectionsOverview;

public class Main {
 //test
    public static void main(String[] args) {
        Theater theater = new Theater("Oly", 8, 12);
//        theater.getSeats();

        if(theater.reseveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Seat is taken");
        }
        if(theater.reseveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Seat is taken");
        }
    }
}
