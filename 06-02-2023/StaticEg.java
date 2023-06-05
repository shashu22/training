public class StaticEg {
    static int integer;

    public static int method(int instance) {
        return instance;
    }

    static {
        integer = method(22);
    }
}