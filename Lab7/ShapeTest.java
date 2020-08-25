// -----------------------------------------------------
//                  ShapeTest.java
//                  Ryan Ritter
// -----------------------------------------------------

public class ShapeTest{
    public static void main(String[] args){
        Shape s = new Shape();
        System.out.println("\n");
        Triangle t = new Triangle();
        System.out.println("\n");
        Rectangle r = new Rectangle();
        System.out.println("\n");
        Square sq = new Square();
        System.out.println("\n");
        Circle c = new Circle();
        System.out.println("\n");
        Ellipse e = new Ellipse();
        System.out.println("\n");

        Shape [] array = {s, t, r, sq, c, e};
        
        for(Shape x : array){
            x.move();
            x.draw();
            x.erase();
            System.out.println("\n\n");
        }
    }
}