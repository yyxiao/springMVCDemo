package cn.springmvc.dao;

import cn.springmvc.model.ProSupplierMaterial;
import cn.springmvc.model.ProSupplierMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProSupplierMaterialMapper {
    int countByExample(ProSupplierMaterialExample example);

    int deleteByExample(ProSupplierMaterialExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProSupplierMaterial record);

    int insertSelective(ProSupplierMaterial record);

    List<ProSupplierMaterial> selectByExample(ProSupplierMaterialExample example);

    ProSupplierMaterial selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProSupplierMaterial record, @Param("example") ProSupplierMaterialExample example);

    int updateByExample(@Param("record") ProSupplierMaterial record, @Param("example") ProSupplierMaterialExample example);

    int updateByPrimaryKeySelective(ProSupplierMaterial record);

    int updateByPrimaryKey(ProSupplierMaterial record);
}