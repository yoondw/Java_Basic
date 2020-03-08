class CmpOp {
    public static void main(String[] args) {
        int a = 10, b = 20;

        if (true)
            System.out.println("True");
        else
            System.out.println("False"); // Dead Code

        if (a > b)
            System.out.println("A is bigger");
        else
            System.out.println("B is bigger");

        if (a != b)
            System.out.println("A and B are different");
        else
            System.out.println("A and B are same");
    }
}