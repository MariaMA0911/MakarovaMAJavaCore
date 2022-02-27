package lesson5;

import java.io.Serializable;
import java.util.ArrayList;

public class FileObject implements Serializable {
   private String title;
   private Integer valueOne;
    private Integer valueTwo;

    public String getTitle() {
        return title;
    }

    public Integer getValueOne() {
        return valueOne;
    }

    public Integer getValueTwo() {
        return valueTwo;
    }

    public FileObject(String title, Integer valueOne, Integer valueTwo) {
        this.title = title;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;


    }
    @Override
    public String toString (){
        return "FileObject{" +
                "title='" + title + '\'' +
                ", valueOne=" + valueOne +
                ", valueTwo=" + valueTwo  +
                '}';
    }
    }



