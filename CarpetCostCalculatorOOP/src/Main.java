public class Main {
    public static void main(String[] args) {
        Floor one=new Floor(2,5);
        System.out.println("width is "+one.getWidth() +"\nlength is "+ one.getLength());
        Carpet car=new Carpet(8);
        System.out.println("price is : "+ car.getCost());
        Calculator calc=new Calculator(one,car);
        System.out.println("The Total Price is " + calc.getTotalCost());
    }
}