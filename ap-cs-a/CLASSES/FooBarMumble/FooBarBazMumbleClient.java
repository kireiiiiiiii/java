package FBBMC;
import FBBMC.Baz;

public class FooBarBazMumbleClient { 
    public static void main(String[] args) {
        Foo f1 = new Baz();
        Foo f2 = new Bar();
        Foo f3 = new Mumble();
        Foo f4 = new Foo();

        // f1
        System.out.println(f1);
        f1.method1();
        f1.method2();
        System.out.println();

        // f2
        System.out.println(f2);
        f2.method1();
        f2.method2();
        System.out.println();

        // f3
        System.out.println(f3);
        f3.method1();
        f3.method2();
        System.out.println();

        // f4
        System.out.println(f4);
        f4.method1();
        f4.method2();
        System.out.println();
    }

    // example with array
    // public static void main(String[] args) {
    //     Foo[] pity = {new Baz(), new Bar(), new Mumble(), new Foo()};
    //     for (int i = 0; i < pity.length; i++) {
    //         System.out.println(pity[i]);
    //         pity[i].method1();
    //         pity[i].method2();
    //         System.out.println();
    //     }
    // }
}
