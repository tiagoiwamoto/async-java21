package br.com.kamehouse.asyncjava21;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class AppService {

    @Async
    public void run() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Rodando minha app");
        var uuid = UUID.randomUUID();
        log.info("uuid gerado {}", uuid);
        log.info("thread virtual {}", Thread.currentThread().isVirtual());
        log.info("Thread está viva {}", Thread.currentThread().isAlive());
    }

}
