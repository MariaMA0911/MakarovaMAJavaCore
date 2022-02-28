package lesson5;

public class AppData {
    //2. Реализовать загрузку данных из csv файла. Файл читается целиком.
    //Структура csv файла:
    //| Строка заголовок с набором столбцов |
    //| Набор строк с целочисленными значениями |
    //| * Разделитель между столбцами - символ точка с запятой (;) |
    private String[] header;
    private int[][] data;

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
}
