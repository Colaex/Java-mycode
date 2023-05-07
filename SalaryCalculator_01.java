/* 
 * 薪水计算器
 * 加入扣除个税功能
 */

import java.util.Scanner;
public class SalaryCalculator_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("*******薪水计算器*******");
        
        while(true){
            System.out.println("您的名字是?");
            String userName = s.next();
            System.out.println("您薪水共计多少月?");
            int userSalary_extraMonth = s.nextInt();
            System.out.println("您的每月薪水为?");
            double userSalary_month = s.nextDouble();



            //个税减免
            System.out.println("您的各项专项减免总计为?\t(如三险一金以及住房赡养教育补贴等,不包括免征额)");
            double userSalary_Free = s.nextDouble()+60000.0;

            //税前薪水
            double userSalary_year = userSalary_month*userSalary_extraMonth;
            System.out.println("\n"+userName+"先生"+"\n您的年薪共计:"+userSalary_year+".");

            double userSalary_Tax;
            double userSalary_excludingFree_year = userSalary_year-userSalary_Free;


            //计税
            if(userSalary_excludingFree_year>960000){
                userSalary_Tax = userSalary_excludingFree_year*0.45-181920;
            }else{
                if(userSalary_excludingFree_year>660000){
                userSalary_Tax = userSalary_excludingFree_year*0.35-85920;
            }else{
                if(userSalary_excludingFree_year>420000){
                userSalary_Tax = userSalary_excludingFree_year*0.3-52920;
            }else{
                if(userSalary_excludingFree_year>300000){
                userSalary_Tax = userSalary_excludingFree_year*0.25-31920;
            }else{
                if(userSalary_excludingFree_year>144000){
                userSalary_Tax = userSalary_excludingFree_year*0.2-16920;
            }else{
                if(userSalary_excludingFree_year>36000){
                userSalary_Tax = userSalary_excludingFree_year*0.1-2520;
            }else{
                if(userSalary_excludingFree_year>0){
                userSalary_Tax = userSalary_excludingFree_year*0.03;
            }else{
                userSalary_Tax = 0;
            }}}}}}}

            double userSalary_excludingTax_year = userSalary_year-userSalary_Tax;

            System.out.println("您的个人所得税共计:"+userSalary_Tax);
            System.out.println("您的税后年薪共计:"+userSalary_excludingTax_year+"\n");
            
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

