public class Add_two {
    public static  class ListNode {
        int val;
        ListNode next;

        ListNode() {
            this.val = 0;
            this.next = null;
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        ListNode tail;
        ListNode DHead=new ListNode();
        tail=DHead;
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(4, l3);
        ListNode l1 = new ListNode(2, l2);

        ListNode l6 = new ListNode(4);
        ListNode l5 = new ListNode(6, l6);
        ListNode l4 = new ListNode(5, l5);

      int carry=0;
      while(l1!=null||l4!=null||carry!=0){
        int d1=l1!=null?l1.val:0;
        int d2=l4!=null?l4.val:0;

       int data=d1+d2+carry;
       carry=data/10;
       data%=10;
       ListNode newNode=new ListNode(data);
       tail.next=newNode;
       tail=newNode;
 
        l1=l1!=null?l1.next:null;
        l4=l4!=null?l4.next:null;
      }
  

      ListNode result=DHead.next;
      while(result!=null){
        System.out.print(result.val);
        result=result.next;
      }

      

    }

}
