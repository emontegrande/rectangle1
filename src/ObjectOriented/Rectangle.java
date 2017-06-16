package ObjectOriented;
public class Rectangle {
    //attributes
    double length;
    double width;
    
    //constructors
    Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
        System.out.println("First Constructor Loaded");
    }
    Rectangle(double length){
//        setLength(length);
        this.length = length;
        this.width = 0.0;
        System.out.println("Second Constructor Loaded");
    }
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        System.out.println("Third Constructor Loaded");
    }
    
    //METHODS
    //getter of length
    double getLength(){
        return this.length;
    }
    //getter of width
    double getWidth(){
        return this.width;
    }
    //setter of length
   void setLength(double length){
       this.length = length;
   }
   //setter of width
   void setWidth(double width){
       this.width = width;
   }
   
   //displayarea(procedural)
   void displayArea(){
       double area = this.length * this.width;
       System.out.println(area);
   }
   //displayarea(functional)
   double display_Area(){
       double area = this.length * this.width;
       return area;
   }
   
}
