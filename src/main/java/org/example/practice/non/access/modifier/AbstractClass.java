package org.example.practice.non.access.modifier;

public abstract class AbstractClass {

    public abstract void test();
    public static Parent returnParent() {
        return new grandChild();
    }
}

abstract class Parent {
    public abstract void test();
}

abstract class Child extends Parent {
    protected abstract void sample();
}


class grandChild extends Child {

    @Override
    public void sample() {

    }

    @Override
    public void test() {

    }
}
    abstract class GreatGrandChild extends grandChild {

    @Override
    public synchronized void sample() {

    }
}

class Runner {

    public static String test = "";

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(AbstractClass.returnParent());
        }
    }
}

enum sample {

    ONE(1), TWO("two",2);

    sample(String name, int size){
            this.name = name;
            this.size = size;
    }
    sample( int size){
        this.size = size;
    }
        int size;
        String name;
}
