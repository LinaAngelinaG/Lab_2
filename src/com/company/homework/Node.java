package com.company.homework;
import java.util.Objects;
import java.lang.Comparable;

public class Node{
        Node left;
        Node right;
        private String value;

        Node(){
            left = right = null;
            value = null;
        }

        Node(String val){
            this.value = val;
            left = null;
            right = null;
        }

        public int maxdepth(){
            Integer depth;
            if(this.value != null)
                depth = 1;
            else return 0;

            Integer l_depth = 0, r_depth = 0;

            if(this.left != null){
                l_depth = depth + this.left.maxdepth();
            }
            if(this.right != null){
                r_depth = depth + this.right.maxdepth();
            }
            return Math.max(depth, Math.max(r_depth, l_depth));
        }

        public int add(String val){
            Node toadd = new Node(val);
            if(this.value == null) {
                this.value = val;
                return 0;
            }

            Integer i = this.value.compareTo(val);
            if(i>0){
                if(this.right != null)
                    this.right.add(val);
                else
                    this.right = toadd;
            }
            else if(i < 0){
                if(this.left != null)
                    this.left.add(val);
                else
                    this.left = toadd;
            }
            else{
                Node newnode = this;
                while(newnode.left == newnode.right &&  newnode.right != null){
                    newnode = newnode.left;
                }
                toadd.left = newnode.left;
                toadd.right = newnode.right;
                newnode.left = toadd;
                newnode.right = toadd;
            }
            return 0;
        }
}


