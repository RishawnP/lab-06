package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not exist.
     * @param city The city to add.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns a sorted list of cities.
     * @return The sorted list.
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether the list contains the given city.
     * @param city The city to check.
     * @return True if the city is in the list.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes the given city from the list.
     * @param city The city to delete.
     * @throws IllegalArgumentException If the city is not in the list.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Counts the cities in the list.
     * @return The number of cities in the list.
     */
    public int countCities() {
        return cities.size();
    }
}


