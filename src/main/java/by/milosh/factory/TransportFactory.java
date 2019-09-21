package by.milosh.factory;

import by.milosh.model.general.Transport;
import by.milosh.model.general.common.Spacecraft;
import by.milosh.model.parameter.ParameterHandler;

import java.util.Map;

public class TransportFactory extends Factory {
    @Override
    public Spacecraft createSpacecraft(ParameterHandler parameterHandler) {
        Map<String, Object> map = parameterHandler.getParameters();
        return Transport.TransportBuilder()
                .armor((Integer) map.get("armor".toLowerCase()))
                .fuelType((String) map.get("fuelType".toLowerCase()))
                .fuel((Integer) map.get("fuel".toLowerCase()))
                .name((String) map.get("name".toLowerCase()))
                .colour((String) map.get("colour".toLowerCase()))
                .capacity((Integer) map.get("capacity".toLowerCase()))
                .build();
    }
}
