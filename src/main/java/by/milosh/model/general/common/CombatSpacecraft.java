package by.milosh.model.general.common;

import lombok.Getter;

@Getter
public abstract class CombatSpacecraft extends Spacecraft {
    private Integer firepower;

    public CombatSpacecraft(Integer fuel, String fuelType, String name, Integer armor, Integer firepower) {
        super(fuel, fuelType, name, armor);
        this.firepower = firepower;
    }
}
