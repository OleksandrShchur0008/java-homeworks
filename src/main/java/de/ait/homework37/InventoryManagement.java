package de.ait.homework37;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InventoryManagement {

    private List<MobilePhone> mobilePhonesInventory = new ArrayList<>();

    //добавление нового мобильного телефона в список.
    public void addMobilePhone(MobilePhone phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Incorrect Parameters.");
        }
        mobilePhonesInventory.add(phone);
    }

    //поиск и получение мобильного телефона по ID.
    public String getMobilePhone(UUID id) {
        for (MobilePhone phone : mobilePhonesInventory) {
            if (phone.getId().equals(id)) {
                return phone.toString();
            }
        }
        throw new IllegalArgumentException("Phone with ID: " + id + " not found. Try again.");
    }

    //обновление информации о существующем мобильном телефоне.
    public boolean updateMobilePhone(MobilePhone phone) {
        for (int i = 0; i < mobilePhonesInventory.size(); i++) {
            if (mobilePhonesInventory.get(i).getId() == phone.getId()) {
                mobilePhonesInventory.set(i, phone);
                return true;
            }
        }
        return false;
    }

    //удаление мобильного телефона по ID.
    public boolean deleteMobilePhone(UUID id) {
        for (MobilePhone phone : mobilePhonesInventory) {
            if (phone.getId().equals(id)) {
                mobilePhonesInventory.remove(phone);
                return true;
            }
        }
        throw new IllegalArgumentException("Phone with ID: " + id + " not found. Try again.");
    }

    /*получение списка всех мобильных телефонов в инвентаре
    способом предоставления копии листа для сохранности данных.*/
    public List<MobilePhone> getListMobilePhones() {
        return new ArrayList<>(mobilePhonesInventory);
    }
}

