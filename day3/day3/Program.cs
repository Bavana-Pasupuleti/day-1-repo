using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace day3
{
    class Program
    {
        static void Main1(string[] args)
        {
            string str = Console.ReadLine();
            int scount = 0, acount = 0, dcount = 0,n=str.Length;
            for (int i = 0; i < n; i++)
            {
                if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z'))
                {
                    acount++;
                }
                else if (str[i] >= '0' && str[i] <= '9')
                {
                    dcount++;
                }
                else
                {
                    scount++;
                }
            }
            Console.WriteLine("Alphabet count {0}",acount);
            Console.WriteLine("digit count {0} ",dcount);
            Console.WriteLine("Special Character count {0}",scount);
            Console.ReadLine();
        }
    }
}
