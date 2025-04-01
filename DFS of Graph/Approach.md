# 🚀 Approach for Depth First Search (DFS) of a Graph

## 🔍 Problem Understanding

We are given a **connected, undirected graph** represented as an adjacency list. Our goal is to perform a **Depth First Search (DFS)** traversal starting from node **0** and return the traversal order as a list.

## 🏗️ Approach

### 1. **Understanding DFS**

DFS is a **recursive** or **iterative** traversal technique that explores as far as possible along each branch before backtracking. It follows the **Last-In-First-Out (LIFO)** principle and can be implemented using:

- 🔄 **Recursion** (using the function call stack)
- 📌 **Stack (explicitly)** for an iterative approach

### 2. **Steps to Implement DFS**

1. **🛠️ Initialize Data Structures**

   - ✅ Use a **visited array or set** to keep track of visited nodes.
   - 📋 Use a **result list** to store the traversal order.

2. **📝 Define a Recursive DFS Function**

   - 🔹 Mark the current node as **visited**.
   - ➕ Add it to the **result list**.
   - 🔄 Recursively visit each **unvisited** neighbor in the given adjacency list order.

3. **🚀 Start DFS from Node 0**

   - 🔍 Call the recursive DFS function on node **0**.
   - 🔄 Continue visiting connected nodes until all are visited.

### 3. **⚙️ Implementation Details**

#### **Recursive Approach (Python)**

```python
class Solution:
    def dfs(self, adj):
        V = len(adj)  # Number of vertices
        visited = [False] * V  # Visited array
        result = []  # DFS result list
        
        def dfsUtil(node):
            visited[node] = True
            result.append(node)
            for neighbor in adj[node]:
                if not visited[neighbor]:
                    dfsUtil(neighbor)
        
        dfsUtil(0)  # Start DFS from node 0
        return result
```

#### **Iterative Approach (Python)**

```python
class Solution:
    def dfs(self, adj):
        V = len(adj)
        visited = [False] * V
        result = []
        stack = [0]
        
        while stack:
            node = stack.pop()
            if not visited[node]:
                visited[node] = True
                result.append(node)
                stack.extend(reversed(adj[node]))
        
        return result
```

#### **Recursive Approach (Java)**

```java
import java.util.*;

class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        
        dfsUtil(0, adj, visited, result);
        return result;
    }
    
    private void dfsUtil(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node);
        
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, adj, visited, result);
            }
        }
    }
}
```

### 4. **⏳ Time and Space Complexity Analysis**

- **🕒 Time Complexity:**

  - 🏷️ Each node is visited **once**, and each edge is traversed **once**.
  - ⏳ Total complexity: **O(V + E)**, where `V` is the number of vertices and `E` is the number of edges.

- **💾 Space Complexity:**

  - 🌀 **Recursive DFS:** `O(V)` due to the recursion stack.
  - 📦 **Iterative DFS:** `O(V)` due to the stack and visited array.

### 5. **📌 Example Walkthrough**

#### **📥 Input:**

```plaintext
adj = [[2, 3, 1], [0], [0, 4], [0], [2]]
```

#### **🔄 Steps:**

1. 🎯 Start DFS from `0` → **[0]**
2. ➡️ Visit `2` → **[0, 2]**
3. ➡️ Visit `4` → **[0, 2, 4]**
4. 🔙 Backtrack to `2`, then backtrack to `0`, and visit `3` → **[0, 2, 4, 3]**
5. 🔙 Backtrack to `0`, visit `1` → **[0, 2, 4, 3, 1]**

#### **📤 Output:**

```plaintext
[0, 2, 4, 3, 1]
```

### 6. **🧐 Edge Cases Considered**

- 🟢 **Single-node graph**: Ensure DFS correctly handles graphs with only one node.
- 🚫 **Disconnected graph**: The problem guarantees a connected graph, so we do not need to handle this.
- 📏 **Large graphs**: Ensure DFS runs efficiently for large inputs (`10^4` nodes).

## 🎯 Conclusion

DFS is an efficient algorithm for graph traversal, often used in **pathfinding, cycle detection, and tree-based problems**. The **recursive approach** is more intuitive, while the **iterative approach** avoids stack overflow in deep recursions. 🚀

