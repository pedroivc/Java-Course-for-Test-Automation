package chapter9;

public class InheritanceTester {

    public static void main(String args[]){

        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());

        /*Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");
        */
    }
}
