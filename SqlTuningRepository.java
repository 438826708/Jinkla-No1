/**
 * All rights Reserved, Designed By 华东dba
 * @Description:   sql调优系统
 * @author: zhang.xiao
 * @date:   20220423
 * @version V1.0
 */
package com.example.sqltuing.repository;

import com.example.sqltuing.enter.SqlTuning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface SqlTuningRepository extends JpaRepository<SqlTuning,Long> ,JpaSpecificationExecutor<SqlTuning> {
    @Procedure(name = "procinout")
    String procInOut(@Param("arg") String arg);

}
