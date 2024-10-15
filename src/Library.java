import java.util.ArrayList;

public class Library {
    private String title;
    private String address;
    private String phone;
    private String email;
    private ArrayList<Book>books=new ArrayList<>();
    private ArrayList<Member> members=new ArrayList<>();
    public Library(String title, String address, String phone, String email) {
        this.title = title;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBooks(Book book) {
        this.books.add(book);
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void addMembers(Member member) {
        this.members.add(member);
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
