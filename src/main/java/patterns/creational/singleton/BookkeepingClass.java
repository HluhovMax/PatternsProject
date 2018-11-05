package patterns.creational.singleton;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class BookkeepingClass {
    private static volatile BookkeepingClass INSTANCE;

    /**
     * Double Checked Lock.
     * @return
     */
    public static BookkeepingClass getINSTANCE() {
        BookkeepingClass localINSTANCE = INSTANCE;
        if (localINSTANCE == null) {
            synchronized (BookkeepingClass.class) {
                localINSTANCE = INSTANCE;
                if (localINSTANCE == null) {
                    INSTANCE = localINSTANCE = new BookkeepingClass();
                }
            }
        }
        return localINSTANCE;
    }

    private BookkeepingClass(){}

    public void makeAccounting() {
        System.out.println("make accounting...");
    }
}
