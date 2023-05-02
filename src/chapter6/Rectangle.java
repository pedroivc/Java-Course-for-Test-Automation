package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * getLength()) + (2 * getWidth());
    }

    public double calculateArea(){
        return getLength() * getWidth();
    }
}
