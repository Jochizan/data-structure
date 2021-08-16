package courses.third;

public class BinaryTreeMain extends BinaryTree {

    @Override
    public void processing(Object value) {
        String name = ((Data) value).getName();
        double note = ((Data) value).getNote();
        System.out.println(name + " " + note);
    }

    @Override
    public int compare(Object a, Object b) {
        String str1 = ((Data) a).getName();
        String str2 = ((Data) b).getName();
        // a b m  z
        return str1.compareTo(str2);
    }

    @Override
    public void visitInorder() {
        inOrder(null, true);
    }

    @Override
    public void visitPostorder() {
        postOrder(null, true);
    }

    @Override
    public void visitPreorder() {
        preOrder(null, true);
    }
}
