import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File {
    public static void main(String[] args) throws IOException {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "product1", 100));
        list.add(new Product(2, "product1", 300));
        list.add(new Product(3, "product1", 200));
        list.add(new Product(4, "product1", 1000));
        list.add(new Product(5, "product1", 400));

        creatFile(list);
        getListFromFile();
    }
    private static void getListFromFile() throws IOException {
        List<Product> list;
        FileInputStream in = null;
        ObjectInputStream objectInputStream = null;
        try {
            in = new FileInputStream("product.data");
            objectInputStream = new ObjectInputStream(in);
            list = (List<Product>) objectInputStream.readObject();
        } catch (Exception e) {

        } finally {
            if (in != null) {
                in.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        }
    }
    private static void creatFile(List<Product> list) throws IOException {
        FileOutputStream out = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            out = new FileOutputStream("product.data");       //tạo file để ghi dữ liệu vào
            objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(list);
        } catch (Exception e) {
        } finally {
            if (out != null) {
                out.close();
            }
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
        }
    }
}
