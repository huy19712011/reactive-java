package org.example.chapter01;

import io.reactivex.rxjava3.core.Observable;

public class Ch01_01 {

    public static void main(String[] args) {

        Observable<String> myString = Observable.just("Alpha", "Beta", "Gamma");

        myString.subscribe(s -> System.out.println(s));
    }
}
