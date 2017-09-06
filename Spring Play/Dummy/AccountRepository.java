package com.kgfsl.newrequestmapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


/**
 * @author Baraneetharan R
 *
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

}