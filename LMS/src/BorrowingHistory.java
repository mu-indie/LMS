import java.util.Date;

public class BorrowingHistory {
    //attributes
    private int historyId;
    private int bookId;
    private int userId;
    private Date borrowedDate;
    private Date returnDate;


    //default constructor
    public BorrowingHistory() {

    }


    //constructor
    public BorrowingHistory(int historyId, int bookId, int userId, Date borrowedDate, Date returnDate) {
        this.historyId = historyId;
        this.bookId = bookId;
        this.userId = userId;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
    }


    //getter and setter
    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
