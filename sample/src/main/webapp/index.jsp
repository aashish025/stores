 

<html>
<script>  
function validateform(){  
var name=document.myform.name.value;  
var password=document.myform.password.value;  
  
if (name==null || name==""){  
  alert("Name can't be blank");  
  return false;  
}else if(password.length<6){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  
}  
</script>  
<body>
<form name="myform" action="Registration" onsubmit="return validateform()">
Enter Name : <input type="text" name=name><br>
pass : <input type="password" name=password>
<input type="submit" value=Submit>
<a href="Registration" target="_top" >pdf</a>
<a href="Registration?r=asj" target="_top" >pdf</a>
</form>


</body>
</html>
