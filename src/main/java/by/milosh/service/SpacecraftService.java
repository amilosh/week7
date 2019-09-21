package by.milosh.service;

import by.milosh.factory.CruiserFactory;
import by.milosh.factory.DeathStarFactory;
import by.milosh.factory.Factory;
import by.milosh.factory.SpyProbeFactory;
import by.milosh.factory.StarfighterFactory;
import by.milosh.mapping.Mapping;
import by.milosh.model.general.common.Spacecraft;
import by.milosh.model.parameter.ParameterHandler;
import by.milosh.model.util.Type;
import by.milosh.resource.SpacecraftResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpacecraftService {

    private Mapping mapping;

    @Autowired
    public SpacecraftService(Mapping mapping) {
        this.mapping = mapping;
    }

    public Spacecraft create(SpacecraftResource spacecraftResource) {
        Type type = Type.valueOf(spacecraftResource.getType().toUpperCase());
        ParameterHandler parameterHandler = new ParameterHandler();
        parameterHandler.setParameters(mapping.parametersListToMap(spacecraftResource.getParameters()));
        Factory factory = getFactory(type);
        return factory.createSpacecraft(parameterHandler);
    }

    private Factory getFactory(Type type) {
        Factory factory;
        switch (type) {
            case CRUISER:
                factory = new CruiserFactory();
                break;
            case DEATHSTAR:
                factory = new DeathStarFactory();
                break;
            case SPYPROBE:
                factory = new SpyProbeFactory();
                break;
            case STARFIGHTER:
                factory = new StarfighterFactory();
                break;
            case TRANSPORT:
                factory = new by.milosh.factory.TransportFactory();
                break;
            default:
                throw new IllegalStateException();
        }
        return factory;
    }
}
