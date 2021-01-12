package com.example.demo.repositories;

import com.example.demo.models.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {
    List<Account> findAllByName(String name);

    @Query("Select account from Account account where account.id=?1")
    Account findById(int id);

    @Query("Select account from Account account where account.name=?1")
    Account findByName(String name);
}
