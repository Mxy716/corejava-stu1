package tech.aistar.design.templates;

public class TeacherDaoImpl extends JdbcTemplate {
    @Override
    public void execute() {
        System.out.println("select * from teacher;");
    }
}
