/*
 * Author: Matěj Šťastný aka Kirei
 * Date created: 3/3/2025
 * Github link: https://github.com/kireiiiiiiii
 */

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * BinaryConverter is a utility class that provides methods to serialize and
 * deserialize ArrayLists of objects to and from binary files.
 * <p>
 * This class cannot be instantiated.
 * </p>
 * <p>
 * Example usage:
 *
 * <pre>
 * {@code
 * ArrayList<MyObject> myObjects = new ArrayList<>();
 * myObjects.add(new MyObject());
 * BinaryConverter.serialize("path/to/file", myObjects);
 * ArrayList<MyObject> deserializedObjects = BinaryConverter.deserialize("path/to/file", MyObject.class);
 * }
 * </pre>
 * </p>
 */
public class BinaryConverter {

    private BinaryConverter() {
        throw new UnsupportedOperationException("BinaryConverter is a utility class and cannot be instantiated.");
    }

    /**
     * Serializes an ArrayList of objects to a binary file.
     *
     * @param <T>      the type of objects to be serialized
     * @param filePath the path to the binary file where the objects will be
     *                 serialized
     * @param objects  the ArrayList of objects to be serialized
     */
    public static <T> void serialize(String filePath, ArrayList<T> objects) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (T obj : objects) {
                oos.writeObject(obj);
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deerializes objects from a binary file into an ArrayList of the specified
     * type.
     *
     * @param <T>      the type of objects to be deserialized
     * @param filePath the path to the binary file containing the serialized objects
     * @param clazz    the Class object of the type T
     * @return an ArrayList containing the deserialized objects of type T
     */
    public static <T> ArrayList<T> deserialize(String filePath, Class<T> clazz) {
        ArrayList<T> objectList = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            while (true) {
                try {
                    Object o = ois.readObject();
                    if (clazz.isInstance(o)) {
                        objectList.add(clazz.cast(o));
                    } else {
                        System.out.println("Invalid object class found");
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return objectList;
    }

}
