package io.augusto.estreams;

import java.util.Objects;

public class ECountry {

    private String name;
    private EContinent continent;

    public ECountry(String name, EContinent continent) {
        this.name = name;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public EContinent getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return "ECountry{" +
                "name='" + name + '\'' +
                ", continent=" + continent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ECountry eCountry = (ECountry) o;
        return Objects.equals(name, eCountry.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
