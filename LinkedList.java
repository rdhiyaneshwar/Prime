public class Main {
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }
    Node head;
    Node temp;
    void ins(int data){
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            temp = newNode;
        }
        else
        {
            temp.next = newNode;
            temp = newNode;
        }
    }
    void disp(){
        temp = head;
        while(temp.next != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            if(n == -1) break;
            m.ins(n);
        }
        m.disp();
    }
}
