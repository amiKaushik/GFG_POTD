class Python_Solution:
    def maxPartitions(self , s):
        last_index = {c: i for i, c in enumerate(s)}
        partitions,max_reach = 0,0
        last_cut = -1
        for i, c in enumerate(s):
            max_reach = max(max_reach, last_index[c])
            if i == max_reach:
                partitions += 1
                last_cut = i
        return partitions
