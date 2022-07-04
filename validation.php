<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<form name="f1" method="post" action="/ip/formValidationPHP.php" > 
        Name :<input type="text" name="uname" ><span style="color:red;">Enter Some Name</span><br><br> 

        age :<input type="text" name="uage" ><span style="color:red;">Age must be above 18 !</span> <br><br>

        mail id :<input type="text" name="umail" >
        <?php
            $mailid=$_POST['umail'];
            if(preg_match("/^[a-zA-Z0-9.-]+@[a-zA-Z0-9.-]+\.([a-zA-Z]{2,4})$/",$mailid)==1){
                ?><span>Valid!</span><?php
            }
            else{
                ?><span style="color:red;">You have entered an invalid email address!</span><?php
            }
        ?>
        
        
        <br><br>
        phone :<input type="text" name="uphone" >
        
        <br><br> 

        address :<input type="textarea" name="uaddress" ><span style="color:red;">Enter Address </span><br><br> 

        password :<input type="password" name="p1" > <br><br> 

        retype password :<input type="password" name="p2" ><br><br> 

        <span style="color:red;">password match fail </span><br><br> 
        
    <input type="submit" value="ok" >
    
</form>
</body>
</html>
