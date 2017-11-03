package me.hifancy.im;

import java.util.Date;

public class student {
    private int s_no;
    private String s_name;
    private String s_sex;
    private Date s_birth;
    private int s_class;
    private int grade;

    public int getS_no() {
        return s_no;
    }

    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public Date getS_birth() {
        return s_birth;
    }

    public void setS_birth(Date s_birth) {
        this.s_birth = s_birth;
    }

    public int getS_class() {
        return s_class;
    }

    public void setS_class(int s_class) {
        this.s_class = s_class;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "student{" +
                "s_no=" + s_no +
                ", s_name='" + s_name + '\'' +
                ", s_sex='" + s_sex + '\'' +
                ", s_birth=" + s_birth +
                ", s_class=" + s_class +
                ", grade=" + grade +
                '}';
    }
}
