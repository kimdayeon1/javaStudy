package com.yeon.myyjpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneBookJpaRepository extends JpaRepository<PhoneBookEntity, Long> {
}
