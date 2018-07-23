import java.util.Arrays;

public class ArrayComparator {

    boolean compare(int tab1[], int tab2[]) {
        if (tab1.length == tab2.length) {
            if (Arrays.equals(tab1, tab2))
                return true;
        }
        return false;
    }
}
