package lesson5;


import lesson5.AppData;
import lesson5.FileObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputCSV {

    private static ArrayList<FileObject> fIleObjectArrayList = new ArrayList<>();
    public static final String title = "value1"+ ";" + "value2"
            + ";" + "value3" + ";"+ System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        createFileObjects();
        writer();

        AppData appData = readToObject();
    }

    public static void createFileObjects() {
        fIleObjectArrayList.add(new FileObject(100, 200, 123));
        fIleObjectArrayList.add(new FileObject(300,400,500));

    }

    public static  void writer() throws IOException {
        try (FileWriter writer = new FileWriter("src/main/resources/fileCSV.csv");){
            writer.write(title);
            for(FileObject fIleObject : fIleObjectArrayList) {
                writer.write(fIleObject.getValueOne() + ";" + fIleObject.getValueTwo()
                        + ";" + fIleObject.getValueThree() + ";"+ System.getProperty("line.separator"));
            }
        }
    }



    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/fileCSV.csv"))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
             while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
             }
            System.out.println(title + records);
        }

        int[][] resultData = new int[records.size()][3];

        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).size();j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));


            }
        }
        appData.setData(resultData);
        return appData;

    }

}
