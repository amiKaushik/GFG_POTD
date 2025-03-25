class Python_Solution:
    def countWays(self, s):
        # code here
        n = len(s)
        T = [[0] * n for _ in range(n)]
        F = [[0] * n for _ in range(n)]

        for i in range(0, n, 2):  
            T[i][i] = int(s[i] == 'T')
            F[i][i] = int(s[i] == 'F')
            
        for l in range(2, n, 2):  
            for i in range(0, n - l, 2):
                j = i + l  
                for k in range(i + 1, j, 2):
                    lt, lf = T[i][k - 1], F[i][k - 1]
                    rt, rf = T[k + 1][j], F[k + 1][j]
                    
                    if s[k] == '&':  
                        T[i][j] += lt * rt
                        F[i][j] += lt * rf + lf * rt + lf * rf
                    elif s[k] == '|':  
                        T[i][j] += lt * rt + lt * rf + lf * rt
                        F[i][j] += lf * rf
                    elif s[k] == '^':  
                        T[i][j] += lt * rf + lf * rt
                        F[i][j] += lt * rt + lf * rf
                        
        return T[0][n - 1]
