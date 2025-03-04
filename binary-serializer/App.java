import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Test class for the {@code BinaryConverter} utility class.
 */
public class App {

    public static void main(String[] args) throws IOException {
        File file = new File("bin" + File.separator + "characters.bin");
        file.getParentFile().mkdirs();
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("Bin directory and characters.bin file created");
        }

        ArrayList<TestDataClass> objs = new ArrayList<>(
                Arrays.asList(new TestDataClass("Hiro", 12), new TestDataClass("ZeroTwo", 100)));

        BinaryConverter.serialize(file.getAbsolutePath(), objs);
        System.out.println("Objects serialized");

        ArrayList<TestDataClass> result = BinaryConverter.deserialize(file.getAbsolutePath(), TestDataClass.class);
        System.out.println("Deserialized objects\n");
        result.forEach(o -> System.out.println(o + "\n"));
    }

    private static class TestDataClass implements Serializable {
        private String name = "noname";
        private int power = 0;

        public TestDataClass(String name, int power) {
            this.name = name;
            this.power = power;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Power: " + power;
        }
    }

}
