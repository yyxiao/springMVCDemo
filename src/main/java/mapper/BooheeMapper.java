package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Boohee;
import pojo.BooheeExample;

public interface BooheeMapper {
    int countByExample(BooheeExample example);

    int deleteByExample(BooheeExample example);

    int deleteByPrimaryKey(String taskid);

    int insert(Boohee record);

    int insertSelective(Boohee record);

    List<Boohee> selectByExampleWithBLOBs(BooheeExample example);

    List<Boohee> selectByExample(BooheeExample example);

    Boohee selectByPrimaryKey(String taskid);

    int updateByExampleSelective(@Param("record") Boohee record, @Param("example") BooheeExample example);

    int updateByExampleWithBLOBs(@Param("record") Boohee record, @Param("example") BooheeExample example);

    int updateByExample(@Param("record") Boohee record, @Param("example") BooheeExample example);

    int updateByPrimaryKeySelective(Boohee record);

    int updateByPrimaryKeyWithBLOBs(Boohee record);

    int updateByPrimaryKey(Boohee record);
}