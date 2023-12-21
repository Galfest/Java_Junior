package l2.classwork;

public class Book {
    //region fields
        private int date;
        private String name;

    //endregion

    //region Constructors

    public Book(int date, String name) {
        this.date = date;
        this.name = name;
    }

    //endregion

    //region Getters

    public int getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    //endregion

    //region methods

    @Override
    public String toString() {
        return "Book{" +
                "Date: " + date + "\n" +
                ", Name: '" + name + '\'' +
                '}';
    }

    //endregion
}
