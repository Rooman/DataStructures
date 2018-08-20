package com.trubin.datastructures.list;

public class ArrayList implements List {
    private static final int INITIAL_CAPACITY = 5;

    private Object[] array;
    private int size;

    public ArrayList(){
    //    array = new Object[INITIAL_CAPACITY];
        this(INITIAL_CAPACITY);
    }

    public ArrayList(int capacity){
        array = new Object[capacity];
    }

    

    @Override
    public void add(Object value) {
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(Object value, int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }
}
