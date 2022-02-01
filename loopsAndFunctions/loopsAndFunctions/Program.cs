using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace loopsAndFunctions
{
    class Program
    {
        public static int fact(int n)
        {
            if (n == 1)
            {
                return 1;
            }
            else
            {
                return fact(n - 1) * n;
            }
        }
        static void Main1(string[] args)
        {
            //Sum of numbers program
            int n = int.Parse(Console.ReadLine());         
            Console.Write("All terms from {0}\t", n);
            for(int i=0;i< n; i++)
            {
                Console.Write("{0}\t",i);              
            }
            Console.WriteLine("\nSum of {0} terms is {1}", n, (n * (n + 1) / 2));

            //Pattern Program
            Console.WriteLine("Pattern");
            for (int i = 1; i <= 6; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }

            //Number Pattern
            int k = 1; 
            for (int i = 1; i <=n; i++)
                {
                for (int j = 1; j <= i; j++)
                {
                    Console.Write("{0} ", k++);
                }
                    Console.Write("\n");
                }

            int b=fact(6);
            Console.WriteLine(b);
            Console.ReadLine();
        }

            

        }
    }

