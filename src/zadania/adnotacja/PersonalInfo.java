package zadania.adnotacja;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.time.Month;

@Target(value = {ElementType.FIELD, ElementType.PARAMETER})
public @interface PersonalInfo {
    String[] names() default  {"Adam", "Kasia"};
    String[] dates();
    Month month();
}
