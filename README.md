# spring 

    1. Inversion of Control and Dependency Injenction
          - scope - жизненный цикл бина, количество создаваемых бинов
              * singletone - default, stateless objects
              * prototype - создаётся новый бин после обращения
          - init, destroy
          - annotations
              * @Component
              * @Autowired - в constructor по умолчанию, 
                can be used in constructor, setter, field
              @Qualifier - нельзя с constructor, 
                can be used with setter and field
              @Value - Для внедрения строк и др. значений, 
                в этом случае нет необходимости в сеттерах  

    2. Aspect Oriented Programming
    
    3. hibernate 
          - base
          - CRUD operations
          - one to one, bi-directional, uni-directional
          - one to many, bi-directional, uni-directional                   
          - many to many

    4. spring mvc

    5. spring hibernate mvc aop
    
