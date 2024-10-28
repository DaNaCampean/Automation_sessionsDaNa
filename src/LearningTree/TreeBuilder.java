package LearningTree;

import java.util.ArrayList;
import java.util.List;

public class TreeBuilder {
    public TreeNode buildTree(List<String> lines) {
        TreeNode root = null;
        List<TreeNode> currentLevel = new ArrayList<>();

        for (String line : lines) {
            int depth = countLeadingDashes(line);
            int value = Integer.parseInt(line.substring(depth));

            TreeNode newNode = new TreeNode(value);

            if (depth == 0) {
                root = newNode; // If it's the root
            } else {
                // Add this new node to the list of children of the previous level's node
                currentLevel.get(depth - 1).children.add(newNode);
            }

            // Extend the current level's nodes
            if (depth >= currentLevel.size()) {
                currentLevel.add(newNode);
            } else {
                currentLevel.set(depth, newNode);
            }
        }

        return root;
    }

    private int countLeadingDashes(String line) {
        int count = 0;
        while (count < line.length() && line.charAt(count) == '-') {
            count++;
        }
        return count;
    }

    public void printTree(TreeNode node, String prefix) {
        if (node != null) {
            System.out.println(prefix + node.value);
            for (TreeNode child : node.children) {
                printTree(child, prefix + "--");
            }
        }
    }
}