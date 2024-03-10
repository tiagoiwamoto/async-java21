package br.com.kamehouse.asyncjava21.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@Configuration
@EnableAsync
public class AsyncConfig implements AsyncConfigurer {

    public Executor getAsyncExecutor(){

        //region Thread virtual
        ThreadFactory factory = Thread.ofVirtual().name("itau-", 0).factory();
        var executor = Executors.newThreadPerTaskExecutor(factory);
        //endregion

        //region Thread normal
//        var executor = Executors.newFixedThreadPool(5000);
        //endregion

        return executor;
    }

}
