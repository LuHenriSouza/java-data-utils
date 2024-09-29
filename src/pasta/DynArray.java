package pasta;

public class DynArray<T> {
    private T[] array;
    private int size;

    public DynArray(){
        array = (T[]) new Object[10];
        size = 0;
    }

    public void add(T[] value){
        if(size == array.length){

        }
    }

    public int size(){
        return size;
    }

    public boolean contains(T value) {
        for (T t : array) {
            if (t == value) {
                return true;
            }
        }
        return false;
    }

    private void arrayCopy(T[] destiny, T[] src) {
        for (int i = 0; i < src.length; i++) {
            destiny[i] = src[i];
        }
    }

    private void test2(){
        int[] arr = {1,2,3,4};
        test(arr);

    }

    private void test(int[] arr2){
        arr2[0] = 5;

    }
}