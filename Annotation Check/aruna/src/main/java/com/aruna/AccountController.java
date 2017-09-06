package com.aruna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.aruna.AccountRepository;
/**
 * @author Baraneetharan R
 *
 */
@RestController
public class AccountController {

@Autowired
AccountRepository accountRepository;

@GetMapping("/accounts")
public List<Account> all() {
return accountRepository.findAll();
}

@PostMapping("/account")
public Account create(@RequestBody Account account) {
return accountRepository.saveAndFlush(account);
}

@GetMapping("/account/{accountId}")
public Account get(@PathVariable Long accountId) {
return accountRepository.findOne(accountId);
}

@PutMapping("/account/{accountId}")
public Account update(@RequestBody Account account, @PathVariable Long accountId) {
account.setAccountId(accountId);
return accountRepository.saveAndFlush(account);
}

@DeleteMapping("/account/{accountId}")
public void delete(@PathVariable Long accountId) {
accountRepository.delete(accountId);
}
}
