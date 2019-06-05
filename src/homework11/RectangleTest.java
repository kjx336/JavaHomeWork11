/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework11;
/**
 *
 * @author kjx33
 */
public class RectangleTest {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        Rectangle r1 = new Rectangle(p1,p2);
        Rectangle r2 = new Rectangle(2,3,5,6);
        System.out.println("r1:" + r1);
        System.out.println("r2:" + r2);
    }
    
}
