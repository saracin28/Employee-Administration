package com.example.demo.services;

import com.example.demo.models.Account;
import com.example.demo.models.User;
import com.example.demo.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts(){
        return (List<Account>) accountRepository.findAll();
    }

    public Account getAccountById(int id){
        return accountRepository.findById(id);
    }

    public Account getAccountByUsername(String name){
        return accountRepository.findByUsername(name);
    }

    public void postAccount(Account account){
        accountRepository.save(account);
    }

    public void deleteAccountById(int id){
        accountRepository.deleteById(id);
    }

    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }
}
