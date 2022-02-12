package valoresdelasvariables;


public class ValoresDeLasVariables{
    public static void main(String[] args) {
        int a,b;

        a=3;

        System.out.println(String.format("a = %d", a));

        b = a+5;

        System.out.println(String.format("a = %d y b = %d", a,b));

        a=7;

        System.out.println(String.format("a = %d y b = %d", a,b));


    }

}