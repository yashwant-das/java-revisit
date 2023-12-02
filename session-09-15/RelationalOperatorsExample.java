public class RelationalOperatorsExample {
    public static void main(String[] args) {
        // Equality (==)
        int a = 5;
        int b = 7;
        boolean isEqual = (a == b);
        System.out.println("Is a equal to b? " + isEqual); // Outputs: false

        // Inequality (!=)
        int x = 10;
        int y = 10;
        boolean isNotEqual = (x != y);
        System.out.println("Is x not equal to y? " + isNotEqual); // Outputs: false

        // Greater Than (>)
        int m = 15;
        int n = 12;
        boolean isGreaterThan = (m > n);
        System.out.println("Is m greater than n? " + isGreaterThan); // Outputs: true

        // Less Than (<)
        int p = 8;
        int q = 10;
        boolean isLessThan = (p < q);
        System.out.println("Is p less than q? " + isLessThan); // Outputs: true

        // Greater Than or Equal To (>=)
        int r = 20;
        int s = 20;
        boolean isGreaterOrEqual = (r >= s);
        System.out.println("Is r greater than or equal to s? " + isGreaterOrEqual); // Outputs: true

        // Less Than or Equal To (<=)
        int u = 25;
        int v = 30;
        boolean isLessOrEqual = (u <= v);
        System.out.println("Is u less than or equal to v? " + isLessOrEqual); // Outputs: true
    }
}
