package example111;

public class Main {
    public static void main(String[] args) {
        String varFour = " this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();
        System.out.println("**********************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
