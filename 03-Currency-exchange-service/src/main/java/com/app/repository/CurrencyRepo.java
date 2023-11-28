package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.bean1.ExchangeValue;

public interface CurrencyRepo extends JpaRepository<ExchangeValue, Long> {

}
