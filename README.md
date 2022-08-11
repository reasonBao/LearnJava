# LearnJava
没想写什么，就是你看什么看，赶紧学完Java基本知识去
### .iml文件
idea 对module 配置信息之意， infomation of module。每个模块都有一个iml文件。

IDEA中的.iml文件是项目标识文件，缺少了这个文件，IDEA就无法识别项目。跟Eclipse的.project文件性质是一样的。并且这些文件不同的设备上的内容也会有差异，所以我们在管理项目的时候，.project和.iml文件都需要忽略掉。
————————————————
版权声明：本文为CSDN博主「顺其自然~」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/fuhanghang/article/details/108766128
### .idea文件夹：存放项目的配置信息
包括数据源，类库，项目字符编码，历史记录，版本控制信息等。
# 基础
## public static
Java入口程序规定的方法必须是静态方法，方法名必须为main，括号内的参数必须是String数组。
## 注释
![img.png](img.png)
## 基本数据类型
基本数据类型是CPU可以直接进行运算的类型。Java定义了以下几种基本数据类型：

整数类型：byte，short，int，long

浮点数类型：float，double

字符类型：char

布尔类型：boolean
## 形象的图
![img_1.png](img_1.png)
## 布尔类型呢？
Java语言对布尔类型的存储并没有做规定，因为理论上存储布尔类型只需要1 bit，但是通常JVM内部会把boolean表示为4字节整数。
## 除了以上，均是引用类型。
引用类型的变量类似于C语言的指针，它内部存储一个“地址”，指向某个对象在内存的位置
## 常量
如果加上final修饰符，这个变量就变成了常量
## var关键字？
![img_2.png](img_2.png)

