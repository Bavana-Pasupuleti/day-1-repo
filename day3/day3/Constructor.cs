using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace day3
{
    class Con
    {
        int a, b;
        public Con()
        {
            Console.WriteLine("Constructor");
        }
        public Con(int c,int d)
        {
            this.a = c;
            this.b = d;
        }
        static Con()
        {
            Console.WriteLine(" Static Constructor");

        }
        public void display()
        {
            Console.WriteLine(a + b);
        }
    }
    class Constructor
    {
        static void Main(string[] args)
        {
            Con c = new Con();
            Con c1 = new Con(10, 2);
        }
    }
}
