import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable {
    private static float averagePrice = 2.99f;

    private String description;
    private transient float price;

    public Product(String description, float price) {
        this.description = description;
        this.price = price;
    }

    public void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        price = averagePrice;
    }

    @Override
    public String toString() {
        return description + " " + price + " " + averagePrice;
    }
}


public class Shop {
    public static void main(String[] args) {
        Product p = new Product("cookie", 3.99f);

        try {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("p.ser"))) {
                out.writeObject(p);
            }

            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("p.ser"))) {
                p = (Product) in.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(p);

    }

}