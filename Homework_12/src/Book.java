public class Book {
    private String title;
    private int publicationYear;
    private Author author;

     Book(String title, int publicationYear, Author author) {
        this.publicationYear =publicationYear;
        this.author = author;
         this.title = title;
    }
    public String getTitle() {
         return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
         this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
         this.author = author;
    }
}

