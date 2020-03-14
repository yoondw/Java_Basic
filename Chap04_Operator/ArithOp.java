package Chap04_Operator;

class ArithOp {
    public static void main(final String[] args) {
        int n1 = 7;
        int n2 = 3;

        int result = n1 + n2;
        System.out.println("add : " + result);

        result = n1 - n2;
        System.out.println("subtract : " + result);
        System.out.println("mul : " + n1 * n2);
        System.out.println("div : " + n1 / n2);
        System.out.println("mod : " + n1 % n2);

        System.out.println("int div : " + 7 / 3);
        System.out.println("float div : " + 7.0f / 3.0f);
        System.out.println("type casting div : " + (float) 7 / 3);
    }
}