package org.example.chapter01;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Ch01_03 {

    public static void main(String[] args) {

        Observable<Long> secondIntervals = Observable.interval(1, TimeUnit.SECONDS);

        secondIntervals.subscribe(s -> System.out.println(s));

        sleep(5000);
    }

    private static void sleep(long millis) {
        try {

            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
