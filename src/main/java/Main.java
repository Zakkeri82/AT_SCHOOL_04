import somepackage.Other;
import somepackage.Some;
import somethinggreen.AnnotationForExaple;
import somethinggreen.Contract;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Contract.staticMethod("Строка для вывода в консоль");
        Other.saySomthing();
        Some some = new Some("secret");
        some.soTellMeAboutInterfaces();
        System.out.println(some.toString());
        Pash pash = new Pash();
        System.out.println(pash.getClass().getAnnotation(AnnotationForExaple.class).description());
        System.out.println(Arrays.toString(some.getClass().getAnnotations()));
        System.out.println(some.getДаТакТожеМожно());
    }
}
