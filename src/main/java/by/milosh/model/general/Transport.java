package by.milosh.model.general;

import by.milosh.model.general.common.NonCombatSpacecraft;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Transport extends NonCombatSpacecraft {
    private Integer capacity;

    @Builder(builderMethodName = "TransportBuilder")
    public Transport(Integer fuel, String fuelType, String name, Integer armor, String colour, Integer capacity) {
        super(fuel, fuelType, name, armor, colour);
        this.capacity = capacity;
    }
}
