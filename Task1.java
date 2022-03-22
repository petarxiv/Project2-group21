package Project2;

interface Task1 {
    /*
    Task1:
Create an Interface 'Shape' with undefined methods
as calculateArea and calculatePerimiter. Create 2
classes Circle & Square that implements functionality
defined in the Shape Interface. Test your code.
     */
    void calculateArea();
    void calculatePerimiter();
    class Circle implements Task1 {
        @Override
        public void calculateArea() {
            System.out.println("");
        }
        public void calculatePerimiter() {
            System.out.println("");
        }
    }
            class Square implements Task1 {
                @Override
                public void calculateArea() {
                    System.out.println("");
                }
                public void calculatePerimiter() {
                    System.out.println("");
        }
    }
}
