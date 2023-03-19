package prasad.leetcode.p609;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicateFile {

    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, Set<File>> map = new HashMap<>();
        for (String p : paths) {
            String[] directoryAndFiles = p.split(" ");
            if (directoryAndFiles.length > 1) {
                for (int i = 1; i < directoryAndFiles.length; i++) {
                    int contentStart = directoryAndFiles[i].indexOf('(');
                    int contentEnd = directoryAndFiles[i].indexOf(')');
                    String content = directoryAndFiles[i].substring(contentStart + 1, contentEnd);
                    String filename = directoryAndFiles[i].substring(0, contentStart);

                    if (map.containsKey(content)) {
                        map.get(content).add(new File(directoryAndFiles[0], filename));
                    }
                    else {
                        Set<File> files = new HashSet<>();
                        files.add(new File(directoryAndFiles[0], filename));
                        map.put(content, files);
                    }
                }
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (Set<File> group : map.values()) {
            if (group.size() > 1) {
                List<String> duplicateFiles = new ArrayList<>();
                for (File file : group) {
                    duplicateFiles.add(file.directory + "/" + file.filename);
                }
                result.add(duplicateFiles);
            }
        }
        return result;
    }

    private static class File {
        private final String directory;
        private final String filename;

        private File(String directory, String filename) {
            this.directory = directory;
            this.filename = filename;
        }
    }
}
