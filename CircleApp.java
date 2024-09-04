import java.util.*;
class Circle {
    
    void area(float radius){
        float res=(float)Math.PI*radius*radius;
        System.out.println(res);
        }
}
public class CircleApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Circle obj=new Circle();
        float radius=scan.nextFloat();
        obj.area(radius);
    }
}