package tech.aistar.day07.homework.test1;

public class ComputerDemo {
    public static void main(String[] args) {

        Screen s1 = new Screen("CRT",23,"三星");
        Computer c1 = new Computer("联想",89999.0,"高性价比",s1);

        c1.setPrices(30000.0);
        System.out.println(c1);
    }
}
