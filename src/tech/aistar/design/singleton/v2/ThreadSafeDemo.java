package tech.aistar.design.singleton.v2;
//了解一下线程
public class ThreadSafeDemo {

    //方法都是由线程去执行的
    //当我们启动程序的时候 - 启动jvm.exe这个进程
    //当我们启动虚拟机这个进程之后,内部就会同时开启两个线程,不同线程执行不同的任务
    //这两个线程分别是main线程 - 主线程 - 负责执行main方法
    //另外一个是gc线程 - 后台守护线程 - 负责回收垃圾对象
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main -enter");

        //获取当前正在执行的线程的名称
        System.out.println(Thread.currentThread().getName());//main



        //自己床建一个进程,并且启动这个线程
        Thread t =new Thread(()->{
            System.out.println(Thread.currentThread().getName() );

        });
        t.start();
        Thread.sleep(10);
        System.out.println("main-exit");








    }
}
