using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPS
{
    abstract class Animal
    {
        protected string name;
        public virtual void setname(string name)
        {

        }
        public virtual void getname()
        {

        }
        abstract public void eat(); 
    }
    class Dog : Animal
    {
        public override void setname(string _name)
        {
            name = _name;
        }
        public override void eat()
        {
            Console.WriteLine("Dog is eating");
        } 
        public override void getname()
        {
            Console.WriteLine("Name of Dog is " + name);
        }

    }
    class abs
    {
        static void Main3(string[] args)
        {
            Dog d = new Dog();
            d.setname("doggy");
            d.getname();
            d.eat();
            Console.ReadLine();
        }
    }
}
