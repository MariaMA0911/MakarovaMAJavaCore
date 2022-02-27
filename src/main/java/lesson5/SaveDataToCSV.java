package lesson5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveDataToCSV {
    public static void main(String[] args) {

    ArrayList<FileObject> fileObjectArrayList = new ArrayList<>(5);
    FileObject fileObject1 = new FileObject("Value1", 100, 300);
    FileObject fileObject2 = new FileObject("Value2", 200, 400);
    FileObject fileObject3 = new FileObject("Value3", 123, 500);

        fileObjectArrayList.add(fileObject1);
        fileObjectArrayList.add(fileObject2);
        fileObjectArrayList.add(fileObject3);

}

    public static void writer() throws IOException {
        //пишем в fileCSV.csv
        try (FileWriter writer = new FileWriter("src/main/resources/fileCSV.csv");){
            // объекты
              for(FileObject fileObject : fileObjectArrayList) {
                writer.write(fileObject.getTitle() + ";" + fileObject.getValueOne()
                        + ";" + fileObject.getValueTwo() + ";"+ System.getProperty("line.separator"));
            }
        }
    }

}
