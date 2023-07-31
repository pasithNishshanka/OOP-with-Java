

package com.mycompany.practicalthree;

/*
public class PracticalThree 
{

    public static void main(String[] args)
    {
       Three t1=new Three();
       t1.setAge(22);
       t1.setName("Pasith");
       t1.setSalary(20000.00f);
       System.out.println("Age is : "+t1.getAge());
       System.out.println("Name is : "+t1.getName());
       System.out.println("Salary is : "+t1.getSalary());
    }
}
*/


/*
public class PracticalThree
{
    public static void main(String [] args)
    {
        Three t1=new Three(22,"pasith",222.0f);
        
        
        System.out.println("Age is : "+t1.getAge());
        System.out.println("Name is : "+t1.getName());
        System.out.println("Salary is : "+t1.getSalary());
    }
}
*/


/*
public class PracticalThree
{
    public static void main(String[] args)
    {
        Three t1=new Three("pasith",5000,1000);
        t1.display();
        System.out.println("Net Salary is : "+t1.setNet(0));
    }
}
*/

public class PracticalThree
{
    public static void main(String[] args)
    {
        Three t1=new Three("pasith",10000,500);
        
        String name = t1.getName();
        int bSalary=t1.getSalary();
        int bonus=t1.getBonus();
        int netSalary=t1.calNetSalary();
        
        
        System.out.println("Name is :"+name);
        System.out.println("Basic Salary :"+bSalary);
        System.out.println("Bonus is : "+bonus);
        System.out.println("Net Salary is : "+netSalary);
    }
}
