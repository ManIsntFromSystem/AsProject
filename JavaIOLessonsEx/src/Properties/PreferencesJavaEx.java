package Properties;

import java.util.prefs.Preferences;

public class PreferencesJavaEx {
    public static void main(String[] args) {
        Preferences root = Preferences.systemRoot();
        Preferences user = Preferences.userRoot();
        user.put("key1", "value1");
        System.out.println(user.get("key1", "def1"));
        Preferences nod = user.node("myPackage");
        nod.put("one", "1");
        System.out.println(nod.get("one",  "2"));
        Preferences myPackage = Preferences.userNodeForPackage(PropeetiesLesson.class);
    }
}
