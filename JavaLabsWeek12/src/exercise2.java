public class exercise2 {
    public abstract class Shape{
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }

    interface Area{
       double getArea();
    }

    interface Volume{
        double getVolume();
    }

    public class Square extends Shape implements Area {
        double a;
        Square(double a){
            setName("Square");
            this.a = a;
        }
        public double getArea(){
            return a*a;
        }
    }

    public class Circle extends Shape implements Area {
        double r;
        Circle (double r){
            setName("Circle");
            this.r = r;
        }
        public double getArea(){
            return r*r;
        }
    }

    public class Cube extends Shape implements Area,Volume {
        double a;
        Cube (double a){
            setName("Cube");
            this.a = a;
        }
        public double getArea(){
            return a*a*6;
        }

        public double getVolume(){
            return a*a*a;
        }
    }

    public class Sphere extends Shape implements Area,Volume {
        double r;
        double PI = 3.14;
        Sphere (double r){
            setName("Sphere");
            this.r = r;
        }
        public double getArea(){
            return PI*(r*r);
        }
        public double getVolume(){
            return 3/4*PI*(r*r*r);
        }
    }

}
