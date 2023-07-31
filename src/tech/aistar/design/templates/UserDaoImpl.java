package tech.aistar.design.templates;

public class UserDaoImpl extends JdbcTemplate {

    @Override
    public void execute() {
        System.out.println("select *from user;");
    }
}
