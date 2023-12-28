package Tutorials.ObjectDemo;

public class CreatingObject {
    public static void main(String[] args){
        Point p1 = new Point(1, 2);
        p1.x = 2;
        int a = p1.x;
        a = 10;
        System.out.println("x: " + p1.x);
    }

}
class Point {
    public int x = 0;
    public int y = 0;
    // a constructor!
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}


class Rectangle{
    public int width = 0;
    public int height = 0;
    public Point origin;

    public Rectangle(){
        origin = new Point(0, 0);
    }

    public Rectangle(Point p){
        origin = p;
    }

    public Rectangle(int w, int h){
        height = h;
        width = w;
        origin = new Point(0, 0);
    }

    public Rectangle(int w, int h, Point p){
        height = h;
        width = w;
        origin = p;
    }

    public void move(int x, int y){
        origin.x = x;
        origin.y = y;
    }

    public int getArea(){
        return width * height;
    }
}
