    import java.util.Scanner;
    abstract class Shape {
    double l, b, h, r;
    final double PI = 3.14;
    Shape(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    Shape(double h, double r){
        this.h = h;
        this.r = r;
    }
    Shape(double l){
        this.l = l;
    }
     abstract double volume();
     abstract double surfaceArea();
}
class Box extends Shape {
    Box(double l, double b, double h){
        super(l,b,h);
    }
    double volume(){
        return l*b*h;
    }
    double surfaceArea(){
        return (2*(l*h)+2*(l*b)+2*(b*h));
    }
}
class Cube extends Shape {
    Cube(double l){
        super(l);
    }
    double volume(){
        return l*l*l;
    }
    double surfaceArea(){
        return 6*l*l;
    }
}
class Cylinder extends Shape{
    Cylinder(double h, double r){
        super(h,r);
    }
    double volume(){
        return PI*r*r*h;
    }
    double surfaceArea(){
        return (2*PI*r*h + 2*PI*r*r);
    }
}
class ShapeInheritenceTest{
 public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter dimensions of Shape(box, cube, cylinder), length, breadth, height and radius respectively : ");
    double l = in.nextDouble();
    double b = in.nextDouble();
    double h = in.nextDouble();
    double r = in.nextDouble();
    
    Box box = new Box(l,b,h);
    Cube cube = new Cube(l);
    Cylinder cylinder = new Cylinder(h,r);
    
    double vol, sa;
    
    vol = box.volume();
    sa = box.surfaceArea();
    
    System.out.println("\nVolume of Box : "+vol+" \n"+"Surface Area of Box : "+sa);
    
    vol = cube.volume();
    sa = cube.surfaceArea();
    
    System.out.println("\nVolume of Cube : "+vol+" \n"+"Surface Area of Cube : "+sa);
    
    vol = cylinder.volume();
    sa = cylinder.surfaceArea();
    
    System.out.println("\nVolume of Cylinder : "+vol+" \n"+"Surface Area of Cylinder : "+sa);
}
}
