using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2bavana
{
    class Program
    {
        static void Main(string[] args)
        {
            //equality program
            int a = 10, b = 12;
            String d = a == b ? "equal" : "not equal";
            //leap year program
            int year = int.Parse(Console.ReadLine());
            String c = year%400==0 ? "leap year" :year%100==0?"not leap":year % 4==0 ? "leap" : "not leap";
            Console.WriteLine(c);
            Console.ReadLine();
            
        }
    }
}
