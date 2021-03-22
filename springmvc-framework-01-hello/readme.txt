一、实现内容
1. 实现SpringMVC的基础运行程序

二、实现逻辑
1. web.xml: 定义注册DispatcherServlet 关联springmvc-servlet.xml
2. springmvc-servlet.xml
A. 添加URL处理映射器 BeanNameUrlHandlerMapping
B. 添加URL处理器适配器 SimpleControllerHandlerAdapter
C. 添加视图解析器 进行页面前后缀的设置
D. 注册自定义Controller 注：id="/hello"
3. HelloController:实现自定义Controller
4. 实现hello.jsp 跳转页面 注：此页面路径需与视图解析器前缀匹配 本例：WEB-INF/jsp/hello.jsp
5. 启动tomcat
6. 浏览器：http://localhost:8080/hello