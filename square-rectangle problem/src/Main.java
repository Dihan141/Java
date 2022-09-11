public class Main {
    public static void main(String[] args) {
        Recatangle recatangle = new Recatangle(5, 4);
        Square square = new Square(7);

        System.out.println(Calc.CalculateArea(recatangle));
        System.out.println(Calc.CalculateArea(square));
    }
}