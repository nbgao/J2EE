
File:jdbc.properties

1.数据库密码过于简单，配置服务器时，要更改jdbc.properties
2.最大连接数等问题，以后会有很多人访问
{
#定义初始连接数
initialSize=0
#定义最大连接数
maxActive=20
#定义最大空闲
maxIdle=20
#定义最小空闲
minIdle=1
#定义最长等待时间
maxWait=60000
}