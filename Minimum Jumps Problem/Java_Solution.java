class Java_Solution {
    static int minJumps(int[] arr) {
        // base condition
        if (arr.length <= 1) return -1;
        if (arr[0] == 0) return -1;
        int jumps=0, maxReach=0, currentEnd=0;
        
        for(int i=0;i<arr.length-1;i++){
            maxReach = Math.max(maxReach, (i+arr[i]));
            if(i==currentEnd){
                jumps++;
                currentEnd = maxReach;
                if(currentEnd >= arr.length-1){
                    return jumps;
                }
            }
        }
        return -1;
    }
}
