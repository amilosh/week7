package by.milosh.controller;

import by.milosh.model.general.common.Spacecraft;
import by.milosh.resource.SpacecraftResource;
import by.milosh.service.SpacecraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spacecrafts")
public class SpacecraftController {

    private final SpacecraftService spacecraftService;

    @Autowired
    public SpacecraftController(SpacecraftService spacecraftService) {
        this.spacecraftService = spacecraftService;
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Spacecraft> create(@RequestBody SpacecraftResource spacecraftResource) {

        Spacecraft spacecraft = spacecraftService.create(spacecraftResource);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(spacecraft);
    }
}
