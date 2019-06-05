/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework11;

import java.util.*;
/**
 *
 * @author kjx33
 */
public class HashSetTest {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        HashSet<Point> hashPoint = new HashSet<Point>();
        HashSet<Rectangle> hashRectangle = new HashSet<Rectangle>();
        hashPoint.add(p1);
        hashPoint.add(p2);
        for (Point p : hashPoint) {   //第一种遍历方法，使用增强型for循环         
            System.out.println(p);
        }
        hashRectangle.add(new Rectangle(p1,p2));
        hashRectangle.add(new Rectangle(2,3,5,6));
        Iterator<Rectangle> ite=hashRectangle.iterator();   //第二种遍历方法，使用迭代器，每次都判断下一次是否有值
        while(ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }
    }
    
}
