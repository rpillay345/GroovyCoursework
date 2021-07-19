package builder
import groovy.transform.ToString
import groovy.transform.builder.Builder

@Builder
/*
Note that builder documentation is located in groovy.transform.builder

The @Builder AST transformation is used to help write classes that can be created using fluent api calls.
The transform supports multiple building strategies to cover a range of cases and there are a number of configuration
options to customize the building process. In addition, a number of annotation attributes let you customise the building process.
Not all annotation attributes are supported by all strategies. See the individual strategy documentation for more details.
If you're an AST hacker, you can also define your own strategy class. The following strategies are bundled with Groovy:

SimpleStrategy for creating chained setters
ExternalStrategy where you annotate an explicit builder class while leaving some buildee class being built untouched
DefaultStrategy which creates a nested helper class for instance creation   - whhen nothing is specified groovy will use this
InitializerStrategy which creates a nested helper class for instance creation which when used with @CompileStatic
allows type-safe object creation

 */
@ToString(includeNames = true)
class Developer {
    String firstName
    String lastName
    String middleInitial
    String email
    Date hireDate
    List langugages
}
