public class AreaCalc {

    public static double area(double radius) {
        //checks if the radius is bigger than 0
        if (radius < 0) {
            return - 1;
        }
        //calculates the area of a circle
        double PI = 3.14159;
        double circleArea = radius * radius * PI;
        System.out.println("Circle area is " + circleArea);
        return circleArea;
    }


    public static double area(double x, double y) {
        //checks if both of the variables are bigger than 0
        if(x < 0 || y < 0) {
            return -1;
        }

        //calculates the area of the rectangle
        double rectangleArea = x * y;
        System.out.println("Rectangle area is " + rectangleArea);
        return rectangleArea;
    }
}
