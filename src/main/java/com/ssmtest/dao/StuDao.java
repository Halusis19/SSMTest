package com.ssmtest.dao;

import com.ssmtest.pojo.Stu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StuDao {
    @Select("select stu_id as id," +
            "stu_name as name," +
            "stu_gender as gender," +
            "stu_age as age," +
            "stu_ctime as createtime from stu")
    List<Stu> selectAll();
    @Insert("insert into stu values (#{id},#{name},#{gender},#{age},#{createtime})")
    public void save(Stu stu);
    @Delete("delete from stu where stu_id = #{id}")
    public void delete(int id);
    @Update("update stu set " +
            "stu_name = #{name}," +
            "stu_gender = #{gender}," +
            "stu_age = #{age} where stu_id = #{id}")
    public void update(Stu stu);
    @Select("select * from stu where stu_id = #{id}")
    public Stu selectById(int id);

}
