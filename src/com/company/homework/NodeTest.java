package com.company.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void maxdepth() {
        Node root1 = new Node();
        root1.add("4");
        root1.add("8");
        root1.add("91");
        root1.add("90");
        root1.add("3");

        Node root2= new Node();
        root2.add("aaa");
        root2.add("bbbb");
        root2.add("cccc");
        root2.add("dd");
        root2.add("eeee");

        Node root3= new Node();
        root3.add("ddd");
        root3.add("ccc");
        root3.add("aa");
        root3.add("ecd");
        root3.add("fc");

        assertEquals(4, root1.maxdepth());
        assertEquals(5, root2.maxdepth());
        assertEquals(3, root3.maxdepth());
    }
}