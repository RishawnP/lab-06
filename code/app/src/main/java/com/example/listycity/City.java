package com.example.listycity;

import java.util.Objects;

/**
 * Represents a City with a name and province.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Creates a City with the provided name and province.
     * @param city The city name.
     * @param province The province name.
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     * @return The city name.
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Gets the province name.
     * @return The province name.
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares cities by name.
     * @param o The other city.
     * @return Comparison result based on city name.
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Checks equality based on city and province.
     * @param o The object to compare.
     * @return True if same city and province.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof City)) {
            return false;
        }
        City city = (City) o;
        return Objects.equals(this.city, city.city)
                && Objects.equals(this.province, city.province);
    }

    /**
     * Hash code based on city and province.
     * @return Hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
