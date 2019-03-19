package getCallerClassAndMethod;

public class GetCallerClass {

    public static void main(String[] args) {

    }

    public static String getCallerClassAndMethodName() {
        try {
            StackTraceElement element = new Throwable().getStackTrace()[2];
            return element.getClassName() + "#" + element.getMethodName();
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }
}