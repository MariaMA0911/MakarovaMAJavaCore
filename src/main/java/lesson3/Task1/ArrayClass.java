package lesson3.Task1;

public class ArrayClass <T> {
    T buffer;

    public T[] swapElements(T[] array, int indexA, int indexB){
        buffer = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = buffer;
        return array;
    }

}
