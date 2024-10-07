package com.sagar.epam.gs;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchTree {

    static class BST {

        private static class Node {
            int val;
            Node left;
            Node right;

            public Node(int val) {
                this.val = val;
                this.left=null;
                this.right=null;

            }
        }

        private Node root;

        public BST() {
            this.root = null;
        }

        public void put(int value) {
                root=put(root,value);
        }
        private Node put(Node root,int value){
            if(root==null) return new Node(value);

            if(root.val>value){
                root.left=put(root.left,value);
            }else {
                root.right=put(root.right,value);
            }
            return root;
        }

        public boolean contains(int value) {

            return contains(root,value);
        }

        private boolean contains(Node node,int value){
            if(node==null) return false;
            if(value==node.val) return true;
            if(value<node.val) return contains(node.left,value);
            else return contains(node.right,value);

        }

        public List<Integer> inOrderTraversal() {
            final ArrayList<Integer> acc = new ArrayList<>();
            inOrderTraversal(root, acc);
            return acc;
        }

        private void inOrderTraversal(Node node, List<Integer> acc) {
            if (node == null) {
                return;
            }
            inOrderTraversal(node.left, acc);
            acc.add(node.val);
            inOrderTraversal(node.right, acc);

        }


    }







    // TODO: write some more tests
    public static void main(String[] args) {

        final BST searchTree = new BST();
        searchTree.put(3);
        searchTree.put(1);
        searchTree.put(2);
        searchTree.put(5);
        System.out.println(  searchTree.contains(0));
        System.out.println(  searchTree.contains(1));
        System.out.println(  searchTree.contains(5));
        System.out.println(  searchTree.contains(6));
        System.out.println( searchTree.inOrderTraversal());


    }
}
