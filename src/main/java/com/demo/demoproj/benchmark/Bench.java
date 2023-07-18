package com.demo.demoproj.benchmark;

import com.demo.demoproj.DemoProjApplication;
import com.demo.demoproj.service.impl.UserServiceImpl;
import com.demo.demoproj.service.model.UserItemDTO;
import org.openjdk.jmh.annotations.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.context.ConfigurableApplicationContext;
import reactor.core.publisher.Mono;


@State(Scope.Benchmark)
public class Bench {


    private UserServiceImpl userServiceImpl;
    private ConfigurableApplicationContext applicationContext;

    @Setup(Level.Trial)
    public void Setup() {

        SpringApplication app = new SpringApplication(DemoProjApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        applicationContext = app.run(DemoProjApplication.class);


        userServiceImpl = applicationContext.getBean(UserServiceImpl.class);
    }

    @Benchmark
    public void benchmarkServiceCallFullReactive() {

        UserItemDTO userItemDTO = new UserItemDTO("01", "ivanov", "abwgd");
        Mono<UserItemDTO> response = userServiceImpl.save(userItemDTO);
        UserItemDTO result = response.block();
    }

    @Benchmark
    public void benchmarkServiceCall() {
        UserItemDTO userItemDTO = new UserItemDTO("02", "ivanov", "abwgd");
        Mono<UserItemDTO> response = userServiceImpl.save2(userItemDTO);
        UserItemDTO result = response.block();
    }

    @TearDown(Level.Trial)
    public void tearDown() {
        applicationContext.close();
    }


}
