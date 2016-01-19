

# Introduction #

You can display dynamic error messages for validation i.e:- you can specify `rule` attributes like `fieldName`, `max`, `min`, `dateFormat` in the error messages.


# Parameters #

  * useAttributePlaceHolder - This parameter indicate if above mentioned attributes needs to replace in error messages. It can be either `true` or `false`. Default is `false`. It is optional.

`useAttributePlaceHolder` attribute is available on `<message>` XML element.

# Examples #

```
<validations>
        <validation name="userFormValidation">
		<rule type="required" fieldName="firstName">
			<message useAttributePlaceHolder="true">${fieldName} is required</message>
		</rule>
        </validation>
</validations>	
```

You can use above attributes in properties file also.