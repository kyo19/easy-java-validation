

# Introduction #

You can display error messages using internationalization. Easy validation supports some predefined locales.


# Parameters #

  * locale - Specify locale for internationalization.

`locale` attribute is available on `<properties>` XML element.

To view list of supporting locales, click [here](http://code.google.com/p/easy-java-validation/wiki/localecodes)

# Examples #

```
<validations>
        <!-- File contains error messages for 'English' -->
	<properties locale="EN">
		<file>resources/error_messages_en.properties</file>
	</properties>

        <!-- File contains error messages for 'French' -->
	<properties locale="FR">
		<file>resources/error_messages_fr.properties</file>
	</properties>

        <validation name="userFormValidation">
		<rule type="required" fieldName="firstName">
			<message key="firstName.required"></message><!-- Display error message from properties file -->
		</rule>
        </validation>
</validations>	
```

The `error_messages_en.properties` is as,

```
firstName.required=FirstName is required
```

If `key` attribute specified for `<message>` element, then `easy-validation` framework load error messages from the properties file of mentioned locale.