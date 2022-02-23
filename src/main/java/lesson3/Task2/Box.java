package lesson3.Task2;

public class Box<T extends Fruit>{
    T[] fruitArray;

    public Box(T[] fruitArray) {
        this.fruitArray = fruitArray;
    }

    public float getWeightSum (){
        float result = 0;
       for (T t: getFruitArray()){
           if (t!=null) {
               float value = t.getWeight();
               result = result + value;
           }
    }
       return result;
    }

    public Boolean compare (Box<? extends Fruit> box){
        if (this.getWeightSum() != box.getWeightSum()) {
            return false;
        }
        return  true;
    }

    public void toEmptyArray (Box<T> box) {
        box.getWeightSum();
        for (int i = 0; i < box.getFruitArray().length; i++) {
            if (box.getFruitArray()[i] != null) {
               this.getFruitArray() [getSize()] = box.getFruitArray()[i];
               box.getFruitArray()[i] = null;
            }
        }
    }

    private int getSize() {
        int result = 0;
        for (T t: getFruitArray()) {
            if (t != null) result ++;
        }
        return result;
    }

    private T[] getFruitArray () {
            return fruitArray;
        }
}
