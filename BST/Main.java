
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Bst myBst=new Bst(new Node(10));
        myBst.insert(15);
        myBst.insert(8);
        myBst.insert(17);
        myBst.insert(1);
        myBst.remove(15);
        myBst.remove(1);
        myBst.remove(17);
        myBst.remove(8);
        myBst.remove(10);
        myBst.remove(1);
        
    }
}