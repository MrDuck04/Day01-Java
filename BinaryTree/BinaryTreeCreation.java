public class BinaryTreeCreation{
    
    public Node btCreation(int idx, int size){
        if(idx > size)return null;
        Node root = arr[idx];
        root.left = arr[2*idx + 1];
        root.right = arr[2*idx + 2];
        btCreation(idx++, size);
    }
}
