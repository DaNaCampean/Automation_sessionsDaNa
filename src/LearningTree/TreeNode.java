package LearningTree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int value;
    List<TreeNode> children;

    // Constructor
    public TreeNode(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
}