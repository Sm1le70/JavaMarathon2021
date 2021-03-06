package day18;

import static day18.Node.dfs;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};

        for (int i : numbers) {
            root.addNode(i, root);
        }
        dfs(root);
    }
}