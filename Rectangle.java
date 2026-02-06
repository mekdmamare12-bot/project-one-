import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //calculate the area of a rectangle.
        double  width=0;
        double height=0;
        double area;
        Scanner rectangle = new Scanner (System.in);
        System.out.print("Enter the width : ");
        width=rectangle.nextDouble();


        System.out.print("Enter the height : ");
        height=rectangle.nextDouble();

        area = width * height ;
        System.out.println("The area of the rectangle is : " + area );

    }

}