package io.augusto.Subject;

import java.util.EnumSet;
import java.util.Map;
import java.util.stream.Collectors;

public enum Subject {

    SCIENCE(1, "MORNING", 1),
    MATH(2, "MORNING", 2),
    HISTORY(3, "MORNING", 3),
    MUSIC(4, "AFTERNOON", 1),
    SOCIALSTUDIES(5, "AFTERNOON", 2),
    LANGUAGES(6, "AFTERNOON", 3);

    /**
     * Example with Collectors to Map
     */
    private static Map<String, Subject> subjectsLookup = EnumSet.allOf(Subject.class)
            .stream()
            .collect(Collectors.toMap(Subject::getName, s -> s));

    private int id;
    private String shift;
    private int level;

    Subject(int id, String shift, int level) {
        this.id = id;
        this.shift = shift;
        this.level = level;
    }

    public String getName() {
        return this.name();
    }

    public int getId() {
        return id;
    }

    public String getShift() {
        return shift;
    }

    public int getLevel() {
        return level;
    }

    /**
     * Devuelve un Optional con la materia cuyo nombre nombre es el que se
     * recibe como parámetro.
     *
     * @param subjectName Nombre de la materia
     * @return Optional con la materia.
     */
    public static Subject subNamed(String subjectName) {
        return subjectsLookup.get(subjectName.toUpperCase());
    }
}
