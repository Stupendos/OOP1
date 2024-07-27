//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Tolkien");
        Author author2 = new Author("Lev", "Tolstoy");

        Book book1 = new Book("Lord of the rings", author1, 1954);

        Book book2 = new Book("War and Peace", author2, 1867);

        System.out.println("Название книги - " + book1.getBookTitle() + ", автор - " + author1.getfirstName() + " " + author1.getlastName() + ", год выпуска - " + book1.getYearOfPublication());

        System.out.println("Название книги - " + book2.getBookTitle() + ", автор - " + author2.getfirstName() + " " + author2.getlastName() + ", год выпуска - " + book2.getYearOfPublication());
    }
}