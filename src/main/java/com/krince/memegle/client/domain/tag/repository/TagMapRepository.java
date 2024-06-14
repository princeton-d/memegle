package com.krince.memegle.client.domain.tag.repository;

import com.krince.memegle.client.domain.tag.entity.TagMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagMapRepository extends JpaRepository<TagMap, Long> {

    List<TagMap> findAllByTagId(Long tagId);

}
