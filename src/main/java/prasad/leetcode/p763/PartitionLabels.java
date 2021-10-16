package prasad.leetcode.p763;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        List<Span> spans = new ArrayList<>();
        for (int n = 97; n <= 122; n++) { // 'a' to 'z'
            int start = s.indexOf(n);
            if (start > -1) {
                int end = s.lastIndexOf(n);
                spans.add(new Span(start, end));
            }
        }
        Collections.sort(spans);

        List<Partition> partitions = new ArrayList<>();
        while (true) {
            Span first = spans.get(0);
            Span groupSpan = new Span(first.start, first.end);
            List<Span> group = new ArrayList<>();
            group.add(first);
            for (int i = 1; i < spans.size(); i++) {
                if (groupSpan.isOverlapping(spans.get(i))) {
                    group.add(spans.get(i));
                    groupSpan = new Span(Math.min(groupSpan.start, spans.get(i).start),
                            Math.max(groupSpan.end, spans.get(i).end));
                }
            }
            spans.removeAll(group);
            partitions.add(new Partition(group, s.length() - 1));
            if (spans.isEmpty()) {
                break;
            }
        }
        Collections.sort(partitions);
        return partitions.stream().map(p -> p.to - p.from + 1).collect(Collectors.toList());
    }

    private class Span implements Comparable<Span> {
        private final int start;
        private final int end;

        private Span(int start, int end) {
            this.start = start;
            this.end = end;
        }

        private boolean isOverlapping(Span otherSpan) {
            return this.end > otherSpan.start && otherSpan.end > this.start;
        }

        @Override
        public int compareTo(Span otherSpan) {
            int thisSpanLength = this.end - this.start;
            int otherSpanLength = otherSpan.end - otherSpan.start;
            return otherSpanLength - thisSpanLength; // Descending order
        }
    }

    private class Partition implements Comparable<Partition> {
        private int from;
        private int to;

        private Partition(List<Span> group, int maxIndex) {
            from = maxIndex;
            to = 0;
            for (Span span : group) {
                if (span.start < from) {
                    from = span.start;
                }
                if (span.end > to) {
                    to = span.end;
                }
            }
        }

        @Override
        public int compareTo(Partition otherPartition) {
            return this.from - otherPartition.from;
        }
    }
}
