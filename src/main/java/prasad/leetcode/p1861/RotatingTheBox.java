package prasad.leetcode.p1861;

public class RotatingTheBox {

    public char[][] rotateTheBox(char[][] box) {
        for (char[] row : box) {
            int sectionStartIndex = -1;
            int stoneCount = 0;
            int emptySpaceCount = 0;
            for (int i = 0; i < row.length; i++) {
                char cell = row[i];
                if (cell == '#') {
                    if (sectionStartIndex == -1) {
                        sectionStartIndex = i;
                    }
                    stoneCount++;
                }
                else if (cell == '.') {
                    if (sectionStartIndex == -1) {
                        sectionStartIndex = i;
                    }
                    emptySpaceCount++;
                }
                else {
                    if (sectionStartIndex > -1) {
                        for (int j = sectionStartIndex; j < sectionStartIndex + emptySpaceCount; j++) {
                            row[j] = '.';
                        }
                        for (int j = sectionStartIndex + emptySpaceCount; j < sectionStartIndex + emptySpaceCount + stoneCount; j++) {
                            row[j] = '#';
                        }
                        sectionStartIndex = -1;
                        stoneCount = 0;
                        emptySpaceCount = 0;
                    }
                }
            }

            // Last section
            if (sectionStartIndex > -1) {
                for (int j = sectionStartIndex; j < sectionStartIndex + emptySpaceCount; j++) {
                    row[j] = '.';
                }
                for (int j = sectionStartIndex + emptySpaceCount; j < sectionStartIndex + emptySpaceCount + stoneCount; j++) {
                    row[j] = '#';
                }
            }
        }

        return rotateRight(box);
    }

    char[][] rotateRight(char[][] original) {
        char[][] rotated = new char[original[0].length][original.length];
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                rotated[j][original.length - i - 1] = original[i][j];
            }
        }
        return rotated;
    }
}
