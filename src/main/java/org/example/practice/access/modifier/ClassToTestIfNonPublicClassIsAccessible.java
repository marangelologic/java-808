package org.example.practice.access.modifier;

public class ClassToTestIfNonPublicClassIsAccessible implements nonPublicInterface {

    public void test() {
        nonPublicClass t = new nonPublicClass();
        t.Mar022022();
    }
}
