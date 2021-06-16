package ru.itmo.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chervinko <br>
 * 15.06.2021
 */
public class MyTree<T> {
    private T data = null;
    private List<MyTree<T>> children = new ArrayList<>();
    private MyTree<T> parent;

    public MyTree(T data) {
        this.data = data;
    }

    public void addChild(MyTree<T> child) {
        child.parent = this;
        this.children.add(child);
    }

    public void addChild(T data) {
        addChild(new MyTree<>(data));
    }
}
