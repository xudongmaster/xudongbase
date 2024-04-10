# xudongbase

# 1 介绍
工具类：默认值工具类

# 2 软件架构
Hutool、lombox
# 3 仓库地址
https://github.com/xudongmaster/xudongbase

# 4 个人博客
https://blog.csdn.net/qq_38974638

# 5 QQ交流群
644094294

# 6 结构
## 6.1 文件结构
### common.util
#### DefaultValueUtil：默认值工具类
场景：字段取值

问题：字段取值容易出现空指针异常
#### KeyUtil：key工具类
场景：编码过程中经常碰到多维度的数据获取，我们一般使用map，然后把多个维度组装起来成key，这样方便获取

问题：每次组装key都是重复工作，而且还容易出错，还难以理解