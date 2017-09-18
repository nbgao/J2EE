generator.properties文件，这里面保存的是连接数据库的相关信息，是在使用mybatis-generator这个功能的时候用到的；
之前的jdbc.properties是系统运行时用到的。二者信息差不多，图方便的话，也可以将两个合并成一个文件，分开写的话，好实现可插拔。

* 如果需要更新表，或者新建表，删除dao-*mapper,entity-*,sqlmap-*Mapper.xml,更改generator.properties文件的table