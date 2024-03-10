package br.com.kamehouse.asyncjava21;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class AppController {

    private final AppService service;

    @GetMapping
    public ResponseEntity index() throws InterruptedException {
        for(int x = 0; x <= 65000; x++) {
            service.run();
        }
        return ResponseEntity.ok(UUID.randomUUID().toString());
    }

}
