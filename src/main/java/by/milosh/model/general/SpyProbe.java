package by.milosh.model.general;

import by.milosh.model.general.common.NonCombatSpacecraft;
import lombok.Builder;
import lombok.Getter;

@Getter
public class SpyProbe extends NonCombatSpacecraft {
    private String scanSensor;

    @Builder(builderMethodName = "SpyProbeBuilder")
    public SpyProbe(Integer fuel, String fuelType, String name, Integer armor, String colour, String scanSensor) {
        super(fuel, fuelType, name, armor, colour);
        this.scanSensor = scanSensor;
    }
}
