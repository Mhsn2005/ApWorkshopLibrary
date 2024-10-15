import java.util.ArrayList;

public class Member implements Actions{
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private ArrayList<Book> Books = new ArrayList<Book>();
    private Library library;

    public Member(int id, String name, int age, String gender, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public void borrowingBooks(Book book) {
    Books.add(book);
    book.setBorrowed(true);
    }

    @Override
    public void handItBack(Book book) {
    Books.remove(book);
    book.setBorrowed(false);
    }

    @Override
    public void signIn(Library library) {
        setLibrary(library);
        library.si
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Book> getBooks() {
        return Books;
    }

    public void setBooks(ArrayList<Book> books) {
        Books = books;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
