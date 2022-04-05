package fr.rouen.mastergil.tptest.meteo;


import java.util.List;

public interface IWeatherProvider {

    List<Prevision> getForecastByCity(String city);
}
