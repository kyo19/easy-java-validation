

# Description #

Validation to checks length of the string field.


# Parameters #
  * type - type of the validation. Here it's value is `stringlength`.

  * fieldName - Name of the field that need to check for validation.

  * min - The min length of the field value. (Optional).

  * max - The max length of the field value. (Optional).

To use `min` and `max` parameters, you will have to add `<param>` element in the `<rule>` element.

# Examples #
```
 <validations>
        <!-- String length validation for 'userFormValidation' -->
	<validation name="userFormValidation">
		<rule type="stringlength" fieldName="firstName">
                        <param min="5" max="10"/>
			<message>FirstName should be in between 5 and 10</message>
		</rule>
	</validation>
 </validations>
```