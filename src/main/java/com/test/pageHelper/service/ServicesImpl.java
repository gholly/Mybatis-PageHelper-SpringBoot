package com.test.pageHelper.service;

import com.test.pageHelper.dao.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by guanguan on 2017/7/21.
 */
@Service
public class ServicesImpl<T> implements Services<T> {
    @Autowired
    public Mappers<T> mappers;

    @Override
    public void insert(T t) {
        mappers.insert(t);

    }

    @Override
    public Integer insertBatch(List<T> t) {
        return mappers.insertBatch(t);
    }

    @Override
    public List<T> findBy(HashMap<?, ?> params) {
        return mappers.findBy(params);
    }

    @Override
    public void update(T t) {
        mappers.update(t);

    }

    @Override
    public void delete(Integer id) {
        mappers.delete(id);

    }

    @Override
    public void deleteBatch(Object[] t) {
        mappers.deleteBatch(t);

    }

    @Override
    public T getEntityById(Integer id) {
        return (T) mappers.getEntityById(id);
    }

    @Override
    public Integer countBy(HashMap<?, ?> params) {
        return mappers.countBy(params);
    }


}
