using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace day3
{
    class Another
    {
        int rollnumber;
        string department;
        string name;
        int age;
        double gpa;
        public void getValues()
        {
            Console.WriteLine("Please enter student details in the order-\tName\tRoll number\tDepartment\tAge\tGPA");
            name=Console.ReadLine();
            rollnumber = Convert.ToInt32(Console.ReadLine());
            department = Console.ReadLine();
            age = Convert.ToInt32(Console.ReadLine());
            gpa= Convert.ToDouble(Console.ReadLine());
        }
        public void display()
        {
            Console.WriteLine("-------------------------------------------");
            Console.WriteLine("Entered stuent details are:");
            Console.WriteLine("1.Student name : {0}\n2.Student roll number : {1}\n3.Student Department : {2}\n4.Sudent age : {3}\n5.Student GPA : {4}",name,rollnumber,department,age,gpa);
           
        }
    }
    class ClassConcepts
    {
        static void Main3(string[] args)
        {
            Another[] students = new Another[3];
             for(int i = 0; i < 3; i++)
            {
                Another obj = new Another();
                obj.getValues();
                students[i] = obj;
            }
             for(int i = 0; i < 3; i++)
            {
                students[i].display();
            }
            Console.ReadLine();
        }
    }
}
