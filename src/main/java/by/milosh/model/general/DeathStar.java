package by.milosh.model.general;

import by.milosh.model.general.common.CombatSpacecraft;
import lombok.Builder;
import lombok.Getter;

@Getter
public class DeathStar extends CombatSpacecraft {
    private Integer starfighterCapacity;

    @Builder(builderMethodName = "DeathStarBuilder")
    public DeathStar(Integer fuel, String fuelType, String name, Integer armor, Integer firepower, Integer starfighterCapacity) {
        super(fuel, fuelType, name, armor, firepower);
        this.starfighterCapacity = starfighterCapacity;
    }
}
