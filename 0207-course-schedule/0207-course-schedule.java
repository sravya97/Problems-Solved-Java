class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] graph = new int[numCourses][numCourses];
        for(int i=0;i<prerequisites.length;i++){
                graph[prerequisites[i][0]][prerequisites[i][1]] = 1;
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] recursive = new boolean[numCourses];
        boolean result = false;
        for(int i=0; i<numCourses;i++){
            result = isCycle(graph, visited, recursive, i);
            if(result){
                return false;
            }
        }
        return true;
    }
    public boolean isCycle(int[][] graph, boolean[] visited, boolean[] recursive, int node){
        if(recursive[node]){
            return true;
        } 
        if(visited[node]){
            return false;
        }
        visited[node] = true;
        recursive[node] = true;
        boolean isDetected = false;
        for(int rows=0;rows<graph[node].length;rows++){
            if(graph[node][rows]==1){
                isDetected = isCycle(graph, visited, recursive, rows);
                if(isDetected){
                    return true;
                }
            }
            
        }
        recursive[node] = false;
        return false;
        
    }
}