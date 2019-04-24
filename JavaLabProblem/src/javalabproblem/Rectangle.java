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
public class Rectangle implements Shape{
    private int a;
    private int b;
    Rectangle() {
        a = b = 1;
    }
    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public int getCurcumference() {
        return 2 * (a + b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    
    
}
