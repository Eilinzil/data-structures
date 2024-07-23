package io.jyotirmay.ds.list;

import java.io.Serializable;

public interface LinkedList<E extends Comparable<E>> extends Serializable {

    int size();

    boolean isEmpty();

    void addFirst(E data);

    void addLast(E data);

    E getFirst();

    E getLast();

    E removeFirst();

    E removeLast();
}
