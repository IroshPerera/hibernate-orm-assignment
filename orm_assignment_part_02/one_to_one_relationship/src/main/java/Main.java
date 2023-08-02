import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Main {
    public static void main(String[] args) {


        Book book = new Book("B003","Amba Yaluwo","ISBN-003");
        Author author = new Author("A001", "Martin Wikramasinghe", "marting@gmail.com", book);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(book);
        session.persist(author);

        transaction.commit();
        session.close();

    }
}
