package com.deetree.leetcode.editor.en;

import java.util.*;

class LRUSolution {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.put(1, 3);
        cache.put(2, 3);
        cache.put(3, 3);
        cache.put(4, 3);

        System.out.println(cache.get(2));

    }
}

class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    Node head;
    Node tail;
    HashMap<Integer, Node> map = null;
    int cap = 0;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if (map.get(key) == null) {
            return -1;
        }

        //move to tail
        Node t = map.get(key);

        removeNode(t);
        offerNode(t);

        return t.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node t = map.get(key);
            t.value = value;

            //move to tail
            removeNode(t);
            offerNode(t);
        } else {
            if (map.size() >= cap) {
                //delete head
                map.remove(head.key);
                removeNode(head);
            }

            //add to tail
            Node node = new Node(key, value);
            offerNode(node);
            map.put(key, node);
        }
    }

    private void removeNode(Node n) {
        if (n.prev != null) {
            n.prev.next = n.next;
        } else {
            head = n.next;
        }

        if (n.next != null) {
            n.next.prev = n.prev;
        } else {
            tail = n.prev;
        }
    }

    private void offerNode(Node n) {
        if (tail != null) {
            tail.next = n;
        }

        n.prev = tail;
        n.next = null;
        tail = n;

        if (head == null) {
            head = tail;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */