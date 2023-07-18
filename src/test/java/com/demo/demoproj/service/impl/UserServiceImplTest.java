package com.demo.demoproj.service.impl;

import com.demo.demoproj.DemoProjApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.demoproj.service.model.UserItemDTO;
import reactor.core.publisher.Mono;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.Assert.assertTrue;


//@RunWith(SpringRunner.class)
/*@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = DemoProjApplication.class)*/
class UserServiceImplTest {


//@Autowired
//    private UserServiceImpl userService;// = new UserServiceImpl(userRepository,conversionService);

/*
    @Test
    public void runBenchmarks() throws Exception {
        Options options = new OptionsBuilder()
                .include(this.getClass().getName() + ".*")
                .mode(Mode.AverageTime)
                .warmupTime(TimeValue.seconds(1))
                .warmupIterations(6)
                .threads(1)
                .measurementIterations(6)
                .forks(1)
                .shouldFailOnError(true)
                .shouldDoGC(true)
                .build();

        new Runner(options).run();
    }
    */


    public void save() throws Exception {
        System.out.println("hello world;\n");
        //       Mono<UserItemDTO> saved = userService.save(new UserItemDTO("33121","A","balagur"));

//         saved.subscribe(s -> {
//             System.out.println("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii"+s.getUsername());
//         });
//        long start = System.nanoTime();
//
//         long delta = end -start;
//         System.out.println("save() runs in " + delta + " nanoseconds");
//         long delta1 = delta;
//
//        end = System.nanoTime();
//        Mono<UserItemDTO> saved2 = userService.save2(new UserItemDTO("1121","test21","balagur"));
//        start = System.nanoTime();
//
//        delta = end -start;
//        System.out.println("save2() runs in " + delta + " nanoseconds");
//
//        System.out.println("save2() runs slower by " + delta - delta1 + " nanoseconds");
//
//      //  StepVerifier.create(saved)
//        //        .verifyComplete();


        assertTrue(true);

    }



    public void save2() throws Exception {
        for (int i = 0; i < 1000; i++) {
            System.out.println("hello world;\n");
        }
        assertTrue(true);
    }


}