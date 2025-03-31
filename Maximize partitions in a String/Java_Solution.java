class Java_Solution {
    public int maxPartitions(String s) {
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }
        int partitions = 0,maxReach = 0,lastCut = -1;
        for (int i = 0; i < s.length(); i++) {
            maxReach = Math.max(maxReach, lastIndex.get(s.charAt(i)));
            if (i == maxReach) {
                partitions++;
                lastCut = i;
            }
        }
        return partitions;
    }
}
