package me.hifancy.im;

public class DoIt {
    public static void main(String[] args) {
        putSc.getConn();

        putSc ps = new putSc();
        InsertInto insert = new InsertInto();
        student s = new student();
        String sql = "INSERT INTO sc(s_no, s_name, s_sex,class)VALUES";
        for (int i = 0;i < 60;i++){
            student s1 = new student();
            s1.setS_name(insert.getName());
            s1.setS_sex(insert.getSex());
            s1.setS_birth(insert.getBirth());
            s1.setS_class(insert.getClass1());
            s1.setGrade(insert.getRade());
            String  sql_sc = "("+i+","+"'" + s1.getS_name()+"'"+","+"'" + s1.getS_sex()+"'" + ","+"'" + s1.getS_class()+"'" +")";
            String sql1 = "INSERT INTO grade(s_no, s_name,class,rade)VALUES";
            String sqlgrade = "("+i+","+"'" + s1.getS_name()+ "'"+","+s1.getS_class()+","+s1.getGrade() +")";
            System.out.println(sql1 + sqlgrade);
            System.out.println(sql + sql_sc);
            try {
                ps.doSth(sql1 + sqlgrade);
                ps.doSth(sql + sql_sc);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
