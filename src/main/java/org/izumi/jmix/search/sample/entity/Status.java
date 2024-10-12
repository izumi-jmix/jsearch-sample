package org.izumi.jmix.search.sample.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum Status implements EnumClass<Integer> {
    SILVER(10),
    GOLD(20);

    private final Integer id;

    Status(Integer id) {
        this.id = id;
    }

    @NonNull
    @Override
    public Integer getId() {
        return id;
    }

    @Nullable
    public static Status fromId(Integer id) {
        for (Status at : Status.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}