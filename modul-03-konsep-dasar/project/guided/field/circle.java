/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided.field;

/**
 *
 * @author Hype G12
 */
public class circle {
    public static final double PI = 3.14159;
    
    public static double radiansToDegrees (double rads) {
            return rads * 180 / PI;
    }
    public double r;
    
    public double area (){
        return PI * r * r;
    }
            
    public double circumreference(){
        return 2 * PI * r;
    }
}
