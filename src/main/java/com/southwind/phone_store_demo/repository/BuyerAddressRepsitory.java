package com.southwind.phone_store_demo.repository;

import com.southwind.phone_store_demo.entity.BuyerAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerAddressRepsitory extends JpaRepository<BuyerAddress,Integer> {
}
