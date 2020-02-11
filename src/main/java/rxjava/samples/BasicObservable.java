package rxjava.samples;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class BasicObservable {

    public static void main(String[] args) {
        Observable<String> cricketers = Observable.fromArray(new String[]{"Sachin", "Virat", "Dhoni"});
        cricketers.subscribe(System.out::println);
    }
}
