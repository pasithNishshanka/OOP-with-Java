
package com.mycompany.practicalthree;

/*
public class Three
{
    private int age;
    private String name;
    private double salary;
    
    public void setAge(int a)
    {
        age=a;
    }
    public int getAge()
            {
                return age;
            }
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setSalary(double s)
    {
        salary=s;
    }
    public double getSalary()
    {
        return salary;
    }
    
}
*/


/*
public class Three
{
    private int age;
    private String name;
    private double salary;
    
    public Three(int age,String name,double salary)
    {
        this.age=age;
        this.name=name;
        this.salary=salary;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
}
*/


/*
public class Three
{
    private String name;
    private int bSalary,bonus,nSalary;
    
    public Three(String name,int bSalary,int bonus)
    {
        this.bSalary=bSalary;
        this.name=name;
        this.bonus=bonus;
        this.nSalary=nSalary;
      
    }
    public int setNet(int nSalary)
    {
        nSalary=bSalary+bonus;
        
        return nSalary;
    }
    public void display()
    {
        System.out.println("Name is : "+name);
        System.out.println("Basic Salary :"+bSalary);
        System.out.println("Bonus is : "+bonus);
        
        
    }
    
}
*/


public class Three
{
    private String name;
    private int bSalary,bonus;
    
    public Three(String name,int bSalary,int bonus)
    {
        this.name=name;
        this.bSalary=bSalary;
        this.bonus=bonus;
        
    }
    public String getName()
    {
        return name;
    }
    public int getSalary()
    {
        return bSalary;
    }
    public int getBonus()
    {
        return bonus;
    }
    public int calNetSalary()
    {
        return bSalary+bonus;
    }
    
}