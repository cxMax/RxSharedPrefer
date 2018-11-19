# RxSharedPrefer
SharedPreferences compatible with RxJava

## sharedpreference优化 ：
* sp铭文存储问题, 提供sp本地存储信息加密
* 解决sp commit的问题
    * 策略 ： 主线程apply, 已在异步线程直接commit
    * 同一文件多个写入, 统一提交, 避免每次写入提交
* add SharedPreferenceChanged Listener

## 相关开源库 ：
* https://github.com/f2prateek/rx-preferences
* https://github.com/GrenderG/Prefs
* https://github.com/PDDStudio/EncryptedPreferences

## License
   Copyright (C) cxMax
   Copyright (C) RxSharedPrefer

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.