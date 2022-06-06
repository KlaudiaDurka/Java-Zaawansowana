package zadania.refleksja;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefleksjaMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> clazz = Class.forName("pl.sda.refleksja.Car");

        Method[] declaredMethods = clazz.getDeclaredMethods();
        Field[] declaredFields = clazz.getDeclaredFields();

        System.out.println("Metody klasy: ");
        for (Method method : declaredMethods) {
            System.out.println("Metoda " + method.getName());
        }

        System.out.println("------------------");
        System.out.println("Pola klasy: ");
        for(Field field : declaredFields){
            System.out.println("Pole " + field.getName());
        }

        System.out.println("------------------");

        Car car = (Car) clazz.getDeclaredConstructor().newInstance();
        Method carNameMethod = clazz.getDeclaredMethod("setName", String.class);

        carNameMethod.invoke(car, "grat");

        System.out.println(car);
    }
}
