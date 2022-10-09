package Practice.intro;

import java.util.List;

public class file1 {

    public final List<String> exclusionList;
    public final List<String> inclusionList;

    public file1(List<String> exclusionList,
        List<String> inclusionList) {
            this.exclusionList = exclusionList  ;
                   this.inclusionList = inclusionList;
        }

    // Saving
    private Ryan() {
        // We don't need this method
    }

    public String thisIsAnIncorrectMethod() {
        String result = "hello";

        // we don't need this
        // comment block

        return result;
    }
}
