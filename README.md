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
        