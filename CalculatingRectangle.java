package CalculatingRectangle;

//CC2-1B Saldua,Gio Brix R.
public class CalculatingRectangle {
    public static void main(String[] args) {
        
        // Given values
        double length = 32.0; // Meters
        double width = 12.0;   // Meters
        
        // Calculations
        double area = length * width;
        double perimeter = 2 * (length + width);
        
        // Output
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Area: " + area + " square meters");
        System.out.println("Perimeter: " + perimeter + " meters");
    }
}