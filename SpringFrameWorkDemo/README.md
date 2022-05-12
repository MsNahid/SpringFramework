# Spring Core
**Spring [Ioc](#myfootnote1) container**
> - Create Object
> - Manage Lifecycle Of Object
> - Inject Object at run time
> - BeanFactory Interface
> - ApplicationContext Interface
> - ClassPathXmlApplicationContext

<br></br>
<a name="myfootnote1">IOC</a>
>Spring IoC Container is the core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make up the application.

>It implents using Factory Pattern.

<br></br>
**Dependency Injection**
> It actually injects an entity outside from the class.And It must be loosely coupled.

> **Three Types of Dependency Injection**
>  - Setter injection
>  - Constructor injection
>  - field injection
> 
> _Field injection is harmful_

<br></br>
**Spring Configuration**
> - Xml based configuration
> - Annotations based configuration
> - Java based configuration

_There is a subtle difference between xml based and annotation based configuration._

<br></br>
**Bean**
> Spring bean is an object that is managed by the spring ioc container.

**AutoWiring**
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

<br></br>

<a name="myfootnote2">Auto Wiring By Type</a>
```
    private SpellChecker spellChecker;

    @Autowired
    EmailClient(BasicSpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }
```
<br></br>

<a name="myfootnote3">Auto Wiring By Name</a>
```
  private SpellChecker spellChecker;
  
  @Autowired
   EmailClient(SpellChecker advancedSpellChecker){
       this.spellChecker = advancedSpellChecker;
   }
```
<br></br>

<a name="myfootnote4">Qualifier Annotation</a>
```
  private SpellChecker spellChecker;
  @Autowired
  EmailClient(@Qualifier("basicSpellChecker") SpellChecker spellChecker){
     this.spellChecker = spellChecker;
     
     // Qualifer overrides @Primary annotation
  }

```
