package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem913B {

    static class Node {
        int n;
        List<Node> node = new ArrayList<>();
        int children = 0;

        Node(int n) {
            this.n = n;
        }

        public int getChildren() {
            return children;
        }

        public void setChildren(int children) {
            this.children = children;
        }

        public boolean isLeafNode() {
            return node.size() == 0;
        }


        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }

        public List<Node> getNode() {
            return node;
        }

        public void setNode(List<Node> node) {
            this.node = node;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int parents[] = new int[n];
        Node root = new Node(1);
        Node nodes[] = new Node[n];
        nodes[0] = root;
        Node parent, temp;
        for(int i=1; i<n; i++) {
            parents[i] = sc.nextInt();
            temp = new Node(i+1);
            nodes[i] = temp;
            if(nodes[parents[i]-1]==null) {
                nodes[parents[i]-1] = new Node(parents[i]);
            }
            parent = nodes[parents[i]-1];
            parent.setChildren(parent.getChildren()+1);
        }


    }
}
