package by.milosh.model.parameter;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Capacity.class, name = "capacity"),
        @JsonSubTypes.Type(value = Fuel.class, name = "fuel"),
        @JsonSubTypes.Type(value = FuelType.class, name = "fuelType"),
        @JsonSubTypes.Type(value = Name.class, name = "name"),
        @JsonSubTypes.Type(value = Armor.class, name = "armor"),
        @JsonSubTypes.Type(value = Firepower.class, name = "firepower"),
        @JsonSubTypes.Type(value = FlightSpeed.class, name = "flightSpeed")
})
public interface Parameter {
    public Object getValue();
}
