package lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;

public class MainLesson6 {
    //С помощью http запроса получить в виде json строки погоду в Санкт-Петербурге
    // на период времени, пересекающийся со следующим занятием
    // (например, выборка погода на следующие 5 дней - подойдет)
    //Подобрать источник самостоятельно. Можно использовать api accuweather,
    // порядок следующий: зарегистрироваться, зарегистрировать тестовое приложение для получения api ключа,
    // найдите нужный endpoint и изучите документацию.
    // Бесплатный тарифный план предполагает получение погоды не более чем на 5 дней вперед
    // (этого достаточно для выполнения д/з).

    static Properties prop = new Properties();

    public static void main(String[] args) throws IOException {
        //загружаем проперти
        loadProperties();
        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(prop.getProperty("BASE_HOST1"))
                .addPathSegment(prop.getProperty("FORECAST1"))
                .addPathSegment(prop.getProperty("API_VERSION1"))
                .addPathSegment(prop.getProperty("FORECAST_TYPE1"))
                .addPathSegment(prop.getProperty("FORECAST_PERIOD1"))
                .addPathSegment(prop.getProperty("SAINT_PETERSBURG_KEY1"))
                .addQueryParameter("apikey", prop.getProperty("API_KEY1"))
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        System.out.println(url.toString());


        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        System.out.println(jsonResponse);

        ObjectMapper mapper = new ObjectMapper();
        StringReader reader = new StringReader(jsonResponse);

        Example example = mapper.readValue(reader, Example.class);
        System.out.println();

    }

    private static void loadProperties() throws IOException {
        try(FileInputStream configFile = new FileInputStream("src/main/resources/lesson6.properties")){
            prop.load(configFile);
        }
    }
}
