import java.util.Arrays;

public class ArrayComparator {

    boolean compare(int tab1[], int tab2[]) {
        if (tab1.length == tab2.length) {
            for (int i = 0; i < tab1.length; i++) {
                if (Arrays.equals(tab1, tab2))
                    return true;
            }
        }
        return false;
    }
}
