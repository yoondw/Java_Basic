class ForWhile {
    public static void main(String[] args) {
        int num = 0;

        while (num < 5) {
            System.out.println("I like Java " + num + " times.");
            num++;
        }

        System.out.println("--------------------------------------");

        num = 0;
        do {
            System.out.println("I like Java " + num + " times.");
            num++;
        } while (num < 5);
    }
}