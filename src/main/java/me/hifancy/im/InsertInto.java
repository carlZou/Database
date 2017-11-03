package me.hifancy.im;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.junit.jupiter.api.Test;

public class InsertInto {
    private String[] firstName = {"赵","钱","孙","李","周","武","郑","王","冯","陈","楚","魏"};
    private String[] lastName = {"喜权","林一","云","军","杰","涛","铁蛋","二狗","翠花","狗蛋","狗一","狗夫"};
    private String[] sex = {"man","woman"};

     Random rd = new Random();
    public String getName() {
        String name =  firstName[rd.nextInt(firstName.length)]+lastName[rd.nextInt(lastName.length)];
        return name;
    }

    public String getSex(){
        String sex2 = sex[rd.nextInt(sex.length)];
        return sex2;
    }

    public Date getBirth(){
        Date randomDate = randomDate("1990-01-01", "2000-03-01");
        return randomDate;
    }

    public int getClass1(){
        return rd.nextInt(2);
    }

    @Test
    public float getGrade(){
        float grade =  rd.nextFloat()*100;
        BigDecimal bd = new BigDecimal(grade);
        return  bd.setScale(2,2).floatValue();
    }

    public int getRade(){
        return rd.nextInt(100);
    }

    /**
     * 获取随机日期
     *
     * @param beginDate
     *            起始日期，格式为：yyyy-MM-dd
     * @param endDate
     *            结束日期，格式为：yyyy-MM-dd
     * @return
     */

    private static Date randomDate(String beginDate, String endDate) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date start = format.parse(beginDate);// 构造开始日期
            Date end = format.parse(endDate);// 构造结束日期
            // getTime()表示返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
            if (start.getTime() >= end.getTime()) {
                return null;
            }
            long date = random(start.getTime(), end.getTime());

            return new Date(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static long random(long begin, long end) {
        long rtn = begin + (long) (Math.random() * (end - begin));
        // 如果返回的是开始时间和结束时间，则递归调用本函数查找随机值
        if (rtn == begin || rtn == end) {
            return random(begin, end);
        }
        return rtn;
    }


//    @Test
//    public void Testsc(){
//
//        for (int j = 0;j < 40; j++){
//            student s = new student();
//            s.setS_name(getName());
//            s.setS_sex(getSex());
//            s.setS_birth(getBirth());
//            s.setS_class(getClass1());
//            s.setGrade(getGrade());
//            System.out.println(s.toString());
//        }
//
//    }



}
