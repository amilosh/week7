package by.milosh.model.general.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Spacecraft {
    private Integer fuel;
    private String fuelType;
    private String name;
    private Integer armor;
}
