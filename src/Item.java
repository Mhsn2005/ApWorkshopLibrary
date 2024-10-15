import java.util.ArrayList;

abstract class Item {

        String title;
        String author;
        int year;
        String publisher;
        ArrayList<Member> members;
        private Boolean isBorrowed;
        public Item(String title, String author,int year, String publisher) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.publisher = publisher;
        }

        public Boolean getBorrowed() {
            return isBorrowed;
        }

        public void setBorrowed(Boolean borrowed) {
            isBorrowed = borrowed;
        }


        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
