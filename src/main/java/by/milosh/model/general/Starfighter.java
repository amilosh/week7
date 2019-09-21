package by.milosh.model.general;

import by.milosh.model.general.common.CombatSpacecraft;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Starfighter extends CombatSpacecraft {
    private Integer flightSpeed;

    @Builder(builderMethodName = "StarfighterBuilder")
    public Starfighter(Integer fuel, String fuelType, String name, Integer armor, Integer firepower, Integer flightSpeed) {
        super(fuel, fuelType, name, armor, firepower);
        this.flightSpeed = flightSpeed;
    }
}
