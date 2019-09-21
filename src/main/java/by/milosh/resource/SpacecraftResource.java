package by.milosh.resource;

import by.milosh.model.parameter.Parameter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpacecraftResource {
    private String type;
    private List<Parameter> parameters;
}
