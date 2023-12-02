class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class Oops {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int result = calc.add(5, 7);
        System.out.println(result);

    }
}
