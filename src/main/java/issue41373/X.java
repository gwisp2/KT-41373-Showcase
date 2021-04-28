package issue41373;

public class X {
    public static Runnable x() {
        // We use lambda here but the same error persists if using anonymous class
        return () -> System.out.println("Hello");
    }
}
