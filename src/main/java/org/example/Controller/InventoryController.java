package org.example.Controller;

import org.example.Entity.Product;
import org.example.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    InventoryService inventoryService;

    @PostMapping("/{productId}")
    public ResponseEntity<String> updateStock(@PathVariable String productId, @RequestParam int quantity) {
        inventoryService.updateInventory(productId, quantity);
        return ResponseEntity.ok("Stock updated successfully");
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Integer> getStock(@PathVariable String productId) {
        return ResponseEntity.ok(inventoryService.getStock(productId));
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<String> removeProduct(@PathVariable String productId) {
        inventoryService.removeItem(productId);
        return ResponseEntity.ok("Product removed Successfully");
    }
}
