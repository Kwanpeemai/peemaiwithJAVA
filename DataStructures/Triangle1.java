package DataStructures;
    class Triangle {
        private double base;
        private double height;
        private String title;
        private boolean equalSide;

        Triangle(){
            base = 1;
            height = 1;
            title = " ";
            equalSide = false;
        }

        Triangle (double base, double height, String title){
            this.base = base;
            this.height = height;
            this.title = title;
        }

        Triangle (double base, double height){
            this.base = base;
            this.height = height;
        }

        Triangle (double side, String title){
            base = side;
            height = side;
            this.title = title;
        }

        Triangle (double side){
            base = side;
            height = side;
        }

        Triangle (String title){
            this.title = title;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public void setBaseHeight(double base, double height){
            this.base = base;
            this.height = height;
        }

        public void setSide(double side){
            base = side;
            height = side;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getBase() {
            return base;
        }

        public double getHeight() {
            return height;
        }

       public double getSide(){
            return base;
        }

        public String getTitle() {
            return title;
        }

        public String toString(){
            return (getTitle() + "[" + getBase() + ":" + getHeight() + "=>" + getArea() + "]");
        }

        public boolean isEquilateral() {
            if (base == height) equalSide = true;
            return equalSide;
        }

        public double getArea(){
            return (base/2)*height;
        }

    }
public class Triangle1 {
    public static void main(String[] args) {
        Triangle TriA = new Triangle();
        TriA.setBaseHeight(4, 6);
        TriA.setTitle("A");

        Triangle TriB = new Triangle(3,5,"B");

        Triangle TriC = new Triangle(TriA.getBase()+TriB.getHeight());

        System.out.println("TriA isEquilateral : " + TriA.isEquilateral());
        System.out.println("TriB isEquilateral : " + TriB.isEquilateral());
        System.out.println("TriC isEquilateral : " + TriC.isEquilateral());

        System.out.println(TriA);
        System.out.println(TriB);
        System.out.println(TriC);
    }
    
}
