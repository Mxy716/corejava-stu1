package tech.aistar.design.templates;

public class TemplateTest {
    public static void main(String[] args) {
        JdbcTemplate useDao = new UserDaoImpl();
        useDao.task();

        System.out.println("======");

        JdbcTemplate teacherDao = new TeacherDaoImpl();
        teacherDao.task();
    }
}
