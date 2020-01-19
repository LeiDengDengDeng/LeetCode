package deng.medium;

/**
 * @author deng
 * @date 2020/01/19
 */
public class PrintFooBarAlternately {
    private int n;
    private volatile int tag = 0;

    public PrintFooBarAlternately(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while (tag != 0) Thread.sleep(1);
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            tag = 1;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while (tag != 1) Thread.sleep(1);
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            tag = 0;
        }
    }
}
