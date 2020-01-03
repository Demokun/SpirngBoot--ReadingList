package com.manning.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/*
    定义仓库接口 ： 定义用于把Book对象持久化到数据库的仓库
    扩展了Spring Data JPA中的JpaRepository接口
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);
}
