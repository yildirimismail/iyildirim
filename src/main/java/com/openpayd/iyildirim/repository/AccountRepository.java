package com.openpayd.iyildirim.repository;

import com.openpayd.iyildirim.entity.Account;
import com.openpayd.iyildirim.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
