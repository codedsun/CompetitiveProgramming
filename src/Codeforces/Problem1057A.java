//package Codeforces;
//
//import java.util.Scanner;
//
///**
// * Bmail Computer Network
// * https://codeforces.com/problemset/problem/1057/A
// *
// * @author codedsun
// */
// Approach -1 Through Trees
//public class Problem1057A {
//    static class Node {
//        int element;
//        Node parent;
//
//        public Node(int element) {
//            this.element = element;
//            this.parent = null;
//        }
//
//        public int getElement() {
//            return element;
//        }
//
//        public void setElement(int element) {
//            this.element = element;
//        }
//
//        public Node getParent() {
//            return parent;
//        }
//
//        public void setParent(Node parent) {
//            this.parent = parent;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] routersPosition = new int[n];
//        Node[] nodes = new Node[n];
//        Node root = new Node(1);
//        nodes[0] = root;
//        String path = ""+root.element;
//        Node temp;
//        for (int i = 1; i < n; i++) {
//            routersPosition[i] = sc.nextInt();
//            nodes[i] = new Node(i+1);
//            (nodes[i]).parent = nodes[routersPosition[i]-1];
//        }
//
//        temp = nodes[n-1];
//        int a[] = new int[n];
//        int i=0;
//        while(temp!= null){
//            a[i] = temp.element;
//            temp= temp.parent;
//            i++;
//        }
//        for(int k=i-1; k>=0;k--){
//            if(k==0){
//                System.out.print(a[k]);
//            }else {
//                System.out.print(a[k] + " ");
//            }
//        }
//    }
//}

package Codeforces;

import java.util.Scanner;

/**
 * Bmail Computer Network
 * https://codeforces.com/problemset/problem/1057/A
 *
 * @author codedsun
 */
public class Problem1057A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nodesIndex[] = new int[n];
        nodesIndex[0] = -1;
        for(int i=1; i<n; i++){
            nodesIndex[i] = sc.nextInt();
        }

        int a[] = new int[n];
        int i=0;
        for(int j=n-1; j>=0; j--) {
            a[i]= j+1;
            i++;
            j = nodesIndex[j];
        }

        for(int k=i-1; k>=0; k--) {
            if(k==0){
                System.out.print(a[k]);
            }else {
                System.out.print(a[k] + " ");
            }
        }
    }
}