// LeetCode 21.Merge Two Sorted Lists

public class Problem4 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        Problem4 p = new Problem4();
        ListNode l1 = p.new ListNode(1);
        l1.next = p.new ListNode(2);
        l1.next.next = p.new ListNode(4);

        ListNode l2 = p.new ListNode(1);
        l2.next = p.new ListNode(3);
        l2.next.next = p.new ListNode(4);      
    
        ListNode ans = mergeTwoLists(l1,l2);
        while(ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        Problem4 p = new Problem4();
        ListNode head = p.new ListNode(0);
        ListNode l = head;
        while (list1 != null && list2 != null) {
            if(list1.val < list2.val){
                l.next = list1;
                // System.out.println(l.val);
                list1 = list1.next;
                l = l.next;
            }else{
                l.next = list2;
                // System.out.println(l.val);
                list2 = list2.next;
                l = l.next;
            }
            
        }

        if (list1 != null) {
            l.next = list1;
        }else{
            l.next = list2;
        }

        // l = l.next;
        // list1 = list1.next;
        // list2 = list2.next;
        return head.next;
    }
}






