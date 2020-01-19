package deng.easy;

/**
 * https://leetcode-cn.com/problems/print-in-order/
 *
 * @author deng
 * @date 2020/01/19
 */
public class PrintInOrder {
    private volatile int signal = 1;

    public PrintInOrder() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        signal = 2;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (signal != 2) {
            Thread.sleep(10);
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        signal = 3;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (signal != 3) {
            Thread.sleep(10);
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
