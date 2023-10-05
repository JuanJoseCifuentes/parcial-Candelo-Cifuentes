package co.edu.unisabana.parcialarquitectura.controller;

import co.edu.unisabana.parcialarquitectura.controller.dto.CheckpointDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(profiles = "test")
class GateControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void checkout() {

        CheckpointDTO dto = new CheckpointDTO("facility1", "Driver1", 10);

        ResponseEntity<GateController> respuesta =restTemplate.postForEntity("/checkpoint/checkout", dto, GateController.class);



    }
}