//Task 2: Develop a Java class to represent a library,
//        with a static data member to store the total number of books in the library
//and an instance data member to store the book's title.
//Implement a static method to update the total count when a new book is added.

public class Library {
    private static int totalBooks;
      private String setTitle;

      public void title(String setTitle){
          this.setTitle=setTitle;
          totalBooks++;

      }

       public static int getbooks(){
          return  totalBooks;
       }
    public static void main(String[] args) {
   Library a= new Library();
        Library a1= new Library();
        a.title("jungle Book ");
        a1.title("Jungle Book 2");

        System.out.println(Library.getbooks());

    }
}
