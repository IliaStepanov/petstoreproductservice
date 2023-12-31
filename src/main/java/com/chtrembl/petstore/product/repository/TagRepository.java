package com.chtrembl.petstore.product.repository;

import com.chtrembl.petstore.product.model.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
}
