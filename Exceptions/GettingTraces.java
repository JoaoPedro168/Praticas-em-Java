package Exceptions;

public class GettingTraces {
    public static void main(String[] args) {
        try {
            System.out.println("The sum is " + sum(new int[] { 12, 23, 45 }));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());

            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (int i = 0; i < traceElements.length; i++) {
                System.out.print("method " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }
    }

    private static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i <= list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
