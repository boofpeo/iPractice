package practice.dao;

import org.springframework.stereotype.Repository;
import practice.dao.entity.TheEntity;

import java.util.Map;

@Repository
public interface TheMapper extends BaseMapper {
    TheEntity getEntity(Map<String, Object> param);
}
