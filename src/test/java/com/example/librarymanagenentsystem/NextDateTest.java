package com.example.librarymanagenentsystem;
import java.util.Scanner;
public class NextDateTest {
    public static  String nextDate(int m,int d,int y){
        if (m == 12 &&d==31 ) {
            if (y== 2050){
                return "日期输入错误";
            }else {
                return (y + 1) + "年1月1日";
            }
        }
        // 判断输入的年份是平年还是闰年,来判断当输入2月时天数是否有误
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {// 该年是闰年,2月有29天
            if (m == 2) {
                if (d > 29) {
                    return "日期输入错误";
                } else if (d < 1) {
                    return "日期输入错误";
                } else {
                    if (d == 29) {
                        return y + "年" + 3 + "月" + 1+"日";
                    } else {
                        d += 1;
                    }
                }
            }
        } else {// 该年是平年,2月有28天
            if (m == 2) {
                if (d > 28) {
                    return "日期输入错误";
                } else if (d < 1) {
                    return "日期输入错误";
                } else {
                    if (d == 28) {
                        return y + "年" + 3 + "月" + 1+"日";
                    } else {
                        d += 1;
                    }
                }
            }
        }
        // 判断4 6 9 11 月的天数输入
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d > 30) {
                return "日期输入错误";
            } else if (d < 1) {
                return "日期输入错误";
            } else {
                if (d == 30) {
                    m += 1;
                    d = 1;
                } else {
                    d+= 1;
                }
            }
        } else if (m != 2) { // 判断1 3 5 7 8 10 12月的天数输入
            if (d > 31) {
                return "日期输入错误";
            } else if (d < 1) {
                return "日期输入错误";
            } else {
                if (d == 31) {
                    m += 1;
                    d = 1;
                } else {
                    d += 1;
                }
            }
        }
        return y+"年"+m+"月"+d+"日";
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        do{
            System.out.println("请输入年(一个数字)");
            int y = in.nextInt();
            if(y==-1){
               break;
            }
            if (y<1964||y>2050) {
                System.out.println("年份输入错误");
            }
            System.out.println("请输入月(一个数字)");
            int m = in.nextInt();
            if(y==-1){
                break;
            }
            if (m<1||m> 12) {
                System.out.println("月份输入错误");
            }
            System.out.println("请输入日(一个数字)");
            int d = in.nextInt();
            if(y==-1){
                break;
            }
            if (d<1||d> 31) {
                System.out.println("日期输入错误");
            }
            String s = nextDate(m, d, y);
            System.out.println(s);
        }
        while(true);
    }
}

