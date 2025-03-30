class Java_Solution{
    public int startStation(int[] gas, int[] cost) {
        int start =0,curr_gas =0,total_gas =0;
        for(int i=0;i<gas.length;i++){
            total_gas += gas[i]-cost[i];
            curr_gas += gas[i]-cost[i];
            
            if(curr_gas < 0){
                start = i+1;
                curr_gas =0;
            }
        }
        return total_gas >= 0 ? start : -1;
    }
}
