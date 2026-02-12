
public class TestMovie {
        public static void main(String[] args) {

        Movie m1 = new Movie();
        m1.setName("Man on Fire");
        m1.setRating("B");

        Movie m2 = new Movie();
        m2.setName("Inception");
        m2.setRating("A");

        Movie m3 = new Movie();
        m3.setName("Frozen");
        m3.setRating("G");

        System.out.println(m1.getName() + " - " + m1.getRating());
        System.out.println(m2.getName() + " - " + m2.getRating());
        System.out.println(m3.getName() + " - " + m3.getRating());
    }
}
