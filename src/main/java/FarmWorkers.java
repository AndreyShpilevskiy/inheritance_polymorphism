import java.util.ArrayList;

public class FarmWorkers {
    public static void main(String args[]) {

        // Create objects for farmers ....

        ArrayList <Working> farmers = new ArrayList(); //

        for (int i = 0; i < 10; i++) {
            farmers.add(new Farmer("Old MacDonald"));
            System.out.println(farmers.get(i).toString());
            farmers.get(i).hours();
        }


        // Create objects for working farm animals ..

        Working max = new WorkingDog("Max");
        System.out.println(max.toString());
        max.hours();

        Working silver = new WorkingHorse("Silver");
        System.out.println(silver.toString());
        silver.hours();

    }
}