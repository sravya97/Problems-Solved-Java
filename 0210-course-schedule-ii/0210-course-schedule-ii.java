class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         int[][] graph = new int[numCourses][numCourses];
        for(int i=0;i<prerequisites.length;i++){
                graph[prerequisites[i][0]][prerequisites[i][1]] = 1;
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] recursive = new boolean[numCourses];
        int[] result = new int[numCourses];
        int curr = 0;
        for(int i=0; i<numCourses;i++){
            curr = isCycle(graph, visited, recursive, i, result, curr);
            if(curr == -1){
                return new int[]{};
            }
        }
        return result;
    }
    
        public int isCycle(int[][] graph, boolean[] visited, boolean[] recursive, int node, int[] result, int curr)         {
        if(recursive[node]){
            return -1;
        } 
        if(visited[node]){
            return curr;
        }
        visited[node] = true;
        recursive[node] = true;
        boolean isDetected = false;
        for(int rows=0;rows<graph[node].length;rows++){
            if(graph[node][rows]==1){
                curr = isCycle(graph, visited, recursive, rows, result, curr);
                if(curr == -1){
                    return -1;
                }
                
            }
            
        }
        result[curr++] = node;
        recursive[node] = false;
        return curr;
        
    }
}