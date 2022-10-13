package BoksOyunu;

public class MainBoks {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali",100,1000,80,80);
        Fighter f2 = new Fighter("George Foreman",95,1000,80,50);

        Match match = new Match(f1,f2,75,95);
        match.run();
    }
}
