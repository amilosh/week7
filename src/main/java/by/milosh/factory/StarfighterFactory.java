package by.milosh.factory;

import by.milosh.model.general.Starfighter;
import by.milosh.model.general.common.Spacecraft;
import by.milosh.model.parameter.ParameterHandler;

import java.util.Map;

public class StarfighterFactory extends Factory {
    @Override
    public Spacecraft createSpacecraft(ParameterHandler parameterHandler) {
        Map<String, Object> map = parameterHandler.getParameters();
        return Starfighter.StarfighterBuilder()
                .armor((Integer) map.get("armor".toLowerCase()))
                .fuelType((String) map.get("fuelType".toLowerCase()))
                .fuel((Integer) map.get("fuel".toLowerCase()))
                .name((String) map.get("name".toLowerCase()))
                .firepower((Integer) map.get("firepower".toLowerCase()))
                .flightSpeed((Integer) map.get("flightSpeed".toLowerCase()))
                .build();
    }
}
