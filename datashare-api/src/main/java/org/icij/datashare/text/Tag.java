package org.icij.datashare.text;

import java.util.Objects;

public class Tag {
    public final String label;

    public Tag(String label) {
        this.label = label;
    }

    public static Tag tag(String label) {
        return new Tag(label);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(label, tag.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }
}
