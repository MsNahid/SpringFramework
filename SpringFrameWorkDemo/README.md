# Spring Core
**Spring [Ioc](#myfootnote1) container** <hr />
> - Create Object
> - Manage Lifecycle Of Object
> - Inject Object at run time
> - BeanFactory Interface
> - ApplicationContext Interface
> - ClassPathXmlApplicationContext

<br />

<a name="myfootnote1">IOC</a> <hr />
>Spring IoC Container is the core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make up the application.

>It implents using Factory Pattern.
<br />

**Dependency Injection** <hr />
> It actually injects an entity outside from the class.And It must be loosely coupled.

> **Three Types of Dependency Injection**
>  - Setter injection
>  - Constructor injection
>  - field injection
> 
> _Field injection is harmful_
<br />

**Spring Configuration** <hr />
> - Xml based configuration
> - Annotations based configuration
> - Java based configuration

_There is a subtle difference between xml based and annotation based configuration._


**Bean** <hr />
> Spring bean is an object that is managed by the spring ioc container.

<br />

**AutoWiring** <hr />
> - [By Type](#myfootnote2)
> - [By Name](#myfootnote3)
> - @Primary
>  - When Always use Specific class
  >  ```
  >  @Component
  >  @Primary
  >  public class AdvancedSpellChecker implements SpellChecker{
  >   //  This class is used
  >  }
  >  
  >  @Component
  >  public class BasicSpellChecker implements SpellChecker{
  >   //  this class is not used
  >  }
  >  ```
> - [@Qualifier](#myfootnote4)

<br />

<a name="myfootnote2">**Auto Wiring By Type**</a> <hr />
```
    private SpellChecker spellChecker;

    @Autowired
    EmailClient(BasicSpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }
```

<br />

<a name="myfootnote3">**Auto Wiring By Name**</a> <hr />
```
  private SpellChecker spellChecker;
  
  @Autowired
   EmailClient(SpellChecker advancedSpellChecker){
       this.spellChecker = advancedSpellChecker;
   }
```
<br />

<a name="myfootnote4">**Qualifier Annotation**</a> <hr />
```
  private SpellChecker spellChecker;
  @Autowired
  EmailClient(@Qualifier("basicSpellChecker") SpellChecker spellChecker){
     this.spellChecker = spellChecker;
     
     // Qualifer overrides @Primary annotation
  }

```

<br />

**Bean Scopes** <hr />
> - Singleton (Created only once at a time of container start-up.)
> - Prototype (Each time request)
> - Request 
> - Session
> - Application
> - WebSocket
> 
> Usage: @Scope("singleton")

<br />

**Bean Life Cycle Phases** <hr />
> - Initialization Phase
> - Bean Usage
> - Destruction Phase 
> - LifeCycle Flow
>  - ![Alt text](beanLifeCycleFlow.png?raw=true "")
> 
>  
>  Spring destruction is not managed for **Prototype**

<br />

**Life Cycle CallBack Hooks** <hr />
> - Initializing Bean, DesposableBean
> - Jsr-250 Annotations (Recommended)
>   - @PostConstruct
>   - @PreDestroy
> - @Bean
>   - initMethod
>   - destroyMethod

<br />

**Spring Expression Language(SPEL)** <hr />
> - @PropertySource -> scan class path
> - @Value       -> "${name}"

<br />

**Resources** <hr />
1. https://www.youtube.com/watch?v=ZwcHeLhvuq4&ab_channel=ProgrammingTechie
2. https://www.youtube.com/watch?v=hYSMHiJZcBM&ab_channel=DailyCodeBuffer
3. https://www.geeksforgeeks.org/bean-life-cycle-in-java-spring/#:~:text=Bean%20life%20cycle%20is%20managed,the%20spring%20container%20is%20closed.