package fr.rouen.mastergil.tptest.meteo;

import java.util.List;

public class StationMeteo {

    private IWeatherProvider weatherProvider;


    public StationMeteo(IWeatherProvider weatherProvider) {
        this.weatherProvider = weatherProvider;
    }

    public static void main(String[] args) {
        System.out.println(
                new StationMeteo(new OpenWeatherMapProvider())
                        .majPrevision("Paris,FR")
        );
    }

    public List<Prevision> majPrevision(String city) {
        if (null == city) {
            throw new IllegalArgumentException("City is not optional");
        }

        return weatherProvider.getForecastByCity(city);
    }
}
