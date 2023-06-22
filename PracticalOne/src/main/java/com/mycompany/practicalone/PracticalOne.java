

package com.mycompany.practicalone;

/*
public class PracticalOne {

    public static void main(String[] args) 
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Executing Loop "+i);
        }
    }
}
*/


/*
public class PracticalOne
{
    public static void main(String[] args)
    {
        int [] numbers={10,20,30,40,50};
        for(int x:numbers)
        {
            if(x==30)
            {
                break;
            }
            System.out.println(x);
        }
        System.out.println("I m out of the loop now");
                
    }
}
*/


public class PracticalOne
{
    public static void main(String[] args)
    {
        char grade='A';
        switch(grade)
        {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is "+grade);
    }
}
        

