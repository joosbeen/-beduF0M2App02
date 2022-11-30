package com.example.app.f0m2app02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app.f0m2app02.model.weather.WeatherResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;

public class Temperatura extends AppCompatActivity {

    private static final String URL_API = "https://api.openweathermap.org/data/2.5/weather?lat=16.251150&lon=-92.136480&appid=b62bec84393bc782f065b3b227588a32&lang=es";
private TextView texto_temperatura, texto_clima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        texto_temperatura = findViewById(R.id.texto_temperatura);
        texto_clima = findViewById(R.id.texto_clima);
    }

    public void btnClickTemperatura(View view) {
        getHttp(URL_API);
    }

    public void getHttp(String urlApi) {

        HttpURLConnection urlConnection = null;

        try {
            URL url = new URL(urlApi);
            urlConnection = (HttpURLConnection) url.openConnection();

            int code = urlConnection.getResponseCode();
            if (code != 200) {
                //throw new IOException("Invalid response from server: " + code);
                Toast.makeText(this, "Ocurrio un error al cargar la temperatura", Toast.LENGTH_SHORT).show();
            }

            BufferedReader rd = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = rd.readLine()) != null) {
                response.append(inputLine);
            }
            rd.close();

            WeatherResponse weatherResponse = jsonResponse(response.toString());
            Log.i("DataJB", weatherResponse.toString());
            texto_temperatura.setText(weatherResponse.getMain().getTemp() + "");
            texto_clima.setText(weatherResponse.getWeather().get(0).getDescription());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }

    }

    private WeatherResponse jsonResponse(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<WeatherResponse>() {
        }.getType();
        return gson.fromJson(json, type);
    }
}