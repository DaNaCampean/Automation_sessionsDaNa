package LearningTree;
import java.util.Arrays;
import java.util.List;
public class LearningTree {



        public static void main(String[] args) {
            List<String> lines = Arrays.asList(
                    "3",
                    "-2",
                    "--19",
                    "--13",
                    "--2",
                    "-5",
                    "--4",
                    "--5",
                    "--8",
                    "---3",
                    "-8",
                    "-12",
                    "-14",
                    "-1"
            );

            TreeBuilder treeBuilder = new TreeBuilder();
            TreeNode root = treeBuilder.buildTree(lines);

            // Print the tree to the console
            treeBuilder.printTree(root, "");
        }
    }

