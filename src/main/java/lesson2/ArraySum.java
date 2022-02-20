package lesson2;

public class ArraySum {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arrayValid = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
        };

        String[][] arrayUnsize = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1"},
        };

        String[][] arrayData = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "dfgadfgA", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
        };

        arrayMethod(arrayValid);
        arrayMethod(arrayUnsize);
        arrayMethod(arrayData);
    }


        static void arrayMethod (String[][] arr) throws MyArraySizeException, MyArrayDataException {
            int sum = 0;
            if (arr.length != 4)
                throw new MyArraySizeException(); {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length != 4) throw new MyArraySizeException();
                    for (int j = 0; j < arr[i].length; j++) {
                        try {
                            sum += Integer.parseInt(arr[i][j]);
                        } catch (Exception e) {
                            throw new MyArrayDataException(i, j);
                        }

                    }
                }
                System.out.println(sum);
            }


        }
    }


