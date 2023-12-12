import letmecalculate.calculator;

class MainCalc {
    public static void main(String[] args) {
        double a = 9.2, b = 8.8;
        calculator c = new calculator();
        System.out.println(c.add(a, b));
        System.out.println(c.sub(a, b));
        System.out.println(c.mul(a, b));
        System.out.println(c.div(a, b));
    }
}
