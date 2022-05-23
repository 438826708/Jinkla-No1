/**
 * All rights Reserved, Designed By 华东dba
 * @Description:   sql调优系统
 * @author: zhang.xiao
 * @date:   20220423
 * @version V1.0
 */
package com.example.sqltuing.enter;



import javax.persistence.*;
import java.sql.Clob;

@Table(name = "sql_tuning2022null")
@Entity
@NamedStoredProcedureQueries(
        {@NamedStoredProcedureQuery(name = "procinout",
                procedureName = "procinout",
                parameters={
                        @StoredProcedureParameter(mode=ParameterMode.IN,name="arg",type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT,name="res",type=String.class)
                })
            })
public class SqlTuning {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Clob content;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Clob getContent() {
        return content;
    }
    public void setContent(Clob content) {
        this.content = content;
    }

}