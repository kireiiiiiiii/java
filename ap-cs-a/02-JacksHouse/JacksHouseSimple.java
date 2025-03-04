public class JacksHouseSimple {
    public static void main(String[] args) {
        String one = "This is the house that Jack built. \n\n";
        String two = "This is the malt, \n" + one;
        String three = "This is the rat, \n" + two;
        String four = "This is the cat, \n" + three;
        String five = "This is the dog, \n" + four;
        String six = "This is the cow with the crumpled horn, \n" + five;
        String seven = "This is the maiden all forlorn, \n" +six;

        System.out.println(one + two + three + four + five + six + seven);
    }
}