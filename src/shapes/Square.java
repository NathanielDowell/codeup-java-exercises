package shapes;

public class Square extends Quadrilateral {
    @Override
    public void setLength(double length) {
        this.width = length;
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    public Square(double side) {
        super(side, side);
    }

//    @Override
//    public double

    //    public Square (double side) {
//        super(side, side);
//    }

}
