/* 
 * 薪水计算器
 */

import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("*******薪水计算器*******");
        
        while(true){
            System.out.println("您的名字是?");
            String userName = s.next();
            System.out.println("您薪水共计多少月?");
            int userSalary_extraMonth = s.nextInt();
            System.out.println("您的每月薪水为?");
            double userSalary_perMonth = s.nextDouble();

            //年薪
            double userSalary_perYear = userSalary_perMonth*userSalary_extraMonth;

            System.out.println(userName+"先生,您的年薪为"+userSalary_perYear+".");
            System.out.println((userSalary_perYear>200000.0?"恭喜您,收入超越了98%的国人!":(userSalary_perYear>100000.0?"恭喜您,收入超过了90%的国人!":"加油!")));
            
            System.out.println("键入1,再次使用;键入2,退出系统.");
            int control = s.nextInt();
            while (control!=1&control!=2) {
                System.out.println("键入1,再次使用;键入2,退出系统.");
                control = s.nextInt();
            }
            if(control==2){
                System.out.println("感谢您的使用.");
                break;
            }else{
                System.out.println("重新开始计算.");
            }
        }
    }
}