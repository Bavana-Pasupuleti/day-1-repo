using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPS
{
    class Person1
    {
        public string name;
        public Person1(string _name)
        {
            name = _name;
        }
      
         ~Person1()
        {
            name = "";
        }
    }

    class problem2
    {
        static void Main2(string[] args)
        {
            string n;
            Person1[] p = new Person1[3];
            for(int i = 0;i< 3; i++){
                Console.WriteLine("Enter name {0}", i);
                n = Console.ReadLine();           
                Person1 p1 = new Person1(n);
                p[i] = p1;            
            }

            for (int i = 0; i < 3; i++)
            {
                Console.WriteLine(p[i]);
            }
            Console.ReadLine();
        }
    }
}
