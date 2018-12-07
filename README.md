# RxSharedPrefer
SharedPreferences compatible with RxJava

## sharedpreference优化 ：
* sp明文存储问题, 提供sp本地存储信息加密
* 解决sp commit的问题
    * 策略 ： 主线程apply, 已在异步线程直接commit
    * 同一文件多个写入, 统一提交, 避免每次写入提交
* add SharedPreferenceChanged Listener
* 多进程读取问题， 数据无法在多进程同步。
    * 其他应用进程，根本没办法获取到
    * 本地application的进程， 每次获取SharedPreferences都会检测文件是否改变，只要读的时候另一进程在写，就会导致写丢失
* 性能问题 :
    * IO瓶颈 : 非增量写入，多个写入操作请用apply，一次提交
    * 锁瓶颈 :
        * android 9.0 最新代码已经修复，读写锁分离
        * SP的get操作，会锁定SharedPreferences对象，互斥其他操作。
        * SP的put操作，getEditor及commitToMemory会锁定SharedPreferences对象，put操作会锁定Editor对象，写入磁盘更会锁定一个写入锁。


## 相关开源库 ：
* https://github.com/f2prateek/rx-preferences
* https://github.com/GrenderG/Prefs
* https://github.com/PDDStudio/EncryptedPreferences
* https://github.com/seven456/MultiprocessSharedPreferences/

## 相关文章 :
* [SharedPreferences 多进程问题](https://www.jianshu.com/p/2096c7fb9f64)
* [Android SharePreferences 源码分析 及优化建议](https://juejin.im/entry/58b0fc2a128fe1006cc1e966)

## License
   MIT