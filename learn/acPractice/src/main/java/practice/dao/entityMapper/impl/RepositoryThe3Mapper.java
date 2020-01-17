package practice.dao.entityMapper.impl;

import org.springframework.stereotype.Component;
import practice.dao.entity.TheEntity;
import practice.dao.entityMapper.EntityThe3Mapper;

import java.util.Map;


@Component
public class RepositoryThe3Mapper implements EntityThe3Mapper {
    @Override
    public TheEntity getEntity(Map<String, Object> param) {
        return new TheEntity("22");
    }
}
