// File Name: P_22.java

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining Books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class P_22 {
    public static void main(String[] args) {
        Library lib = new Library(3);

        try {
            lib.issueBook(2);   // Valid
            lib.issueBook(2);   // Invalid
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
