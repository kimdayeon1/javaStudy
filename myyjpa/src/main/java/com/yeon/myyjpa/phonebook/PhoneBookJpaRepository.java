package com.yeon.myyjpa.phonebook;

import com.yeon.myyjpa.cat.CategoryEntity;
import com.yeon.myyjpa.cat.ICategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneBookJpaRepository extends JpaRepository<PhoneBookEntity, Long> {
    List<PhoneBookEntity> findAllByNameContains(String findName);
    List<PhoneBookEntity> findAllByCategory(CategoryEntity category);
    List<PhoneBookEntity> findAllByPhoneNumberContains(String phoneNumber);
    List<PhoneBookEntity> findAllByEmailContains(String email);
}
