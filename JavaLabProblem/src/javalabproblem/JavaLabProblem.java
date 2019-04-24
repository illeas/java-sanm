/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabproblem;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author teacher
 */
public class JavaLabProblem {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
//            Triangle triangle = new Triangle(1,2,3);
//            System.out.println(triangle.getArea() + " " + triangle.getCurcumference());
//        } catch (NotPossible ex) {
//            System.out.println(ex.toString());
//        }
//        Rectangle rectangle = new Rectangle(1,2);
//        System.out.println(rectangle.getArea() + " " + rectangle.getCurcumference());
//        
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                a();
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                b();
            }
        };
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }
    
    static void a() {
        System.out.println("A starts");
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaLabProblem.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("A ends");
    }
    
    static void b() {
        System.out.println("B starts");
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaLabProblem.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("B ends");
    }
    
}
