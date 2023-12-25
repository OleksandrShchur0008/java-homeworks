package de.ait.homework37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class InventoryManagementTest {

    private InventoryManagement inventoryManagement;

    private MobilePhone samsungGalaxyS23Ultra;

    private MobilePhone iPhone15ProMax;

    @BeforeEach
    void setUp() {
        inventoryManagement = new InventoryManagement();
        assertEquals(0, inventoryManagement.getListMobilePhones().size());

        samsungGalaxyS23Ultra = new MobilePhone("Samsung", "S23 Ultra",
                "Android", 1399.99);
        inventoryManagement.addMobilePhone(samsungGalaxyS23Ultra);

        iPhone15ProMax =  new MobilePhone("iPhone", "15 Pro Max",
                "IOS", 1489.99);
        inventoryManagement.addMobilePhone(iPhone15ProMax);
    }

    @Test
    void addMobilePhoneHappyPath() {
        assertEquals(2, inventoryManagement.getListMobilePhones().size());
    }

    @Test
    void addMobilePhoneError() {
        MobilePhone emptyPhone = null;
        assertThrows(IllegalArgumentException.class, () -> {inventoryManagement.addMobilePhone(emptyPhone);});
        assertEquals(2, inventoryManagement.getListMobilePhones().size());
    }

    @Test
    void getMobilePhoneHappyPath() {
        assertNotNull(inventoryManagement.getMobilePhone(iPhone15ProMax.getId()));
        assertEquals(iPhone15ProMax.toString(), inventoryManagement.getMobilePhone(iPhone15ProMax.getId()));
    }

    @Test
    void getMobilePhoneError() {
        UUID fakeUuid = new UUID(10, 10);
        assertThrows(IllegalArgumentException.class, () -> {inventoryManagement.getMobilePhone(fakeUuid);});
    }

    @Test
    void updateMobilePhoneHappyPath() {
        iPhone15ProMax.setPrice(899);
        inventoryManagement.updateMobilePhone(iPhone15ProMax);

        assertTrue(inventoryManagement.updateMobilePhone(iPhone15ProMax));
        assertEquals(899, iPhone15ProMax.getPrice());
    }

    @Test
    void deleteMobilePhoneHappyPath() {
        assertEquals(2, inventoryManagement.getListMobilePhones().size());
        assertTrue(inventoryManagement.deleteMobilePhone(iPhone15ProMax.getId()));
        assertEquals(1, inventoryManagement.getListMobilePhones().size());
    }

    @Test
    void deleteMobilePhoneError() {
        assertEquals(2, inventoryManagement.getListMobilePhones().size());
        UUID fakeUuid = new UUID(10, 10);
        assertThrows(IllegalArgumentException.class, () -> {inventoryManagement.deleteMobilePhone(fakeUuid);});
        assertEquals(2, inventoryManagement.getListMobilePhones().size());
    }

    @Test
    void listMobilePhones() {
        assertEquals(2, inventoryManagement.getListMobilePhones().size());
        assertTrue(inventoryManagement.getListMobilePhones().contains(samsungGalaxyS23Ultra));
        assertTrue(inventoryManagement.getListMobilePhones().contains(iPhone15ProMax));
    }
}