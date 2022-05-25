网速实慢了，直接自己打开jar包获取源码

# Jinkla-No1
oracle sql tuning sql自动优化建议

使用说明
# sqltuning


(1)#####database

##Oracle - User/ PL/SQL / Table Store Procedures
##create user
创建用户，并且授权,建表，创建存储过程
```sh
create user sqltuningauto identified by "Sqltuningauto!20220403";
grant connect,resource,advisor  to sqltuningauto;
grant select any table to sqltuningauto;
alter user sqltuningauto quota unlimited on users;

create table SQLTUNINGAUTO.SQL_TUNING20220422
(
  time timestamp(9) default sysdate, 
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
1fd 179
6gTS59RL7oUhwthrZg87wVyxF4owg43M2q5qfC/J/2RTO/SOXCaVpjusXVeAS6XvbpZNE1vo
0WLm0rWGNvuh32CqcpjHroc42i8V+MZDzfW8cSTHoaQRW5fO6BR0j1tBHER9yFiF1uvibVZq
gjTyCa7xoj8PlAf3DHD1JQYY3kvr0dZYcA/E8LL3GvbtVTnoiVgg4hPAePw4kwNkOAkHH7dw
aMXm+lecXfQYX4BAkvsl4Wz2bbMRCkmRv+pcQ5q4vVjwZTNiBgjjJ1RDljmrpPuyxYervRKu
NDNzMxoKwgcIGtBdYqDWIT5amKnbmmiglV1vjS89Oy++m0qzUvsk8LUKbipr9muutTtMkrOE
p1XP+0aPbWA=

/


```
(2)#####programe
##configer database,ip,port,user,password

cmd里面启动jar包，对应上jar包位置，并且根据实际数据库地址，库名，端口，用户名，密码填写
例如我的jar包放在C:\Users\zhangxiao\Downloads\sqltuing\target\sqltuing-0.0.1-SNAPSHOT.jar
数据库地址是192.168.56.101，端口是1521，库名是orcl，用户名是sqltuningauto，密码是Sqltuningauto!20220403
```sh
java -jar C:\Users\zhangxiao\Downloads\sqltuing\target\sqltuing-0.0.1-SNAPSHOT.jar --spring.datasource.url=jdbc:oracle:thin:@192.168.56.101:1521/orcl --spring.datasource.username=sqltuningauto --spring.datasource.password=Sqltuningauto!20220403
```
(3)#####url
## url http://localhost:30080/
## commit sql

