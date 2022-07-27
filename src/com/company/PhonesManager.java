package com.company;

import java.util.ArrayList;

public class PhonesManager {
    private ArrayList<Phone> phones;

    public PhonesManager() {
        phones = new ArrayList<>();
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public int getSize() {
        return phones.size();
    }

    public Phone getPhone(int index){
        return phones.get(index);
    }

}
