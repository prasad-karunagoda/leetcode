package prasad.leetcode.p937;

import java.util.ArrayList;
import java.util.Collections;

public class ReorderDataInLogFiles {

    public String[] reorderLogFiles(String[] logs) {
        ArrayList<Log> list = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            list.add(new Log(logs[i], i));
        }
        Collections.sort(list);

        String[] reordered = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            reordered[i] = list.get(i).getRawString();
        }
        return reordered;
    }

    private static class Log implements Comparable<Log> {

        private static final byte TYPE_LETTER = 0;
        private static final byte TYPE_DIGIT = 1;

        private final byte type;
        private final String id;
        private final String content;
        private final int originalIndex;

        private Log(String rawString, int originalIndex) {
            int firstSpaceIndex = rawString.indexOf(" ");
            id = rawString.substring(0, firstSpaceIndex);
            content = rawString.substring(firstSpaceIndex + 1);
            if (content.charAt(0) < 'a') {
                type = Log.TYPE_DIGIT;
            }
            else {
                type = Log.TYPE_LETTER;
            }
            this.originalIndex = originalIndex;
        }

        private String getRawString() {
            return id + " " + content;
        }

        @Override
        public int compareTo(Log other) {
            if (this.type == TYPE_LETTER) {
                if (other.type == TYPE_LETTER) {
                    int contentComparison = this.content.compareTo(other.content);
                    if (contentComparison != 0) {
                        return contentComparison;
                    }
                    else {
                        return this.id.compareTo(other.id);
                    }
                }
                else {
                    return -1;
                }
            }
            else {
                if (other.type == TYPE_LETTER) {
                    return 1;
                }
                else {
                    return this.originalIndex - other.originalIndex;
                }
            }
        }
    }
}
