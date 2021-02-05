public class Bst {
    private Node root;

    public Bst(Node root) {
        this.root = root;

    }

    public void insert(int value) {
        Node temp = this.root;
        if (temp == null) {
            this.root = new Node(value);

        }
        while (true) {
            if (value < temp.getData()) {
                if (temp.getLeft() == null) {
                    temp.setLeft(new Node(value));
                    break;
                }
                temp = temp.getLeft();
            } else {
                if (temp.getRight() == null) {
                    temp.setRight(new Node(value));
                    break;
                }
                temp = temp.getRight();
            }
        }
    }

    public void remove(int value) {

        if (this.root == null) {
            System.out.println("No data to compare");
            return;
        } else if ((this.root.getData() == value) && (this.root.getLeft() == null) && (this.root.getRight() == null)) {
            this.root = null;
            return;
        }

        Node parent = this.root;
        Node temp = this.root;
        boolean isleftofparent=false;

        while (temp != null) {
            if (temp.getData() == value) {
                break;
            } else if (temp.getData() > value) {
                isleftofparent = true;
                parent = temp;
                temp = temp.getLeft();
            } else {
                isleftofparent = false;
                parent = temp;
                temp = temp.getRight();
            }
        }

        if (temp == null) {
            System.out.println("There is no such data");
            return;
        }

        if (temp.getLeft() == null && temp.getRight() == null) {
            if (isleftofparent) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        } else if (temp.getLeft() != null && temp.getRight() != null) {
            parent = temp;
            temp = temp.getRight();
            Node earlier = temp;
            while (temp.getLeft() != null) {
                earlier = temp;
                temp = temp.getLeft();
            }

            if (temp.getRight() != null) {
                parent.setData(temp.getData());
                earlier.setLeft(temp.getRight());
                temp.setRight(null);
            } else {
                parent.setData(temp.getData());
                earlier.setLeft(null);
            }

        } else if (temp.getLeft() != null) {
            if (isleftofparent) {
                parent.setLeft(temp.getLeft());
                temp.setLeft(null);
            } else {
                parent.setRight(temp.getLeft());
                temp.setLeft(null);
            }
        } else if (temp.getRight() != null) {
            if (isleftofparent) {
                parent.setLeft(temp.getRight());
                temp.setRight(null);
            } else {
                parent.setRight(temp.getRight());
                temp.setRight(null);
            }
        }

    }

}
