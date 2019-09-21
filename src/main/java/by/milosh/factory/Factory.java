package by.milosh.factory;

import by.milosh.model.general.common.Spacecraft;
import by.milosh.model.parameter.ParameterHandler;

public abstract class Factory {
    public abstract Spacecraft createSpacecraft(ParameterHandler parameterHandler);
}
