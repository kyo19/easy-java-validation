

# Description #

Perform validation if given IP address is valid.

# Parameters #
  * type - type of the validation. Here it's value is `inetaddress`.

  * fieldName - Name of the field that need to check for validation.

# Examples #
```
 <validations>
        <!-- Regular expression validation for 'userFormValidation' -->
	<validation name="userFormValidation">
                <rule type="inetaddress" fieldName="inetaddress">
		     <message>IP Address is not in proper format</message>
		</rule>
	</validation>
 </validations>
```