

# Description #

Email validator checks that a given String field, if not empty, is a valid email address.

# Parameters #
  * type - type of the validation. Here it's value is `email`.

  * fieldName - Name of the field that need to check for validation.


# Examples #
```
 <validations>
        <!-- email validation for 'userFormValidation' -->
	<validation name="userFormValidation">
		<rule type="email" fieldName="email">
			<message>Email is not in proper format</message>
		</rule>
	</validation>
 </validations>
```