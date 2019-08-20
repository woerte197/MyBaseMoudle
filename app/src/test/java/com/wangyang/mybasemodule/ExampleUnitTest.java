package com.wangyang.mybasemodule;

import org.junit.Test;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        int diliverNum = 2213213;//举例子的变量
        int queryMailNum = 90000000;//举例子的变量

    }

    private void happy(double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    private <T> List<T> supplier(int num, Supplier<T> supplier) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    private String subR(String value, Function<String, String> function) {
        return function.apply(value);
    }

    private List<String> predicate(String value, Predicate<String> predicate) {
        List<String> list = new ArrayList<>();
        if (predicate.test(value)) {
            list.add(value);
        }
        return list;
    }

    private interface A {
        void test();
    }
}
