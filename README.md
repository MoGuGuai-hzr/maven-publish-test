# maven项目发布测试

## gitee

码云将域名`https://gitee.com/${user_account}/${project_name}/raw/${branch}`设为访问原始文件的地址, 可以利用它实现一个简单的 maven 仓库. 其中,

- `${user_account}`: 该字段为账户名或组织名(看仓库属于谁);
- `${project_name}`: 指仓库名称;
- `${branch}`: 为所选的分支名称.

以本仓库为例, 在`export/just/test/groupid/math-util/1.0.0`下有包`math-util-1.0.0.jar`, 可以通过在`pom.xml`中添加仓库信息, 然后通过依赖引用:

```xml
<!-- 
 ======================================================================
 仓库信息: 仅针对第三方仓库或私有仓库, 如果是发布到中央仓库(https://repo1.maven.org/maven2/), 则不需要该信息.
 ======================================================================
 -->
<repositories>
    <!-- gitee -->
    <repository>
        <id>gitee-repository</id>
        <name>The Maven Repository on Gitee</name>
        <url>https://gitee.com/moguguai/maven-publish-test/raw/main/export</url>
    </repository>
</repositories>

<!-- 
 ======================================================================
        项目的依赖 
 ======================================================================
 -->
<!-- 指定groupId, artifactId, version, 一般可以在 https://mvnrepository.com/ 搜索, 直接复制 -->
<dependencies>
    <dependency>
        <groupId>just.test.groupid</groupId>
        <artifactId>math-util</artifactId>
        <version>1.0.0</version>
    </dependency>
</dependencies>
```

## github

github 将域名`https://raw.githubusercontent.com/${user_account}/${project_name}/${branch}`设为访问原始文件的地址, 因此只需修改其中的仓库信息:

```xml
<repository>
    <id>github-repository</id>
    <name>The Maven Repository on Github</name>
    <url>https://raw.githubusercontent.com/MoGuGuai-hzr/maven-publish-test/main/export</url>
</repository>
```











