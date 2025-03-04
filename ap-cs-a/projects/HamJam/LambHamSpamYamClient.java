public class LambHamSpamYamClient { 
    public static void main(String[] args) {
        Ham food1 = new Lamb();
        Ham food2 = new Ham();
        Ham food3 = new Spam();
        Ham food4 = new Yam();

        // food1
        System.out.println(food1);
        food1.a();
        System.out.println();     // to end the line of output
        food1.b();
        System.out.println();     // to end the line of output
        System.out.println();

        // food2
        System.out.println(food2);
        food2.a();
        System.out.println();     // to end the line of output
        food2.b();
        System.out.println();     // to end the line of output
        System.out.println();

        // food3
        System.out.println(food3);
        food3.a();
        System.out.println();     // to end the line of output
        food3.b();
        System.out.println();     // to end the line of output
        System.out.println();

        // food4
        System.out.println(food4);
        food4.a();
        System.out.println();     // to end the line of output
        food4.b();
        System.out.println();     // to end the line of output
        System.out.println();
    }

    // example with array
    // Ham[] food = {new Lamb(), new Ham(), new Spam(), new Yam()};
    // for (int i = 0; i < food.length; i++) {
    //     System.out.println(food[i]);
    //     food[i].a();
    //     System.out.println();     // to end the line of output
    //     food[i].b();
    //     System.out.println();     // to end the line of output
    //     System.out.println();
    // }
}
