package io.augusto.estreams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static io.augusto.estreams.Loyalty.*;

/**
 * Immutable Customer Class
 */
public class DImmutableCustomer {

    private final String name;
    private final String email;
    private final boolean active;
    private final Loyalty loyalty;

    public DImmutableCustomer(String name, String email, boolean active, Loyalty program) {
        this.name = name;
        this.email = email;
        this.active = active;
        this.loyalty = program;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    public Loyalty getLoyalty() {
        return loyalty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DImmutableCustomer customer = (DImmutableCustomer) o;
        return Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "DImmutableCustomer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                ", loyalty=" + loyalty +
                '}';
    }

    public static List<DImmutableCustomer> customers() {
        DImmutableCustomer customer01 = new DImmutableCustomer("Maria", "maria@mail.com", true, BASIC);
        DImmutableCustomer customer02 = new DImmutableCustomer("Jose", "josez@mail.com", true, BASIC);
        DImmutableCustomer customer03 = new DImmutableCustomer("Manuel", "manuel@mail.com", true, BASIC);
        DImmutableCustomer customer04 = new DImmutableCustomer("Miguel", "miguel@mail.com", true, BASIC);
        DImmutableCustomer customer05 = new DImmutableCustomer("Pedro", "pedro@mail.com", true, SILVER);
        DImmutableCustomer customer06 = new DImmutableCustomer("Roberto", "roberto@mail.com", true, SILVER);
        DImmutableCustomer customer07 = new DImmutableCustomer("Juana", "juana@mail.com", true, SILVER);
        DImmutableCustomer customer08 = new DImmutableCustomer("Lucia", "lucia@mail.com", false, PRIME);
        DImmutableCustomer customer09 = new DImmutableCustomer("Mario", "mario@mail.com", true, PRIME);
        DImmutableCustomer customer10 = new DImmutableCustomer("Rocio", "rocio@mail.com", true, GOLD);
        DImmutableCustomer customer11 = new DImmutableCustomer("Eduardo", "eduardo@mail.com", true, PLATINUM);

        return Arrays.asList(customer01, customer02, customer03, customer04, customer05, customer06,
                customer07, customer08, customer09, customer10, customer11);
    }
}
