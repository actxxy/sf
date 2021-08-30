package jz_offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 *
 * 如输入{1,2,3}的链表如下图:
 * 返回一个数组为[3,2,1]
 *
 */

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}



public class JZ3_从尾到头打印链表 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode!=null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList arrayList = new ArrayList();
        while (!stack.empty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
    
    public static void main(String[] args) {

    }
}

