package com.yeon.sbt0628.make;

import com.yeon.sbt0628.IPhoneBook;
import com.yeon.sbt0628.IPhoneBookRepository;

import java.util.List;

public class PBRedisRepository implements IPhoneBookRepository<IPhoneBook> {
    @Override
    public boolean saveData(List<IPhoneBook> listData) throws Exception {
        return false;
    }

    @Override
    public boolean loadData(List<IPhoneBook> listData) throws Exception {
        return false;
    }
}