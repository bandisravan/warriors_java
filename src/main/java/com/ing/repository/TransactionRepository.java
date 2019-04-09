package com.ing.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ing.domain.BankInfo;

@Repository
public interface TransactionRepository extends CrudRepository<BankInfo, Long>{

	void save(Optional<BankInfo> bankinfo);

}
