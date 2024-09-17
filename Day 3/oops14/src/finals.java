public class finals {
    final String movie;
    final static String film;

    static {
        film = "kgf";
    }

    public finals(String movie) {
        this.movie = movie;
    }

    public void displayData() {
        System.out.println("movie Name: " + movie);
        System.out.println("film Name: " + film);
    }

    public static void main(String[] args) {
       finals person = new finals("MI");
        person.displayData();
    }
}
