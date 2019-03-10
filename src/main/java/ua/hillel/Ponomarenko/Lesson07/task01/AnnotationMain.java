package ua.hillel.Ponomarenko.Lesson07.task01;
/*Написать собственную аннотацию которая принимает массив строк.
Аннотировать какой либо класс с помощью этой аннотации и исследовать с помощью
рефлексии этот класс получив массив строк введенный в аннотации.*/
import java.lang.annotation.*;
import java.lang.reflect.Method;


public class AnnotationMain {
    @StringArr(value = {"jndjfj", "jsfnas", "ksfkals"})
    public static void main(String[] args) {
        Class annotationMainClass = AnnotationMain.class;
        Method[] methods = annotationMainClass.getMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
        }
    }
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface StringArr{
    String[] value();
}