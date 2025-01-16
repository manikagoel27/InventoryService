package org.example.Repository;

import org.example.Entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class InventoryDaoImpl{
    Map<String, Integer> inventoryMap = new HashMap<>();

    @PostConstruct
    public void init(){
        inventoryMap.put("1", 10);
        inventoryMap.put("2", 10);
    }

    public void updateInventory(String productId, int quantity) {
        if(!inventoryMap.containsKey(productId)) {
            inventoryMap.put(productId, quantity);
        } else {
            inventoryMap.put(productId, quantity + inventoryMap.get(productId));
        }
    }
    public int getProduct(String productId) {
        if(!inventoryMap.containsKey(productId)) {
            // Throws exception
        } else {
            return inventoryMap.get(productId);
        }
        return 0;
    }
    public void removeItem(String productId) {
        if(!inventoryMap.containsKey(productId)) {
            System.out.println("Product Doesn't exists");
        } else {
            inventoryMap.remove(productId);
        }
    }
}
