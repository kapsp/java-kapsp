public class Task3 {
    public static void main(String[] args) {
        //composition

        Car car = new Car("v8");
        car.showEngine();

        //agg
        Book book = new Book("To Kill a Mockingbird");
        Library library = new Library("City Library", book);

        library.showBook();
    }
}
//compositon
class Car {
    private Engine engine;

    public Car(String enginemodel) {
        this.engine = new Engine(enginemodel);
    }

    public void showEngine() {
        System.out.println("Engine type: " + engine.getType());
    }
}

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

//aggregation

class Library {
    private String name;
    private Book book;

    public Library(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public void showBook() {
        System.out.println("Book in " + name + ": " + book.getTitle());
    }
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


