package com.jokerchen.pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 用组合模式构建一棵树
 * @author joker
 * @date 2018-09-27 22:47
 */
public class Tree {

    private String code;

    private String name;

    private String parentCode;

    private Integer level;

    private Tree parent;

    private List<Tree> node;

    public Tree(){}

    public Tree(String code,String name,String parentCode,Integer level){
        this.code = code;
        this.name = name;
        this.parentCode = parentCode;
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    /**
     * 将一组无序的树组装成树形结构的数据
     * @param treeList
     * @return
     */
    public static List<Tree> buildTree(List<Tree> treeList){
        if(treeList == null || treeList.size() == 0){
            return null;
        }
        List<Tree> trees = getRootNode(treeList);
        trees.forEach(node->node.setLevel(0));
        List<Tree> parentNodes = trees;
        List<Tree> subNodes;
        int level = 1;
        do{
            treeList.removeAll(parentNodes);
            subNodes = getRootNode(treeList);
            if(subNodes != null && subNodes.size() > 0){
                for(Tree subNode : subNodes){
                    subNode.setLevel(level);
                    for(Tree parentNode : parentNodes){
                        if(codeEquals(parentNode.getCode(),subNode.getParentCode())){
                            List<Tree> list = parentNode.getNode();
                            if(list == null){
                                list = new ArrayList<>();
                                parentNode.setNode(list);
                            }
                            list.add(subNode);
                            subNode.setParent(parentNode);
                        }
                    }
                }
            }
            parentNodes = subNodes;
            level++;
        }while (subNodes != null);
        return trees;
    }

    /**
     * 获取treeList中的顶级节点
     * @param treeList
     * @return
     */
    public static List<Tree> getRootNode(List<Tree> treeList){
        if(treeList == null || treeList.size() == 0){
            return null;
        }
        List<String> codes = treeList.stream().map(tree->tree.getCode()).collect(Collectors.toList());
        List<Tree> trees =
                treeList.stream()
                        .filter(node->!codes.contains(node.getParentCode())
                                || codeEquals(node.getCode(),node.getParentCode())
                        )
                        .collect(Collectors.toList());
        return trees;
    }

    /**
     * 判断两个编码是否相同
     * @param code
     * @param parentCode
     * @return
     */
    public static boolean codeEquals(String code, String parentCode){
        if(code == null){
            if(parentCode == null){
                return true;
            }
        }else{
            if(parentCode != null && code.equals(parentCode)){
                return true;
            }
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Tree getParent() {
        return parent;
    }

    public void setParent(Tree parent) {
        this.parent = parent;
    }

    public List<Tree> getNode() {
        return node;
    }

    public void setNode(List<Tree> node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", level=" + level +
                '}';
    }
}
