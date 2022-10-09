package Practice.intro;

import java.util.List;

public class file2 {

    public final List<String> exclusionList;
    public final List<String> inclusionList;

    public file1(List<String> exclusionList, List<String> inclusionList) {
        this.exclusionList = exclusionList;
        this.inclusionList = inclusionList;
    }

    public String thisIsAMethod() {
        String result = 'HELLO';

        return result;
    }
}
