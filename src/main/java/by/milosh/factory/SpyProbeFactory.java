package by.milosh.factory;

import by.milosh.model.general.SpyProbe;
import by.milosh.model.general.common.Spacecraft;
import by.milosh.model.parameter.ParameterHandler;

import java.util.Map;

public class SpyProbeFactory extends Factory {
    @Override
    public Spacecraft createSpacecraft(ParameterHandler parameterHandler) {
        Map<String, Object> map = parameterHandler.getParameters();
        return SpyProbe.SpyProbeBuilder()
                .armor((Integer) map.get("armor".toLowerCase()))
                .fuelType((String) map.get("fuelType".toLowerCase()))
                .fuel((Integer) map.get("fuel".toLowerCase()))
                .name((String) map.get("name".toLowerCase()))
                .colour((String) map.get("name".toLowerCase()))
                .scanSensor((String) map.get("scanSensor".toLowerCase()))
                .build();
    }
}
