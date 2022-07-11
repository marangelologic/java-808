package org.example.practice.access.modifier.member.child;

import org.example.practice.access.modifier.member.parent.ParentClass;
import org.example.practice.access.modifier.member.parent.ProtectedParent;

public class ChildClass extends Protected {

    public void main(String[] args) {
        Protected pro = new Protected();
        pro.returnSomething();
        ProtectedParent pp = new ProtectedParent();

        ParentClass pc = new ParentClass();
        

    }

    private String sample() {
        return "me";
    }

}
