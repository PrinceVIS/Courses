package encapsulation;

public class Main {

    public static void main(String[] args) {
        First f = new Second();
        f.addFive();
        System.out.println(f.value);
        /*
         sout second 3 cause via inheritance we use child's methods
         BUT also we use fields of created class (First)
         Encapsulation helps to avoid this problem!
         */
    }
}
