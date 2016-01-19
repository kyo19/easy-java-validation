

# Description #

Perform validation if given ISBN number is valid.

# Parameters #
  * type - type of the validation. Here it's value is `isbn`.

  * fieldName - Name of the field that need to check for validation.

# Examples #
```
 <validations>
        <!-- Regular expression validation for 'userFormValidation' -->
	<validation name="userFormValidation">
                <rule type="isbn" fieldName="isbn">
			<message>ISBN is not in proper format</message>
		</rule>
	</validation>
 </validations>
```