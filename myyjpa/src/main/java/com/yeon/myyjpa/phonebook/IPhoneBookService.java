package com.yeon.myyjpa.phonebook;

import com.yeon.myyjpa.cat.ICategory;

import java.util.List;

public interface IPhoneBookService<T> {
    T findById(Long id);
    List<T> getAllList();
    T insert(T dto) throws Exception;
    boolean remove(Long id) throws Exception;
    T update(Long id, T dto) throws Exception;
    List<T> getListFromName(String findName);
    List<T> getListFromGroup(ICategory phoneGroup);
    List<T> getListFromPhoneNumber(String findPhone);
    List<T> getListFromEmail(String findEmail);
}
