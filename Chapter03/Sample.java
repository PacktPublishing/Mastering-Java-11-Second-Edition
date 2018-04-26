public class Sample {
    private static volatile Sample myVolatileVariable; // a volatile instance variable

    // getter method
    public static Sample getVariable() {
        if (myVolatileVariable != null) {
            return myVolatileVariable;
        }

        // this section executes if myVolatileVariable == null
        synchronized (Sample.class) {
            if (myVolatileVariable == null) {
                myVolatileVariable = new Sample();
            }
        }
        return null;
    }
}
