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
public class Point {
    private int x,y;
    public Point(){};
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
