package shapes;


public class Rectangle extends Quadrilateral implements Measurable {

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width){
        this.width = width;
    }
//
//    //protected properties for both length and width:
//    protected double length;
//    protected double width;

    public Rectangle(double length, double width) {
        super(length, width);
//        this.length = length; not needed because of "super"
//        this.width = width;
    }
//
//    // two methods on the Rectangle class,
//    // getArea and getPerimeter that return the respective values.
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return 2 * length + 2 * width;
//    }



    public static void main(String[] args) {
//        Rectangle bobTangle = new Rectangle(5, 6);
//        System.out.println("The area of the bobTangle is: " + bobTangle.getArea());

    }
}
