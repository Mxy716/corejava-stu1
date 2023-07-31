package tech.aistar.day10.homework;

public interface IBookDao {
     void save(Book b);//增加一个图书

     Book[] findAll();//查询所有的图书

    void delByIsbn(String isbn);//isbn唯一的,根据编号删除

    Book[] sortByPriceDesc();//根据价格降序排
}
