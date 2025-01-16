package org.example.Service;

import org.example.Entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface InventoryService {

    public void updateInventory(String productId, int quantity) ;
    public int getStock(String id) ;
    public void removeItem(String productId);
}
