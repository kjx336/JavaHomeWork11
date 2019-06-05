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
public class HashMapTest {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        HashMap<String, Point> mapPoint=new HashMap<String, Point>();  
        HashMap<String, Rectangle> mapRectangle=new HashMap<>();
        mapPoint.put("p1",p1);
        mapPoint.put("p2",p2);
        for (Point p : mapPoint.values()) {   //第一种遍历方法，使用增强型for循环         
            System.out.println(p);
        }
        mapRectangle.put("r1",new Rectangle(p1,p2));
        mapRectangle.put("r2",new Rectangle(2,3,5,6));
        for (Map.Entry<String, Rectangle> entry : mapRectangle.entrySet()) {  //第二种遍历方法，使用Map.entrySet遍历key和value
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }
    
}
