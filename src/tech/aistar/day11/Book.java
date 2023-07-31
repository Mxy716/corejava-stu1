package tech.aistar.day11;

import java.util.Date;
import java.util.Objects;

public class Book implements Cloneable {
    private int id;
    private String isbn;
    private String bookName;
    private double price;
    private String type;
    private Date creatDate;

    private BookInfo bookInfo;

    public Book() {
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatDate() {
        return creatDate;
    }



    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Book(int id, String isbn, String bookName, double price) {
        this.id = id;
        this.isbn = isbn;
        this.bookName = bookName;
        this.price = price;
    }


    public Book(int id, String isbn, String bookName, double price, String type, Date creatDate) {
        this.id = id;
        this.isbn = isbn;

        this.bookName = bookName;
        this.price = price;
        this.type = type;
        this.creatDate = creatDate;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && bookInfo.equals(book.bookInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookInfo);
    }


    //    @Override
//    public boolean equals(Object obj) {
//        //1.非空性判断
//        if (null==obj) return false;
//
//        //2.自反性判断
//        if (this==obj) return true;
//
//        //3. 类型一致性
//        //3-1. obj instanceof Book
//        //3-2. 判断对象的class实例
//        // if(!(obj instanceof Book)) return false;
//        if (getClass()!=obj.getClass()) return false;
//
//        //根据实际业务的比较的需求来控制它的返回结果
//        //比如只要id一样,就认为是同一个对象
//
//        Book b = new Book();
//        b= (Book) obj;
//        //id一样的时候
////        return this.id==b.getId();
//
//        //id和isbn一样的时候,才认为是同一个对象
//
//        return this.id==b.getId()&&this.isbn.equals(b.getIsbn());
//
//    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", bookName='").append(bookName).append('\'');
        sb.append(", price=").append(price);
        sb.append(", type='").append(type).append('\'');
        sb.append(", creatDate=").append(creatDate);
        sb.append('}');
        return sb.toString();
    }





}
