package practice.dao;

import org.springframework.stereotype.Repository;
import practice.dao.entity.SecEntity;

import java.util.Map;

@Repository
public interface SencMapper extends BaseMapper {
    SecEntity getEntity(Map<String, Object> param);
}
