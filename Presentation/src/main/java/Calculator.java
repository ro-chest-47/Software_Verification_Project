public class Calculator {

    public static void main(String argv[]) {

        int a = 10, b = 20;
        int result_1, result_2, result_3, result_4;
        Calcul cal = new Calcul();

        result_1 = cal.add(a, b);
        result_2 = cal.sub(a, b);
        result_3 = cal.mul(a, b);
        result_4 = cal.div(a, b);

        System.out.println(result_1 + result_2 + result_3 + result_4);

    }
}

class Calcul {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

