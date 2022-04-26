# sqltuning


(1)#####database

##Oracle - User/ PL/SQL / Store Procedures
##create user
创建用户，并且授权,创建存储过程
```sh
create user sqltuningauto identified by "Sqltuningauto!20220403";
grant connect,resource,advisor  to sqltuningauto;
alter user sqltuningauto quota unlimited on users;

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

cmd里面启动jar包，对应上jar包位置，并且根据实际数据库地址，库名，端口，用户名，密码填写
例如我的jar包放在C:\Users\zhangxiao\Downloads\sqltuing\target\sqltuing-0.0.1-SNAPSHOT.jar
数据库地址是192.168.56.102，端口是1521，库名是orcl，用户名是sqltuningauto，密码是Sqltuningauto!20220403
```sh
java -jar C:\Users\zhangxiao\Downloads\sqltuing\target\sqltuing-0.0.1-SNAPSHOT.jar --spring.datasource.url=jdbc:oracle:thin:@192.168.56.101:1521/orcl --spring.datasource.username=sqltuningauto --spring.datasource.password=Sqltuningauto!20220403
```
(3)#####url
## url http://localhost:30080/
## commit sql

