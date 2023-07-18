package com.demo.demoproj.benchmark;

import com.demo.demoproj.DemoProjApplication;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
import org.springframework.boot.SpringApplication;

public class BenchmarkRunner {

    public static void main(String[] args) throws RunnerException {

        Options opt = new OptionsBuilder()
                .include(Bench.class.getSimpleName())
                .measurementIterations(5)
                .forks(2)
                .threads(8)
                .mode(Mode.SingleShotTime)
                .warmupTime(TimeValue.seconds(5))
                .warmupIterations(50)
                .build();



        new Runner(opt).run();
    }

}