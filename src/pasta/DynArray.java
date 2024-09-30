package pasta;

public class DynArray<T> {
    private T[] array;
    private int size;

    public DynArray() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public T get(int index){
        return array[index];
    }

    public T[] get() {
        T[] resultArray = (T[]) new Object[size];
        arrayCopy(resultArray, array);
        return resultArray;
    }

    public void add(T value) {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[size * 2];
            arrayCopy(newArray, array);
            array = newArray;
        }
        array[size] = value;
        size++;
    }

    public void add(T value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice " + index + " é inválido.");
        }

        if (size == array.length) {
            T[] newArray = (T[]) new Object[size * 2];
            arrayCopy(newArray, array);
            array = newArray;
        }

        for (int pos = size - 1; pos > index; pos--) {
            array[pos + 1] = array[pos];
        }

        array[index] = value;
        size++;
    }

    public int size() {
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

    public void removeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice " + index + " é inválido.");
        }
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
    }


    public void removeByValue (T value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {

                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                break;
            }
            array[size - 1] = null;
            size--;
        }
    }

    private void arrayCopy(T[] destiny, T[] src) {
        for (int i = 0; i < src.length; i++) {
            destiny[i] = src[i];
        }
    }
}