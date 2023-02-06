package emp;

import java.util.Random;

public class EmployeeWageComputation
{
    int Attend1,Attend2;
    int EmpRatePerHr,EmpHrs,w;
    EmployeeWageComputation()
    {
        Random r = new Random();
        Attend1 = r.nextInt(2);
        Attend2 = r.nextInt(2);
    }
    void attendance()
    {
        if(Attend1==1)
        {
            System.out.println("Employee is present");
        }
        else if (Attend1==0)
        {
            System.out.println("Employee is absent");
        }
    }
    void wage()
    {
        if(Attend1==1 && Attend2==1)
        {
            EmpRatePerHr = 20;
            EmpHrs = 8;
            w = EmpRatePerHr * EmpHrs;
            System.out.println("FullTime employee and Employee Wage is :-" + w);
        }
        else if (Attend1==1 && Attend2==0)
        {
            EmpRatePerHr = 20;
            EmpHrs = 4;
            w = EmpRatePerHr * EmpHrs;
            System.out.println("PartTime employee and Employee Wage is :-" + w);
        }
        else if(Attend1==0)
        {
            System.out.println("Employee Wage is :-0");
        }

    }
    void switchStatement()
    {
        switch (Attend2)
        {
            case 1:
                EmpRatePerHr = 20;
                EmpHrs = 8;
                w = EmpRatePerHr * EmpHrs;
                System.out.println("Employee Wage:-" + w);
                break;
            case 0:
                EmpRatePerHr = 20;
                EmpHrs = 4;
                w = EmpRatePerHr * EmpHrs;
                System.out.println("Employee Wage:-" + w);
                break;
        }
    }
    int a = 20;               //Total working days

    int sal = 0;

    void monthSalary()
    {
        EmpRatePerHr = 20;
        EmpHrs = 8;
        for (int day = 1; day <= a; day++)
        {
            sal = sal + (EmpRatePerHr * EmpHrs);
        }
        System.out.println("salary of month:-"+sal);

    }
    void monthlySalary2()
    {
       int  TotalEmpHrs=0;
       int TotalWorkingDays=0;
      int  monthlySalary=0;
       while(TotalEmpHrs < 100 && TotalWorkingDays < 20)

       {
           TotalWorkingDays++;
           Random r = new Random();
           Attend2 = r.nextInt(2);
           switch (Attend2)
           {
               case 1:
                   EmpRatePerHr = 20;
                   EmpHrs = 8;
                   w = EmpRatePerHr * EmpHrs;
                   break;
               case 0:
                   EmpRatePerHr = 20;
                   EmpHrs = 4;
                   w = EmpRatePerHr * EmpHrs;

                   break;
           }
           monthlySalary=monthlySalary+w;
       }
        System.out.println("manthly salary is:-"+monthlySalary);
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageComputation e=new EmployeeWageComputation();
        e.attendance();
        e.wage();
        e.switchStatement();
        e.monthSalary();
        e.monthlySalary2();
    }
}
