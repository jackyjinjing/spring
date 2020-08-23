package leetcode;

public class Middle2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode last = null;
        ListNode tmp;
        int a = 0;
        while (l1 != null||l2 !=null||a!=0){
            if(l1 != null){
                a += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                a += l2.val;
                l2 = l2.next;
            }
            tmp = new ListNode(a % 10);
            a /= 10;
            if(result == null){
                result = tmp;
                last = tmp;
                continue;
            }
            last.next = tmp;
            last = tmp;
        }
        return result;
    }
}



