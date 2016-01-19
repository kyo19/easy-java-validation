

# Description #

Validation to checks if the double value specified is within a certain range.


# Parameters #
  * type - type of the validation. Here it's value is `double`.

  * fieldName - Name of the field that need to check for validation.

  * min - The minimum value. (Optional).

  * max - The maximum value. (Optional).

To use `min` and `max` parameters, you will have to add `<param>` element in the `<rule>` element.

# Examples #
```
 <validations>
        <!-- Double value comparison validation for 'userFormValidation' -->
	<validation name="userFormValidation">
		<rule type="double" fieldName="percentage">
                        <param min="35.6" max="70.5"/>
			<message>Percentage should be between 35.6 and 70.5</message>
		</rule>
	</validation>
 </validations>
```