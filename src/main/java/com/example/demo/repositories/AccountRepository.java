package com.example.demo.repositories;

import com.example.demo.models.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {
    List<Account> findAllByUsername(String username);

    @Query("Select account from Account account where account.accountId=?1")
    Account findById(int id);

    @Query("Select account from Account account where account.username=?1")
    Account findByUsername(String username);
}
