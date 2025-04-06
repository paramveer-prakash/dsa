package com.param.designpattern.facade;

public class ShoppingFacade {

    private InventoryService inventoryService;
    private NotificationService notificationService;

    public ShoppingFacade(){
        inventoryService = new InventoryService();
        notificationService = new NotificationService();
    }

    public int getInventory(String sku){
        System.out.println("Checking inventory");
        if(!inventoryService.isInStock(sku)){
            notificationService.notifiy();
        }

        return inventoryService.getInventory();
    }
}
