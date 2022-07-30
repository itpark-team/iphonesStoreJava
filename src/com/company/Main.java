package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        /*
        PhonesManager phonesManager = new PhonesManager(PhonesManager.getListTestPhones());


//        String model = Util.inputString("Введите модель телефона: ");
//        int price = Util.inputInt("Введите цену телефона:", 1, 1000000);
//        int quantity = Util.inputInt("Введите кол-во добавляемых телефонов: ", 1, 500);
//        Phone phone = new Phone(model, price, quantity);

        for (int i = 0; i < phonesManager.getSize(); i++) {
            System.out.println(phonesManager.getPhone(i));
        }

//запись в файл
        phonesManager.savePhonesToTxtFile("phones.txt");
        */

        PhonesManager phonesManager = new PhonesManager();

        phonesManager.loadPhonesFromTxtFile("phones.txt");

        for (int i = 0; i < phonesManager.getSize(); i++) {
            System.out.println(phonesManager.getPhone(i));
        }

    }
}
