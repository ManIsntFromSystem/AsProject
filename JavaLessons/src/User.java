import java.io.Serializable;

public class User implements Serializable {
    int lifeLevel;
    static  int staticField;

     Sord sord; //for no serializable objects // this fields doesn't have to include in equels and hashCode and toString overrides methods
}
