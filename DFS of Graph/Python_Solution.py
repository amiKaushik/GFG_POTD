class Python_Solution:
    def dfs(self, adj):
        visited = set()
        result = []
        def dfs_util(node):
            if node in visited:
                return
            visited.add(node)
            result.append(node)
            for neighbour in adj[node]:
                dfs_util(neighbour)   
        dfs_util(0)
        return result
