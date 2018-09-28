package com.jokerchen.pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joker
 * @date 2018-09-28 22:20
 */
public class TreeTest {

    public static void main(String[] args) {
        Tree tree0 = new Tree(null,"根节点",null,null);
        Tree tree1 = new Tree("1","根节点",null,null);
        Tree tree2 = new Tree("2","根节点",null,null);
        Tree tree3 = new Tree("3","根节点","2",null);
        Tree tree4 = new Tree("4","根节点","2",null);
        Tree tree5 = new Tree("5","根节点","0",null);
        Tree tree6 = new Tree("6","根节点","0",null);
        Tree tree7 = new Tree("7","根节点","6",null);
        Tree tree8 = new Tree("8","根节点","7",null);
        Tree tree9 = new Tree("9","根节点","5",null);
        Tree tree10 = new Tree("10","根节点","5",null);

        List<Tree> treeList = new ArrayList<>();
        treeList.add(tree0);
        treeList.add(tree1);
        treeList.add(tree2);
        treeList.add(tree3);
        treeList.add(tree4);
        treeList.add(tree5);
        treeList.add(tree6);
        treeList.add(tree7);
        treeList.add(tree8);
        treeList.add(tree9);
        treeList.add(tree10);

        List<Tree> trees = Tree.buildTree(treeList);
        printTree(trees);
    }

    private static void printTree(List<Tree> trees){
        for(Tree tree : trees){
            String prefix = "----";
            for(int i=0;i<tree.getLevel();i++){
                prefix += "----";
            }
            System.out.println(prefix+tree);
            if(tree.getNode() != null && tree.getNode().size() > 0){
                printTree(tree.getNode());
            }
        }
    }
}
