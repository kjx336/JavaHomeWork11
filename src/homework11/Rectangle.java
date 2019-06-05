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
public class Rectangle {
    private Point p1,p2;
    public Rectangle(){
        p1 = new Point(0,0);
        p2 = new Point(0,0);
    }
    public Rectangle(Point p1,Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Rectangle(int x1, int y1, int x2, int y2){
        p1 = new Point(x1,y1);
        p2 = new Point(x2,y2);
    }
    public Rectangle(Point p){
        this(new Point(0,0),p);
    }
    public Rectangle(int width,int height){
        this(0,0,width,height);
    }
    public void move(int deltax,int deltay){
        p1.setXY(p1.getX() + deltax,p1.getY() + deltay);
        p2.setXY(p2.getX() + deltax,p2.getY() + deltay);
    }
    public boolean isInside(Point p){
        int x = p.getX();
        int y = p.getY();
        boolean b = (x>= p1.getX())&&(x<=p2.getX())&&(y>= p1.getY())&&(y<=p2.getY());
        return b;
    }
    public int area(){
        return(p2.getX()-p1.getX())*(p2.getY()-p1.getY());
    }
    public String toString(){
        return p1 + " " + p2;
    }
}
