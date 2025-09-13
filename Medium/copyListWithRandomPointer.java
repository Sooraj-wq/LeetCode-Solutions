import java.util.HashMap;

public class copyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        
        if(head == null){
            return null;
        }

        HashMap<Node,Node> map = new HashMap<>();

        Node curr = head;
        while(curr!=null){
            map.put(curr,new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while(curr!=null){
            Node copy = map.get(curr);
            Node next = map.get(curr.next);
            Node random = map.get(curr.random);

            if (curr.next != null) {                   
                copy.next = map.get(curr.next);
            }
            
            if (curr.random != null) {
                copy.random = map.get(curr.random);
            }

            curr = curr.next;
        }

        return map.get(head);
    }
}
