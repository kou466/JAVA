# 자바응용 중간고사 풀이

### 1번
```JAVA
   abstract class Car {
    int milage;
    String name;

    public Car(String name, int milage) {
        this.name = name;
        this.milage = milage;
    }

    abstract int rentRate();
}

class Matiz extends Car {

    public Matiz(String name, int milage) {
        super(name, milage);
    }

    @Override
    int rentRate() {
        int rate = (milage > 500) ? 100000 : 70000;
        return rate;
    }

    public String toString() {
        int rate = this.rentRate();
        return "The rent rate of " + this.name + "'s" + " Matiz is " + rate + " Won.";
    }
}

class Sonata extends Car {

    public Sonata(String name, int milage) {
        super(name, milage);
    }

    @Override
    int rentRate() {
        int rate = (milage > 500) ? 100000 : 70000;
        return (int) Math.round(rate * 1.5);
    }

    public String toString() {
        int rate = this.rentRate();
        return "The rent rate of " + this.name + "'s" + " Sonata is " + rate + " Won.";
    }
}
```
### 2번
```
This is A
This is A1
This is A
This is A11
This is A
```
### 3번
(1) return left.eval() + right.eval();
(2) return left.eval() + right.eval();

### 4번
(Car s, Car m) -> s.milage.compareTo(m.milage)

### 5번
(b)

### 6번
list.stream().filter(x -> x % 3 == 0).map(x -> x * x).forEach(System.out::println)

### 7번
21 12 1 22 13 1

### 8번
(1) map(A::getName).forEach(System.out::println);
(2) map(A::getAge).forEach(System.out::println);

### 9번
```JAVA
public class test<T, U> {
    public static void main(String[] args) {

        Test one = (a, b) -> a;
        System.out.println(one.func(10, true));
        System.out.println(one.func(true, 10));

        System.out.println();

        test<Integer, Boolean> two = new test<>();
        System.out.println(two.first(10, true));
        System.out.println(two.first(true, 10));
    }

    public <T, U> T first(T x, U y) {
        return x;
    }
}
```

### 10번
Integer, Character, Boolean

### 11번
Set은 중복을 허용하지 않고 순서가 없지만, List는 중복을 허용하고 저장되는 순서가 유지된다.
