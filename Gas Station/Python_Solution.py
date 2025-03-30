class Python_Solution:
    def startStation(self, gas, cost):
        total_gas, curr_gas =0,0
        start = 0
        for i in range(len(gas)):
            total_gas += gas[i] - cost[i]
            curr_gas += gas[i] - cost[i]
            if curr_gas < 0:
                start = i+1
                curr_gas = 0
        return start if total_gas >= 0 else -1
