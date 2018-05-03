# XWJRAuthenticationUtil
此库集成了Faceid的活体检测, 身份证和银行卡扫描库

[faceId 相关文档](https://faceid.com/pages/documents)
> 在需要引用以下库的gradle中导入以下代码
```
    allprojects {
        repositories {

            maven { url 'https://www.jitpack.io' }
        }
    }
    /** 银行卡扫描的lib*/
    compile 'com.github.xwjr.XWJRAuthenticationUtil:BankCardLib:0.1'
    /** 身份证扫描lib*/
    compile 'com.github.xwjr.XWJRAuthenticationUtil:IDCardLib:0.1'
    /** 活体检测lib*/
    compile 'com.github.xwjr.XWJRAuthenticationUtil:livenesslib:0.1'
```
