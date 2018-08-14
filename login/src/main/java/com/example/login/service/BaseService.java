package com.example.login.service;


import com.example.login.jpaRepository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;


@Service
public abstract class BaseService<T extends Serializable,ID extends Serializable> {


    @Autowired
    MyRepository<T,ID> basicDao;

    public List<T> findAllT() {
        return basicDao.findAll();
    }
    public List<T> findAll(Specification specification){
        return basicDao.findAll(specification);
    }

    public Page<T> findAllT(Pageable pageable) {
        return this.basicDao.findAll(pageable);
    }

    public void add(T t) {
        this.basicDao.save(t);
    }

    public void update(T t) {
        this.basicDao.saveAndFlush(t);
    }

    public void deleteById(T t) {
        this.basicDao.delete(t);
    }

    public Specification<T> inAndQuery(){
        return new Specification<T>() {
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Predicate predicate = null;
                query.where(predicate);
                return query.getRestriction();
            }
        };

    }


}