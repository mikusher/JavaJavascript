/**
 * Copyright (C) 2017, Luis Tavares - 08/08/2017
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */





package cv.mikusher.outros;





import java.util.Scanner;





class Parallelogram {

    int area = 0;





    public void computeArea() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base of the Parallelogram: ");
        int base = scan.nextInt();
        System.out.println("Enter the height of the Parallelogram: ");
        int height = scan.nextInt();
        area = base * height;
    }





    public int getArea() {

        return area;
    }
}





class rectangle extends Parallelogram {

    public void compute() {

        rectangle rec = new rectangle();
        rec.computeArea();
        System.out.println("The area of the rectangle is " + rec.getArea());
    }
}





class square extends Parallelogram {

    public void compute() {

        square sq = new square();
        sq.computeArea();
        System.out.println("The area of the square is " + sq.getArea());
    }
}





class rhombus extends Parallelogram {

    public void compute() {

        rhombus rhom = new rhombus();
        rhom.computeArea();
        System.out.println("The area of the rhombus is " + rhom.getArea());
    }
}





class Quadrilateral {

    int areaa = 0;





    public void computeArea() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base1 of the Quadrilateral: ");
        int base = scan.nextInt();
        System.out.print("Enter the base2(if it have, make it 0 if it not included) of the Quadrilateral: ");
        int base2 = scan.nextInt();
        System.out.print("Enter the height of the Quadrilateral: ");
        int height = scan.nextInt();
        areaa = ((base + base2) * height) / 2;
    }





    public int getArea() {

        return areaa;
    }
}





class kite extends Quadrilateral {

    public void compute() {

        kite ki = new kite();
        ki.computeArea();
        System.out.println("The area of the kite is " + ki.getArea());
    }
}





class trapezoid extends Quadrilateral {

    public void compute() {

        trapezoid trap = new trapezoid();
        trap.computeArea();
        System.out.println("The area of the trapezoid is " + trap.getArea());
    }
}





public class AreaOfaQuadrilateral {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Trapezoid\n" + "2 - Rhombus\n" + "3 - Rectangle\n" + "4 - Kite\n" + "5 - Square\n" + "Enter the shape you want to compute the area: ");
        int haha = scan.nextInt();
        switch (haha) {
            case 1:
                trapezoid tr = new trapezoid();
                tr.compute();
                break;
            case 2:
                rhombus rh = new rhombus();
                rh.compute();
                break;
            case 3:
                rectangle aa = new rectangle();
                aa.compute();
                break;
            case 4:
                kite ki = new kite();
                ki.compute();
                break;
            case 5:
                square sq = new square();
                sq.compute();
                break;
            default:
                System.out.println("Please enter a valid number.");

                break;
        }
    }

}
