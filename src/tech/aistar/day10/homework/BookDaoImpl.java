package tech.aistar.day10.homework;

import java.util.Arrays;

public class BookDaoImpl implements IBookDao {

    private Book[] book = new Book[10];
    private int size;


    //增加一个图书
    @Override
    public void save(Book b) {

        if (size < book.length) {
            book[size] = b;
            size++;
            System.out.println("成功保存图书：" + b.getBookName());
        }
    }


    //查询所有的图书
    @Override
    public Book[] findAll() {
        if (book[0]==null)
        {
            System.out.println("sorry,您还没有添加图书");
        }
        return Arrays.copyOf(book, size);
    }


    //isbn唯一的,根据编号删除
    @Override
    public void delByIsbn(String isbn) {
        for (int i = 0; i < size; i++) {
            Book b = new Book();
            if (isbn.equals(b.getIsbn())){
                book=null;
            }
            System.out.println("");
        }
    }


    //根据价格降序排
    @Override
    public Book[] sortByPriceDesc() {

        return new Book[0];
    }
}
