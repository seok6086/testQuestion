package test;

public class Question3 {
    public static void main(String[] args) {
        GenericsClass<Integer> g1 = new GenericsClass<>();

    }
}
class GenericsClass<E>{

    E e;

    public E test4(E e){
        return e;
    }

    public<T> T test3(T t){
        return t;
    }
}
