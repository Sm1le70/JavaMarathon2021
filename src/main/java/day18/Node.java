package day18;

public class Node {
    private int value;
    private Node leftSon, rightSon;

    public Node(int value) {
        this.value = value;
    }

    public void addNode(int value, Node node) {
        if (value < node.value) {
            if (node.leftSon == null) {
                node.leftSon = new Node(value);
            } else {
                addNode(value, node.leftSon);
            }
        } else {
            if (node.rightSon == null) {
                node.rightSon = new Node(value);
            } else {
                addNode(value, node.rightSon);
            }
        }
    }

    public static void dfs (Node node) {
        if (node!= null) {
            dfs(node.leftSon);
            System.out.print(node.value + " ");
            dfs(node.rightSon);
        }
    }
}
