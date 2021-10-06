package com.lesson;

import java.util.ArrayList;
import java.util.List;

public class LocalMemoryDataService implements  DataService {
    private List<String> list = new ArrayList<>();

    @Override
    public void add(String text) throws LowMemoryException {
        if (list.size() > 4){
            throw new LowMemoryException();
        }else {
            list.add(text);
        }
    }

    @Override
    public String get() throws NoSuchElementException {
        if (list.size() < 1){
            throw new NoSuchElementException();
        }else {
            return list.remove(0);
        }
    }
}
