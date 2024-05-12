public class Main {
    public static void main(String[] args) {
        StarBuilder starBuilder = new StarBuilderImpl();
        StarDirector starDirector = new StarDirector(starBuilder);

        // Construindo uma estrela
        Star star = starDirector.constructStar("Sun", 1.0, 5778, 1.0);

        System.out.println(star);
    }
}