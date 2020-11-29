import java.util.Random;
import java.lang.*;
import java.io.*;


class Employee
{

        public static void main(String[] args)
        {
            int head=1;
            int tail=0;

            System.out.println("Welcome to employee wage computation");


Random random=new Random();
            int  randomNum=random.nextInt(2);
            if(randomNum == head)
            {
                System.out.println("Employee is present:"+randomNum);
            }
            else
            {
                System.out.println("Employee is absent:"+randomNum);
            }
	}
}
