# sqltuning


(1)#####database  

##Oracle - User/ PL/SQL / Store Procedures
##create user
创建用户，并且授权,创建表，创建存储过程
```sh
create user sqltuningauto identified by "Sqltuningauto!20220403";
grant connect,resource,advisor  to sqltuningauto;
alter user sqltuningauto quota unlimited on users;

create table SQLTUNINGAUTO.SQL_TUNING20220422
(
  time timestamp(9) default sysdate，
  content CLOB
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

CREATE OR REPLACE PROCEDURE sqltuningauto.procinout wrapped
 a000000
 354
 abcd
 abcd
 abcd
 abcd
 abcd
 abcd
 abcd
 abcd
 abcd
 abcd
 abcd
 abcd
 abcd
 abcd
 abcd
 7
 1fb 175
 n4eBTNMbYIU8STTZaEBbt7+3NdMwg43M2q5qfC/J/2RTO/SOXK9LUMVaSsc2mSQlTkQyTlAm
menj+apuysr61DD+7bmzt+q0y0al+VKtkJrRsXJxCVuDN2W8Pr0dzjewUaakZbZCuIMy9wEw
N+qh/JPxhSzl4CTgJoiQoFPmq4qg2XBgtD15C4QUKaMgxDc+QosTHug0pDpLXzE9fC1qrxrf
SJRrkW5emzbp1O+Ec+feN/ENlRGgPV7B4sW1YAyBfsh/eThKgMNqlxB//03nEWkICVq0EgYN
uXhJVYkAX1sQZiBrpBqhYINEFPnU6KQbDU1GTbkChY2/X0qZzqHkD11WvUyZEJJhnylP+FaY
OuGcrxiP
/


```
(2)#####programe  
##configer database,ip,port,user,password  
jar包地址https://github.com/438826708/Jinkla-No1/blob/main/sqltuing-0.0.1-SNAPSHOT.jar  

cmd里面启动jar包，对应上jar包位置，并且根据实际数据库地址，库名，端口，用户名，密码填写
例如我的jar包放在C:\Users\zhangxiao\Downloads\sqltuing\target\sqltuing-0.0.1-SNAPSHOT.jar
数据库地址是192.168.56.102，端口是1521，库名是orcl，用户名是sqltuningauto，密码是Sqltuningauto!20220403


```sh
java -jar C:\Users\zhangxiao\Downloads\sqltuing\target\sqltuing-0.0.1-SNAPSHOT.jar --spring.datasource.url=jdbc:oracle:thin:@192.168.56.102:1521/orcl --spring.datasource.username=sqltuningauto --spring.datasource.password=Sqltuningauto!20220403
```

正常启动日志


C:\Users\zhangxiao>java -jar C:\Users\zhangxiao\Downloads\sqltuing\target\sqltuing-0.0.1-SNAPSHOT.jar --spring.datasource.url=jdbc:oracle:thin:@192.168.56.102:1521/orcldb --spring.datasource.username=sqltuningauto --spring.datasource.password=Sqltuningauto!20220403

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.6)

2022-04-26 17:55:44.703  INFO 8692 --- [           main] c.example.sqltuing.SqltuingApplication   : Starting SqltuingApplication v0.0.1-SNAPSHOT using Java 1.8.0_241 on LAPTOP-S1O6UIDA with PID 8692 (C:\Users\zhangxiao\Downloads\sqltuing\target\sqltuing-0.0.1-SNAPSHOT.jar started by zhangxiao in C:\Users\zhangxiao)
2022-04-26 17:55:44.706  INFO 8692 --- [           main] c.example.sqltuing.SqltuingApplication   : No active profile set, falling back to 1 default profile: "default"
2022-04-26 17:55:45.450  INFO 8692 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode!
2022-04-26 17:55:45.452  INFO 8692 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JDBC repositories in DEFAULT mode.
2022-04-26 17:55:45.488  INFO 8692 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data JDBC - Could not safely identify store assignment for repository candidate interface com.example.sqltuing.repository.SqlTuningRepository. If you want this repository to be a JDBC repository, consider annotating your entities with one of these annotations: org.springframework.data.relational.core.mapping.Table.
2022-04-26 17:55:45.490  INFO 8692 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 29 ms. Found 0 JDBC repository interfaces.
2022-04-26 17:55:45.504  INFO 8692 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode!
2022-04-26 17:55:45.505  INFO 8692 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2022-04-26 17:55:45.535  INFO 8692 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 24 ms. Found 1 JPA repository interfaces.
2022-04-26 17:55:47.481  INFO 8692 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 30080 (http)
2022-04-26 17:55:47.495  INFO 8692 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-04-26 17:55:47.496  INFO 8692 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.60]
2022-04-26 17:55:47.613  INFO 8692 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-04-26 17:55:47.613  INFO 8692 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2842 ms
2022-04-26 17:55:48.031  INFO 8692 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2022-04-26 17:55:48.100  INFO 8692 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.7.Final
2022-04-26 17:55:48.269  INFO 8692 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2022-04-26 17:55:48.377  INFO 8692 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2022-04-26 17:55:50.083  INFO 8692 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2022-04-26 17:55:50.110  INFO 8692 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.Oracle12cDialect
2022-04-26 17:55:50.858  INFO 8692 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2022-04-26 17:55:50.865  INFO 8692 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2022-04-26 17:55:51.334  WARN 8692 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2022-04-26 17:55:51.631  INFO 8692 --- [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index
2022-04-26 17:55:52.027  INFO 8692 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 30080 (http) with context path ''
2022-04-26 17:55:52.044  INFO 8692 --- [           main] c.example.sqltuing.SqltuingApplication   : Started SqltuingApplication in 7.816 seconds (JVM running for 8.312)  
(3)#####打开网址  
##  http://localhost:30080/

(4)## 提交要优化的 sql  


