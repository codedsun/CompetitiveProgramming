import java.util.*;

/**
 * @author : codedsun
 * Created on 28/12/18
 */
//
// PROBLEM 115A
//public class Suneet {
//    static class Node {
//        private int n;
//        private Node parent;
//        private List<Node> children = new ArrayList<>();
//
//        public Node(int n) {
//            this.n = n;
//        }
//
//        public int getN() {
//            return n;
//        }
//
//        public void setN(int n) {
//            this.n = n;
//        }
//
//        public Node getParent() {
//            return parent;
//        }
//
//        public void setParent(Node parent) {
//            this.parent = parent;
//        }
//
//        public List<Node> getChildren() {
//            return children;
//        }
//
//        public void setChildren(List<Node> children) {
//            this.children = children;
//        }
//    }
//    public static void main(String[] args) {
//        Node root = new Node(-1);
//        Map<Integer, Node> listOfNodes = new HashMap<>();
//        listOfNodes.put(-1, root);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for (int j = 0; j < n; j++) {
//            if (listOfNodes.containsKey(a[j])) {
//                Node children = listOfNodes.getOrDefault(j+1,new Node(j + 1));
//                listOfNodes.getOrDefault(a[j], null).getChildren().add(children);
//                listOfNodes.put(j + 1, children);
//            } else {
//                Node parent = new Node(a[j]);
//                Node children = listOfNodes.getOrDefault(j+1,new Node(j + 1));
//                parent.getChildren().add(children);
//                listOfNodes.put(j + 1, children);
//                listOfNodes.put(a[j], parent);
//            }
//        }
//        System.out.println(maxDepth(root));
//
//    }
//
//    private static int maxDepth(Node parent) {
//        if (parent == null || parent.getChildren().isEmpty()|| parent.getChildren().size() == 0) {
//            return 0;
//        } else {
//            int maxDepth = 0;
//            for(Node it: parent.getChildren()){
//                maxDepth = Math.max(maxDepth, maxDepth(it));
//            }
//            return maxDepth+1;
//        }
//    }
//}


//public class Suneet {
//
//    public static class Graph{
//        int vertices;
//        LinkedList<Integer> adjList[];
//
//        public Graph(int vertices) {
//            this.vertices = vertices;
//            adjList = new LinkedList[vertices];
//            for(int i =0; i<vertices; i++){
//                adjList[i] = new LinkedList<>();
//            }
//        }
//
//        void addEdge(int v, int w) {
//            adjList[v].add(w);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        Graph graph = new Graph(n);
//        int cats[] = new int[n];
//        for(int i=0; i<n; i++) {
//            cats[i] = sc.nextInt();
//        }
//        for(int j=0;j<n-1;j++) {
//            graph.addEdge(sc.nextInt(), sc.nextInt());
//        }
//
////        printGraph(graph);
//
//        DFS(graph.vertices, graph);
//    }
//
//    static void DFS(int v, Graph graph)
//    {
//        // Mark all the vertices as not visited(set as
//        // false by default in java)
//        boolean visited[] = new boolean[v];
//
//        // Call the recursive helper function to print DFS traversal
//        DFSUtil(v-1, visited, graph);
//    }
//    private static void printGraph(Graph graph)
//    {
//        for(int v = 0; v < graph.vertices; v++)
//        {
//            System.out.println("Adjacency list of vertex "+ v);
//            System.out.print("head");
//            for(Integer pCrawl: graph.adjList[v]){
//                System.out.print(" -> "+pCrawl);
//            }
//            System.out.println("\n");
//        }
//    }
//
//    private static void DFSUtil(int v,boolean visited[], Graph graph)
//    {
//        // Mark the current node as visited and print it
//        visited[v] = true;
//        System.out.print(v+" ");
//
//        // Recur for all the vertices adjacent to this vertex
//        Iterator<Integer> i = graph.adjList[v].listIterator();
//        while (i.hasNext())
//        {
//            int n = i.next();
//            if (!visited[n])
//                DFSUtil(n, visited, graph);
//        }
//    }
//}

public class Suneet {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String s = sc.nextLine();
//        long na = (long) Math.pow(1,2);
//        Math.log()
//        StringBuilder ss = new StringBuilder(s);
//        System.out.println(ss.reverse().toString());
    }
}