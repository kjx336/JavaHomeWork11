package homework11;

import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjx33
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        TreeSet<Point> treePoint = new TreeSet<Point>();
        TreeSet<Rectangle> treeRectangle = new TreeSet<Rectangle>();
        treePoint.add(p1);
        treePoint.add(p2);
        for (Point p : treePoint) {   //第一种遍历方法，使用增强型for循环         
            System.out.println(p);
        }
        treeRectangle.add(new Rectangle(p1,p2));
        treeRectangle.add(new Rectangle(2,3,5,6));
        Iterator<Rectangle> ite=treeRectangle.iterator();   //第二种遍历方法，使用迭代器，每次都判断下一次是否有值
        while(ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }
    }
    
}
