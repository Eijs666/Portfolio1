public abstract class Shapes {


    static class Triangle extends Shapes {

        //Interne repræsentationer
        double side1;
        double side2;
        double side3;
        double base;
        double height;

        public Triangle(double side1, double side2, double side3, double base, double height) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.base = base;
            this.height = height;
        }

        public void GetSide1(double side1) {
            this.side1 = side1;
        }

        public void GetSide2(double side2) {
            this.side2 = side2;
        }

        public void GetSide3(double side3) {
            this.side3 = side3;
        }

        public void GetBase(double side3) {
            this.base = base;
        }

        public void GetHeight(double side3) {
            this.height = height;
        }

        //Find omkredsen af trekanten
        public double GetCircumferenceT() {
            return side1 + side2 + side3;
        }

        //Find arealet af trekanten
        public double GetAreaOfTriangle() {
            double a = (base * height) / 2;
            return a;
        }

        //Find midtpunktet af trekanten

    }

    static class Rectangle extends Shapes {

        double side1;
        double side2;
        double side3;
        double side4;

        public Rectangle(double side1, double side2, double side3, double side4) {

            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.side4 = side4;
        }

        public void GetSide1(double side1) {
            this.side1 = side1;
        }

        public void GetSide2(double side2) {
            this.side2 = side2;
        }

        public void GetSide3(double side3) {
            this.side3 = side3;
        }

        public void GetSide4(double side4) {
            this.side4 = side4;
        }

        // Find omkredsen af firkanten
        public double GetCircumferenceR() {
            return side1 + side2 + side3 + side4;
        }

        //Find arealet af firkanten
        public double GetAreaOfRectangle() {
            double a = (side1 * side2);
            return a;
        }

    }

    static class Circle extends Shapes {

        //Cirkelens kendetegn
        double radius;

        double pi = 3.14;

        public Circle(double radius) {
            this.radius = radius;
        }

        public void GetRadius(double radius) {
            this.radius = radius;
        }

        // Find omkredsen af cirkelen
        public double GetCircumferenceC() {
            return 2 * radius * pi;
        }

        //Find arealet af firkanten
        public double GetAreaOfCircle() {
            double a = pi * (radius * 2);
            return a;
        }

    }
}