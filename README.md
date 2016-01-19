# easy-java-validation
Automatically exported from code.google.com/p/easy-java-validation

Easy Validation Framework with Version 2.0
It is a XML based java validation framework. It avoids the repetitive java code for common validations like required field, email, date comparison, validations based on regular expression, URL validation, etc. This framework supports both WEB as well as DESKTOP application, regardless of framework you use(means you can use it with any framework like struts, spring, etc). It also supports internationalization to display validation messages.

The supported validation types are as,

Required
Email
Expression (Here expression is either regular expression or OGNL expression)
Regular Expression
OGNL Expression
String Length
URL
Credit Card
ISBN
IP Address
Comparision validations as,

Integer
Double
Date
Validation XML Declaration
To add XML code for validations for any field is as,

Add the DOCTYPE element at the top of XML as,

<!DOCTYPE validations SYSTEM "easy-validation.dtd">
It is must to add the DOCTYPE in the validation (i.e:- rule) XML files, otherwise application will through XML parsing exception.

Sample XML file e.g:- userFormValidation.xml as,

<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE validations SYSTEM "easy-validation.dtd">

<validations>

        <properties locale="EN">
                <file>PATH/TO/PROPERTIES FILE</file>
        </properties>
        <properties locale="FR">
                <file>PATH/TO/PROPERTIES FILE</file>
        </properties>
        
        <validation name="userFormValidation">
                <rule type="required" fieldName="firstName">
                        <message>FirstName is required</message>
                </rule>
                
                <rule type="stringlength" fieldName="firstName">
                        <param min="5" max="10"/>
                        <message useAttributePlaceHolder="true">${fieldName} should be between ${min} and ${max}</message>
                </rule>
        </validation>
</validations>
You can add these validation XML files anywhere in the classpath (means in the classes OR WEB-INF (for WEB application) directory).

Validation Initialization
To Initialize validation framework, you will have to add following code in either Servlet context listener (for WEB application) or main start up class (for DESKTOP application). This initialization is should be performed only one time(at the time of application start up).

   Validator.initialize(<validation_files_path>);
Here <validation_files_path> is path of the XML files written for validations, for multiple file this value should be separated by space. e.g:- path of userFormValidation.xml

Perform Validations Check
To check validations on the form fields, then

Specify validation name (same as specified in the XML)
Store all fields(of a form) & their values in the java map
Specify supporting locale if your application is supporting to internationalization (I18N)
   List<Error> errors = Validator.checkValidations(validationName, parametersMap);
If you want to use different locale, then you can use following method signature

   List<Error> errors = Validator.checkValidations(validationName, parametersMap, locale);
Here,

validationName is name of the validation specified in XML & against which you to perform validation check.
parametersMap is java map of fields (as key) & their values (as value)
locale is 2 digit locale code for internationalization (I18N).
In first method signature, default local value is EN.

The method returns list of errors. If no error found then it returns empty list.The Error class has getFieldName() & getMessage() methods to retrieve name of field & error message.

Call the above method from any filter/inteceptor where validation check should be performed for your application/forms.

Attribute Place Holder
You can display dynamic error messages for validation i.e:- you can specify rule attributes like fieldName, max, min, dateFormat in the error messages. Click here to know more detail.
