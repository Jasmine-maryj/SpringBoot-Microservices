package com.dev.inventoryservice;

import com.dev.inventoryservice.entity.Inventory;
import com.dev.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args ->{
			Inventory inventory = new Inventory();
			inventory.setSkuCode("abc123");
			inventory.setQuantity(1);

			inventoryRepository.save(inventory);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("abc456");
			inventory1.setQuantity(2);

			inventoryRepository.save(inventory1);
		};
	}

}
