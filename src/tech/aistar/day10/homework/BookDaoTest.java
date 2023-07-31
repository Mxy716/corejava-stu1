package tech.aistar.day10.homework;

import java.util.Date;
import java.util.Scanner;

public class BookDaoTest {
    public static void main(String[] args) {
        IBookDao bookDao = new BookDaoImpl();
        Scanner sc = new Scanner(System.in);
        int choice;

            System.out.println("======图书管理系统======");
            System.out.println("1. 保存图书");
            System.out.println("2. 查询所有图书");
            System.out.println("3. 根据编号删除图书");
            System.out.println("4. 根据价格降序排");
            System.out.println("5. 统计图书类别数量");
            System.out.print("请输入:> ");
            choice = sc.nextInt();
            do {
            switch (choice) {
                case 0:
                    System.out.println("======图书管理系统======");
                    System.out.println("1. 保存图书");
                    System.out.println("2. 查询所有图书");
                    System.out.println("3. 根据编号删除图书");
                    System.out.println("4. 根据价格降序排");
                    System.out.println("5. 统计图书类别数量");
                    System.out.print("请输入:> ");
                    choice = sc.nextInt();
                    break;
                case 1:
                    System.out.print("请输入图书id: ");
                    int id = sc.nextInt();
                    System.out.print("请输入图书编号: ");
                    String isbn = sc.next();
                    System.out.print("请输入图书价格: ");
                    double price = sc.nextDouble();
                    System.out.print("请输入图书类别: ");
                    String type = sc.next();
                    Book newBook = new Book(id, isbn, "java", price, type, new Date());
                    bookDao.save(newBook);
                    break;
                case 2:
                    Book[] allBooks = bookDao.findAll();
                    for (Book book : allBooks) {
                        System.out.println(book);
                    }
                    break;
                case 3:
                    System.out.print("请输入删除的编号: ");
                    String deleteIsbn = sc.next();
                    bookDao.delByIsbn(deleteIsbn);
                    break;
                case 4:
                    Book[] sortedBooks = bookDao.sortByPriceDesc();
                    for (Book book : sortedBooks) {
                        System.out.println(book);
                    }
                    break;
                case 5:
                    // 实现统计图书类别数量的功能
                    break;
                default:
                    System.out.println("无效的选择");
            }

            System.out.println("返回菜单 0  直接查询 2");
            System.out.print("请输入:> ");
            choice = sc.nextInt();
        } while (choice != -1);
    }
}
