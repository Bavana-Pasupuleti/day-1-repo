using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPS
{

    class Person
    {
        public int age;
        public void greet()
        {
            Console.WriteLine("Hello");
        }
        public void setage(int _age)
        {
            age = _age;
        }
    }
    class Student:Person 
    {
        public int sage;
        public Student(int sage)
        {
            sage = base.age;
        }
        public void study()
        {
            Console.WriteLine("I'm Studying");
        }
        public void display()
        {
            Console.WriteLine("Hello I am student my age is {0}", base.age);
        }

    }
    class Professor:Person
    {
        public void explain()
        {
            Console.WriteLine("I'm explaining");
        }

    }
    class Program
    {
        static void Main1(string[] args)
        {

        }
    }
}
