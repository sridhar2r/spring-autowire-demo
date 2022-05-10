Difference between having @bean annotation inside @Component vs @Configuration class

Having @bean inside @Component differs when we invoke other @bean methods in same class
while creating a bean. With @Component it uss java semantics and we end up calling the
bean method which creates new instance outside of the spring context. Having @Configuration
we get the bean from spring context and no new instance is created again.
So if there are any other dependencies on that bean it will get wired properly

References:-
http://dimafeng.com/2015/08/29/spring-configuration_vs_component/
https://docs.spring.io/spring-framework/docs/3.0.x/reference/beans.html#beans-factorybeans-annotations
https://stackoverflow.com/questions/39174669/what-is-the-difference-between-configuration-and-component-in-spring
https://stackoverflow.com/questions/3330618/bean-inside-class-with-configuration-and-without-it