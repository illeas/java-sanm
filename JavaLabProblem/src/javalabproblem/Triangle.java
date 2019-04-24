/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabproblem;

/**
 *
 * @author teacher
 */
public class Triangle implements Shape{
    int a;
    int b;
    int c;
    Triangle() {
        a = b = c = 1;
    }
    Triangle(int a, int b, int c) throws NotPossible {
        if(a + b <= c
                || a + c <= b
                || b + c <= a) {
            NotPossible notPossible = new NotPossible();
            throw notPossible;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a+b+c) / 2.;
        double area = s * (s-a) * (s-b) * (s-c);
        area = Math.sqrt(area);
        return area;
    }

    @Override
    public int getCurcumference() {
        return a+b+c;
    }
}
