package prasad.leetcode.p1678;

public class GoalParserInterpretation {

    public String interpret(String command) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index < command.length()) {
            if (command.charAt(index) == 'G') {
                sb.append("G");
                index++;
            }
            else if (command.startsWith("()", index)) {
                sb.append("o");
                index += 2;
            }
            else if (command.startsWith("(al)", index)) {
                sb.append("al");
                index += 4;
            }
            else {
                throw new IllegalArgumentException("Invalid argument: " + command);
            }
        }
        return sb.toString();
    }
}
