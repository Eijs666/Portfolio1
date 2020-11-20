import java.awt.*;
import java.util.Scanner;

  public class Main{

    public static void main(String[] args) {

        double defaultValue = 0;

        //Instantiere scanner
        Scanner scan = new Scanner(System.in); // vi instiantiere vores scanner, så vi kan få input fra brugeren

        Shapes.Triangle triangle = new Shapes.Triangle(defaultValue,defaultValue,defaultValue,defaultValue,defaultValue);
        Shapes.Rectangle rectangle = new Shapes.Rectangle(defaultValue, defaultValue, defaultValue, defaultValue);
        Shapes.Circle circle = new Shapes.Circle(defaultValue);

        System.out.println("chose a shape");
        System.out.println("----------------------------------------");

        System.out.println("1. Trekant");
        System.out.println("2. Rektangel");
        System.out.println("3. Cirkel");

        int choice = scan.nextInt();

        if(choice == 1){
            System.out.println("angiv en side1");
            double side1_ = scan.nextDouble();
            triangle.side1 = side1_;

            System.out.println("angiv en side2");
            double side2_ = scan.nextDouble();
            triangle.side2 = side2_;

            System.out.println("angiv en side3");
            double side3_ = scan.nextDouble();
            triangle.side1 = side3_;

            System.out.println("angiv en grundlinje");
            double base_ = scan.nextDouble();
            triangle.base = base_;

            System.out.println("angiv en højde");
            double height_ = scan.nextDouble();
            triangle.height = height_;

            System.out.println("Hvad vil du fine på trekanten?");
            System.out.println("----------------------------------------");

            System.out.println("1. Arealet af trekanten");
            System.out.println("2. Omkredsen af trekanten");

            int choiceT = scan.nextInt();

            if(choiceT == 1){
                System.out.println(triangle.GetAreaOfTriangle());
            }
            if(choiceT == 2){
                System.out.println(triangle.GetCircumferenceT());
            }
        }

        if(choice == 2){
            System.out.println("angiv en side1");
            double side1_ = scan.nextDouble();
            rectangle.side1 = side1_;

            System.out.println("angiv en side2");
            double side2_ = scan.nextDouble();
            rectangle.side2 = side2_;

            System.out.println("angiv en side3");
            double side3_ = scan.nextDouble();
            rectangle.side1 = side3_;

            System.out.println("angiv en side4");
            double side4_ = scan.nextDouble();
            rectangle.side1 = side4_;


            System.out.println("Hvad vil du fine på rektanglen?");
            System.out.println("----------------------------------------");

            System.out.println("1. Arealet af rektanglen");
            System.out.println("2. Omkredsen af rektanglen");

            int choiceR = scan.nextInt();

            if(choiceR == 1){
                System.out.println(rectangle.GetAreaOfRectangle());
            }
            if(choiceR == 2){
                System.out.println(rectangle.GetCircumferenceR());
            }
        }

        if(choice == 3){
            System.out.println("angiv en radius til din cirkel");
            double radius_ = scan.nextDouble();
            circle.radius = radius_;

            System.out.println("Hvad vil du fine på cirkelen?");
            System.out.println("----------------------------------------");

            System.out.println("1. Arealet af cirkelen");
            System.out.println("2. Omkredsen af cirkelen");

            int ChoiceC = scan.nextInt();

            if(ChoiceC == 1){
                System.out.println(circle.GetAreaOfCircle());
            }
            if(ChoiceC == 2){
                System.out.println(rectangle.GetCircumferenceR());
            }
        }

    }
}
