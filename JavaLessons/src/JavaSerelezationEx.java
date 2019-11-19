import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JavaSerelezationEx {
    public static void main(String[] args) throws Exception{
        UserChild user = new UserChild();
        user.lifeLevel = 55;
        user.staticField = 45;
        Sord sord = new Sord();
        sord.level = 5;
        user.sord = sord;
        user.childLevel = 105;

        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(user);
        outputStream.close();

        user.staticField = 35;// static fields are not Serializable

        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserChild newUser = (UserChild) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeLevel);
        System.out.println(newUser.staticField);
        System.out.println(newUser.sord.level);
        System.out.println(newUser.childLevel);

    }
}
