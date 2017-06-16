package ObjectOriented;
public class RectangleDEMO {

    public static void main(String[] args) {
        //class Instantiation
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(1.2);
        Rectangle rect3 = new Rectangle(1.2,1.4);
        
        rect1.displayArea();
        double area = rect1.display_Area();
        System.out.println(area = rect1.display_Area());
    }
}
