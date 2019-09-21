package by.milosh.model.general.common;

import lombok.Getter;

@Getter
public abstract class NonCombatSpacecraft extends Spacecraft {
    private String colour;

    public NonCombatSpacecraft(Integer fuel, String fuelType, String name, Integer armor, String colour) {
        super(fuel, fuelType, name, armor);
        this.colour = colour;
    }
}
