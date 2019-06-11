
# Errors

1. When I use `name` with `@Procedure` annotation, or change it `procedureName` I get following error 

Usage1:
```java
@Procedure(name="Category.getAllCategoriesThroughStoredProcedure")
    List<Category> getAllCategoriesThroughStoredProcedure();
```

Usage2:
```java
   @Procedure(procedureName="get_all_categories")
    List<Category> getAllCategoriesThroughStoredProcedure();
```

**Error Message**:
```
/Library/Java/JavaVirtualMachines/amazon-corretto-11.jdk/Contents/Home/bin/java -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:60640,suspend=y,server=n -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true -javaagent:/Users/pjadda/Library/Caches/IntelliJIdea2019.1/captureAgent/debugger-agent.jar -Dfile.encoding=UTF-8 -classpath "/Users/pjadda/IdeaProjects/SpringDataDemo/target/classes:/Users/pjadda/.m2/repository/org/springframework/boot/spring-boot-starter-web/2.1.5.RELEASE/spring-boot-starter-web-2.1.5.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/boot/spring-boot-starter/2.1.5.RELEASE/spring-boot-starter-2.1.5.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.1.5.RELEASE/spring-boot-starter-logging-2.1.5.RELEASE.jar:/Users/pjadda/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/pjadda/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/pjadda/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.11.2/log4j-to-slf4j-2.11.2.jar:/Users/pjadda/.m2/repository/org/apache/logging/log4j/log4j-api/2.11.2/log4j-api-2.11.2.jar:/Users/pjadda/.m2/repository/org/slf4j/jul-to-slf4j/1.7.26/jul-to-slf4j-1.7.26.jar:/Users/pjadda/.m2/repository/javax/annotation/javax.annotation-api/1.3.2/javax.annotation-api-1.3.2.jar:/Users/pjadda/.m2/repository/org/yaml/snakeyaml/1.23/snakeyaml-1.23.jar:/Users/pjadda/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.1.5.RELEASE/spring-boot-starter-json-2.1.5.RELEASE.jar:/Users/pjadda/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.8/jackson-databind-2.9.8.jar:/Users/pjadda/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/Users/pjadda/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.8/jackson-core-2.9.8.jar:/Users/pjadda/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.9.8/jackson-datatype-jdk8-2.9.8.jar:/Users/pjadda/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.9.8/jackson-datatype-jsr310-2.9.8.jar:/Users/pjadda/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.9.8/jackson-module-parameter-names-2.9.8.jar:/Users/pjadda/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.1.5.RELEASE/spring-boot-starter-tomcat-2.1.5.RELEASE.jar:/Users/pjadda/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.19/tomcat-embed-core-9.0.19.jar:/Users/pjadda/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/9.0.19/tomcat-embed-el-9.0.19.jar:/Users/pjadda/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/9.0.19/tomcat-embed-websocket-9.0.19.jar:/Users/pjadda/.m2/repository/org/hibernate/validator/hibernate-validator/6.0.16.Final/hibernate-validator-6.0.16.Final.jar:/Users/pjadda/.m2/repository/javax/validation/validation-api/2.0.1.Final/validation-api-2.0.1.Final.jar:/Users/pjadda/.m2/repository/org/jboss/logging/jboss-logging/3.3.2.Final/jboss-logging-3.3.2.Final.jar:/Users/pjadda/.m2/repository/com/fasterxml/classmate/1.4.0/classmate-1.4.0.jar:/Users/pjadda/.m2/repository/org/springframework/spring-web/5.1.7.RELEASE/spring-web-5.1.7.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/spring-beans/5.1.7.RELEASE/spring-beans-5.1.7.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/spring-webmvc/5.1.7.RELEASE/spring-webmvc-5.1.7.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/spring-aop/5.1.7.RELEASE/spring-aop-5.1.7.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/spring-context/5.1.7.RELEASE/spring-context-5.1.7.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/spring-expression/5.1.7.RELEASE/spring-expression-5.1.7.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/2.1.5.RELEASE/spring-boot-starter-data-jpa-2.1.5.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/boot/spring-boot-starter-aop/2.1.5.RELEASE/spring-boot-starter-aop-2.1.5.RELEASE.jar:/Users/pjadda/.m2/repository/org/aspectj/aspectjweaver/1.9.4/aspectjweaver-1.9.4.jar:/Users/pjadda/.m2/repository/org/springframework/boot/spring-boot-starter-jdbc/2.1.5.RELEASE/spring-boot-starter-jdbc-2.1.5.RELEASE.jar:/Users/pjadda/.m2/repository/com/zaxxer/HikariCP/3.2.0/HikariCP-3.2.0.jar:/Users/pjadda/.m2/repository/org/springframework/spring-jdbc/5.1.7.RELEASE/spring-jdbc-5.1.7.RELEASE.jar:/Users/pjadda/.m2/repository/javax/transaction/javax.transaction-api/1.3/javax.transaction-api-1.3.jar:/Users/pjadda/.m2/repository/javax/xml/bind/jaxb-api/2.3.1/jaxb-api-2.3.1.jar:/Users/pjadda/.m2/repository/javax/activation/javax.activation-api/1.2.0/javax.activation-api-1.2.0.jar:/Users/pjadda/.m2/repository/org/hibernate/hibernate-core/5.3.10.Final/hibernate-core-5.3.10.Final.jar:/Users/pjadda/.m2/repository/javax/persistence/javax.persistence-api/2.2/javax.persistence-api-2.2.jar:/Users/pjadda/.m2/repository/org/javassist/javassist/3.23.2-GA/javassist-3.23.2-GA.jar:/Users/pjadda/.m2/repository/net/bytebuddy/byte-buddy/1.9.12/byte-buddy-1.9.12.jar:/Users/pjadda/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar:/Users/pjadda/.m2/repository/org/jboss/jandex/2.0.5.Final/jandex-2.0.5.Final.jar:/Users/pjadda/.m2/repository/org/dom4j/dom4j/2.1.1/dom4j-2.1.1.jar:/Users/pjadda/.m2/repository/org/hibernate/common/hibernate-commons-annotations/5.0.4.Final/hibernate-commons-annotations-5.0.4.Final.jar:/Users/pjadda/.m2/repository/org/springframework/data/spring-data-jpa/2.1.8.RELEASE/spring-data-jpa-2.1.8.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/data/spring-data-commons/2.1.8.RELEASE/spring-data-commons-2.1.8.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/spring-orm/5.1.7.RELEASE/spring-orm-5.1.7.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/spring-tx/5.1.7.RELEASE/spring-tx-5.1.7.RELEASE.jar:/Users/pjadda/.m2/repository/org/slf4j/slf4j-api/1.7.26/slf4j-api-1.7.26.jar:/Users/pjadda/.m2/repository/org/springframework/spring-aspects/5.1.7.RELEASE/spring-aspects-5.1.7.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/boot/spring-boot-devtools/2.1.5.RELEASE/spring-boot-devtools-2.1.5.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/boot/spring-boot/2.1.5.RELEASE/spring-boot-2.1.5.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.1.5.RELEASE/spring-boot-autoconfigure-2.1.5.RELEASE.jar:/Users/pjadda/.m2/repository/mysql/mysql-connector-java/8.0.16/mysql-connector-java-8.0.16.jar:/Users/pjadda/.m2/repository/org/projectlombok/lombok/1.18.8/lombok-1.18.8.jar:/Users/pjadda/.m2/repository/org/springframework/spring-core/5.1.7.RELEASE/spring-core-5.1.7.RELEASE.jar:/Users/pjadda/.m2/repository/org/springframework/spring-jcl/5.1.7.RELEASE/spring-jcl-5.1.7.RELEASE.jar:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar" com.pj.springdatademo.SpringDataDemoApplication
Connected to the target VM, address: '127.0.0.1:60640', transport: 'socket'

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.5.RELEASE)

2019-06-11 11:37:52.578  INFO 45693 --- [  restartedMain] c.p.s.SpringDataDemoApplication          : Starting SpringDataDemoApplication on pjaddas-MacBook-Pro.local with PID 45693 (/Users/pjadda/IdeaProjects/SpringDataDemo/target/classes started by pjadda in /Users/pjadda/IdeaProjects/SpringDataDemo)
2019-06-11 11:37:52.584  INFO 45693 --- [  restartedMain] c.p.s.SpringDataDemoApplication          : No active profile set, falling back to default profiles: default
2019-06-11 11:37:52.677  INFO 45693 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2019-06-11 11:37:52.678  INFO 45693 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2019-06-11 11:37:53.650  INFO 45693 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
2019-06-11 11:37:53.727  INFO 45693 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 68ms. Found 1 repository interfaces.
2019-06-11 11:37:54.168  INFO 45693 --- [  restartedMain] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$e659590d] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-06-11 11:37:54.578  INFO 45693 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2019-06-11 11:37:54.612  INFO 45693 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-06-11 11:37:54.613  INFO 45693 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.19]
2019-06-11 11:37:54.744  INFO 45693 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-06-11 11:37:54.744  INFO 45693 --- [  restartedMain] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2066 ms
2019-06-11 11:37:54.965  INFO 45693 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2019-06-11 11:37:55.555  INFO 45693 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2019-06-11 11:37:55.619  INFO 45693 --- [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
	name: default
	...]
2019-06-11 11:37:55.735  INFO 45693 --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate Core {5.3.10.Final}
2019-06-11 11:37:55.744  INFO 45693 --- [  restartedMain] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
2019-06-11 11:37:55.961  INFO 45693 --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
2019-06-11 11:37:56.151  INFO 45693 --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
2019-06-11 11:37:57.022  INFO 45693 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2019-06-11 11:37:57.652  INFO 45693 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-06-11 11:37:57.688  WARN 45693 --- [  restartedMain] aWebConfiguration$JpaWebMvcConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2019-06-11 11:37:57.905  INFO 45693 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2019-06-11 11:37:57.987  INFO 45693 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2019-06-11 11:37:57.993  INFO 45693 --- [  restartedMain] c.p.s.SpringDataDemoApplication          : Started SpringDataDemoApplication in 6.16 seconds (JVM running for 7.727)
2019-06-11 11:38:21.001  INFO 45693 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2019-06-11 11:38:21.001  INFO 45693 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2019-06-11 11:38:21.010  INFO 45693 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 9 ms
2019-06-11 11:38:21.115 ERROR 45693 --- [nio-8080-exec-1] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is org.springframework.dao.InvalidDataAccessApiUsageException: Type cannot be null; nested exception is java.lang.IllegalArgumentException: Type cannot be null] with root cause

java.lang.IllegalArgumentException: Type cannot be null
	at org.hibernate.query.procedure.internal.ProcedureParameterImpl.setHibernateType(ProcedureParameterImpl.java:130) ~[hibernate-core-5.3.10.Final.jar:5.3.10.Final]
	at org.hibernate.query.procedure.internal.ProcedureParameterImpl.<init>(ProcedureParameterImpl.java:88) ~[hibernate-core-5.3.10.Final.jar:5.3.10.Final]
	at org.hibernate.procedure.internal.ProcedureCallImpl.registerParameter(ProcedureCallImpl.java:289) ~[hibernate-core-5.3.10.Final.jar:5.3.10.Final]
	at org.hibernate.procedure.internal.ProcedureCallImpl.registerStoredProcedureParameter(ProcedureCallImpl.java:578) ~[hibernate-core-5.3.10.Final.jar:5.3.10.Final]
	at org.hibernate.procedure.internal.ProcedureCallImpl.registerStoredProcedureParameter(ProcedureCallImpl.java:69) ~[hibernate-core-5.3.10.Final.jar:5.3.10.Final]
	at org.springframework.data.jpa.repository.query.StoredProcedureJpaQuery.newAdhocStoredProcedureQuery(StoredProcedureJpaQuery.java:177) ~[spring-data-jpa-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.data.jpa.repository.query.StoredProcedureJpaQuery.createStoredProcedure(StoredProcedureJpaQuery.java:131) ~[spring-data-jpa-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.data.jpa.repository.query.StoredProcedureJpaQuery.doCreateQuery(StoredProcedureJpaQuery.java:92) ~[spring-data-jpa-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.data.jpa.repository.query.StoredProcedureJpaQuery.createQuery(StoredProcedureJpaQuery.java:83) ~[spring-data-jpa-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.data.jpa.repository.query.JpaQueryExecution$ProcedureExecution.doExecute(JpaQueryExecution.java:331) ~[spring-data-jpa-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.data.jpa.repository.query.JpaQueryExecution.execute(JpaQueryExecution.java:91) ~[spring-data-jpa-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.data.jpa.repository.query.AbstractJpaQuery.doExecute(AbstractJpaQuery.java:136) ~[spring-data-jpa-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.data.jpa.repository.query.AbstractJpaQuery.execute(AbstractJpaQuery.java:125) ~[spring-data-jpa-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.doInvoke(RepositoryFactorySupport.java:605) ~[spring-data-commons-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.lambda$invoke$3(RepositoryFactorySupport.java:595) ~[spring-data-commons-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.invoke(RepositoryFactorySupport.java:595) ~[spring-data-commons-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.data.projection.DefaultMethodInvokingMethodInterceptor.invoke(DefaultMethodInvokingMethodInterceptor.java:59) ~[spring-data-commons-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:295) ~[spring-tx-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:98) ~[spring-tx-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:139) ~[spring-tx-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:138) ~[spring-data-jpa-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:93) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.data.repository.core.support.SurroundingTransactionDetectorMethodInterceptor.invoke(SurroundingTransactionDetectorMethodInterceptor.java:61) ~[spring-data-commons-2.1.8.RELEASE.jar:2.1.8.RELEASE]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:212) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at com.sun.proxy.$Proxy88.getAllCategoriesThroughStoredProcedure(Unknown Source) ~[na:na]
	at com.pj.springdatademo.web.CategoryController.getAllCategories(CategoryController.java:27) ~[classes/:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:566) ~[na:na]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:190) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:138) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:104) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:892) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:797) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1039) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:942) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1005) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:897) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:634) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:882) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:741) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53) ~[tomcat-embed-websocket-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:99) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:92) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.springframework.web.filter.HiddenHttpMethodFilter.doFilterInternal(HiddenHttpMethodFilter.java:93) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:200) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:200) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:490) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:139) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:408) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:836) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1747) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128) ~[na:na]
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628) ~[na:na]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) ~[tomcat-embed-core-9.0.19.jar:9.0.19]
	at java.base/java.lang.Thread.run(Thread.java:834) ~[na:na]

```
