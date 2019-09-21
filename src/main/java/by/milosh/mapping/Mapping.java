package by.milosh.mapping;

import by.milosh.model.parameter.Parameter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Mapping {
    public Map<String, Object> parametersListToMap(List<Parameter> parameters) {
        Map<String, Object> map = new HashMap<>();
        for (Parameter parameter : parameters) {
            String fieldName = parameter.getClass().getSimpleName().toLowerCase();
            Object value = parameter.getValue();
            map.put(fieldName, value);
        }
        return map;
    }
}
