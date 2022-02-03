using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPS
{
     interface Vehicle
    {
        void drive();
        bool gas(int fuel); 
    }
    class Car : Vehicle
    {
        public int fuel;
        public Car(int _fuel)
        {
            fuel = _fuel;
        }
        public void drive()
        {
          
                Console.WriteLine("Car is running");
            
           
        }
        public bool gas(int fuel)
        {
            fuel = fuel * 2;
            Console.WriteLine(fuel);
            return true;
        }

    }
    class Shapeproblem
    {
        static void Main4(string[] args)
        {
            Car c = new Car(0);
            c.drive();
            c.gas(150);
            Console.ReadLine();
        }
    }
}
