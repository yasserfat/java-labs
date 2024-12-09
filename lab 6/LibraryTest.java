// Abstract class Book
abstract class Book {
    protected String title;
    protected String author; 

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
        this.author = null; // No author for reference books
    }

    public abstract int daysOverdue(int currentDay, int dueDay);

    public abstract boolean isOverdue(int currentDay, int dueDay);

    public abstract double computeFine(int currentDay, int dueDay);
}

// RegularBook class
class RegularBook extends Book {
    private static final int BORROW_DURATION = 14; // 2 weeks
    private static final double FINE_PER_DAY = 50.0;

    public RegularBook(String title, String author) {
        super(title, author);
    }

    @Override
    public int daysOverdue(int currentDay, int dueDay) {
        return Math.max(0, currentDay - dueDay);
    }

    @Override
    public boolean isOverdue(int currentDay, int dueDay) {
        return currentDay > dueDay;
    }

    @Override
    public double computeFine(int currentDay, int dueDay) {
        return daysOverdue(currentDay, dueDay) * FINE_PER_DAY;
    }
}

// ReferenceBook class
class ReferenceBook extends Book {
    private static final int BORROW_DURATION = 2; // 2 days
    private static final double FINE_PER_DAY = 50.0;

    public ReferenceBook(String title) {
        super(title);
    }

    @Override
    public int daysOverdue(int currentDay, int dueDay) {
        return Math.max(0, currentDay - dueDay);
    }

    @Override
    public boolean isOverdue(int currentDay, int dueDay) {
        return currentDay > dueDay;
    }

    @Override
    public double computeFine(int currentDay, int dueDay) {
        return daysOverdue(currentDay, dueDay) * FINE_PER_DAY;
    }
}

// AudioBook class
class AudioBook extends Book {
    private static final int BORROW_DURATION = 14; // 2 weeks
    private static final double FINE_PER_DAY = 70.0;

    public AudioBook(String title, String author) {
        super(title, author);
    }

    @Override
    public int daysOverdue(int currentDay, int dueDay) {
        return Math.max(0, currentDay - dueDay);
    }

    @Override
    public boolean isOverdue(int currentDay, int dueDay) {
        return currentDay > dueDay;
    }

    @Override
    public double computeFine(int currentDay, int dueDay) {
        return daysOverdue(currentDay, dueDay) * FINE_PER_DAY;
    }
}

// Test program
public class LibraryTest {
    public static void main(String[] args) {
        Book regularBook = new RegularBook("The Great Gatsby", "F. Scott Fitzgerald");
        Book referenceBook = new ReferenceBook("Oxford Dictionary");
        Book audioBook = new AudioBook("Becoming", "Michelle Obama");

        int today = 18; // Current day in the library system
        int dueDay = 14; // Example due date

        // Test regular book
        System.out.println("Regular Book:");
        System.out.println("Days Overdue: " + regularBook.daysOverdue(today, dueDay));
        System.out.println("Is Overdue: " + regularBook.isOverdue(today, dueDay));
        System.out.println("Fine: " + regularBook.computeFine(today, dueDay));

        // Test reference book
        System.out.println("\nReference Book:");
        System.out.println("Days Overdue: " + referenceBook.daysOverdue(today, dueDay));
        System.out.println("Is Overdue: " + referenceBook.isOverdue(today, dueDay));
        System.out.println("Fine: " + referenceBook.computeFine(today, dueDay));

        // Test audio book
        System.out.println("\nAudio Book:");
        System.out.println("Days Overdue: " + audioBook.daysOverdue(today, dueDay));
        System.out.println("Is Overdue: " + audioBook.isOverdue(today, dueDay));
        System.out.println("Fine: " + audioBook.computeFine(today, dueDay));
    }
}
