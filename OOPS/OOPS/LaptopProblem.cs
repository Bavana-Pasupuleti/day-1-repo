using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPS
{
    class Square
    {
        int[] coor = new int[2];
        int side;
    public Square(int[] arr,int _side )
        {
            side = _side;
            for(int i=0;i<2; i++)
            {
                coor[i] = arr[i];
            }
        }
        public void Move(int a,int b)
        {
            coor[0] = coor[0] + a;
            coor[1] = coor[1] + b;
            Console.WriteLine("New Coordinates are ({0},{1})", coor[0], coor[1]);
        }
        public void scale(int factor)
        {
            side = side * factor;
            Console.WriteLine("new side is " + side);
        }
        public void ToS()
        {
            Console.WriteLine("Coordinates are ({0},{1}) and side is of length {2} it has a perimeter of {3} and area of {4}", coor[0], coor[1],side,4*side,side*side);

        }
    }
    class LaptopProblem
    {
        static void Main(string[] args)
        {
            int[] arr = new int[2];
            Console.WriteLine("Enter coordinates");
            for (int i = 0; i < 2; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
            }
            Console.WriteLine("Enter side");
            int side = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter how much you want to move x coordinate");
            int a = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter how much you want to move y coordinate");
            int b = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter scaling factor");
            int factor = int.Parse(Console.ReadLine());
            Square s = new Square(arr, side);
            s.Move(a, b);
            s.scale(factor);
            s.ToS();
            Console.ReadLine();
        }

        }
}
