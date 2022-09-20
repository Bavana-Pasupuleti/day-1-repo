using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Delegatepractice
{
    public delegate void add(int a, int b);
    public delegate void sub(int a, int b);
    public delegate void mul(int a, int b);
    public delegate void div(int a, int b);
    class Program
    {
         public void addition(int a, int b)
        {
            Console.WriteLine("addition result is {0}", a + b);
        }
        public void subraction(int a, int b)
        {
            Console.WriteLine("subraction result is {0}", a - b);
        }
        public void multiplication(int a, int b)
        {
            Console.WriteLine("multiplication result is {0}", a * b);
        }
        public void divison(int a, int b)
        {
            Console.WriteLine("addition result is {0}", a / b);
        }
        static void Main(string[] args)
        {
            Program obj = new Program();
            add obj1 = new add(obj.addition);
            sub obj2 = new sub(obj.subraction);
            mul obj3 = new mul(obj.multiplication);
            div obj4 = new div(obj.divison);
            //multicasting: in this case i have not created any instance for multiplicattion but i can still call it using delegate, now whenever i call addition this is also called
            obj1 = obj1 + obj.multiplication;
            //obj1.Invoke(100, 15);
            obj1(100, 200);
            //obj2(200, 75);
            //obj3(50, 70);
            //obj4(175, 5);
            Console.ReadLine();
        }
           
    }
    }
    

    

