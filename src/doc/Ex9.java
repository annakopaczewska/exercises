package doc;

public class Ex9 {

    enum Operation {
        ADD, SUB, MUL, DIV, POW;
    }

    public static void main(String[] args) {

        int result = countAddSubMulDiv(5, 3, Operation.ADD);
        int result1 = countAddSubMulDiv(10, 5, Operation.SUB);
        int result2 = countAddSubMulDiv(2, 2, Operation.MUL);
        int result3 = countAddSubMulDiv(6, 3, Operation.DIV);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

    public static int countAddSubMulDiv(int a, int b, Operation operation) {

        int result;
        switch (operation) {
            case ADD:
                result = a + b;
                break;
            case SUB:
                result = a - b;
                break;
            case MUL:
                result = a * b;
                break;
            case DIV:
                result = a / b;
                break;
            default:
                throw new IllegalStateException("Unknown operation: " + operation);
        }
        return result;
    }
}

