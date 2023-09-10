public class Main {
    public static void main(String[] args) {
        Author Rowling = new Author("Joanne Rowling");
        Book HarryPotter = new Book("Harry Potter", 1997, Rowling);
        System.out.println("HarryPotter.title = " + HarryPotter.getTitle());
        System.out.println("HarryPotter.publicationYear = " + HarryPotter.getPublicationYear());
        System.out.println("HarryPotter.author = " + HarryPotter.getAuthor());

        Author Bulgakov = new Author("Mikhail Bulgakov");
        Book theMasterAndMargarita = new Book("The Master and Margarita", 1966, Bulgakov);
        System.out.println("theMasterAndMargarita.title = " + theMasterAndMargarita.getTitle());
        System.out.println("theMasterAndMargarita.publicationYear = " + theMasterAndMargarita.getPublicationYear());
        System.out.println("theMasterAndMargarita.getAuthor = " + theMasterAndMargarita.getAuthor());
        theMasterAndMargarita.setPublicationYear(1968);
        System.out.println("theMasterAndMargarita.getPublicationYear = " + theMasterAndMargarita.getPublicationYear());
    }

}