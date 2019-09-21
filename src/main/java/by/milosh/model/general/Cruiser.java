package by.milosh.model.general;

import by.milosh.model.general.common.CombatSpacecraft;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Cruiser extends CombatSpacecraft {
    private Integer guns;

    @Builder(builderMethodName = "CruiserBuilder")
    public Cruiser(Integer fuel, String fuelType, String name, Integer armor, Integer firepower, Integer guns) {
        super(fuel, fuelType, name, armor, firepower);
        this.guns = guns;
    }
}
