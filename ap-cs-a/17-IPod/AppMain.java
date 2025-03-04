public class AppMain {

    public static void main(String[] args) {
        IPod bobsIpod = new IPod();

        bobsIpod.changeSong("Strawberry Fields Forever");
        bobsIpod.changeVolume(65);

        // Print bobsIpod status
        System.out.println(bobsIpod);

        // Turn bobsIpod ON
        bobsIpod.powerOn();

        // Print bobsIpod status
        System.out.println(bobsIpod);

        IPod myIPod = new IPod("Close Yet Far", 60, 85.0);
        myIPod.powerOn();

        // Print myIpod status
        System.out.println(myIPod);

        IPod jillsIPod = new IPod("Wait and Bleed", 100, 30.0);
        jillsIPod.powerOn();

        // Print jillsIPod status
        System.out.println(jillsIPod);

        jillsIPod.changeSong("It's The End Of The World As We Know It (And I Feel Fine)");
        jillsIPod.changeVolume(60);

        // Print jillsIPod status
        System.out.println(jillsIPod);
    }
}
