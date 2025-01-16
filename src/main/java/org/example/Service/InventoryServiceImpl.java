package org.example.Service;

import org.example.Repository.InventoryDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService{

    @Autowired
    InventoryDaoImpl inventoryDaoImpl;

    @Override
    public void updateInventory(String productId, int quantity) {
        inventoryDaoImpl.updateInventory(productId, quantity);
    }

    @Override
    public int getStock(String id) {
        return inventoryDaoImpl.getProduct(id);
    }

    @Override
    public void removeItem(String productId) {
        inventoryDaoImpl.removeItem(productId);
    }
}
