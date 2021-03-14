function validate(){
    var email = document.getElementById("InputEmail2").value;
    var password = document.getElementById("InputPassword2").value;
    if(email=="admin@gmail.com"&&password=="1234")
    return true;
    else{
        //alert("Error Login failed")
        if(password.trim()==""||email.trim()=="")alert("Empty Email/password is not allowed!");
        else
        document.body.innerHTML = '<body imgsrc="gpp.jpg"><h1><center>Error!! Login failed! Invalid Email or password! </center></h1> <h2><a href="index.html">login page</a><h2></body>';
       // document.body.innerHTML = sucess.html;
        return false;
    }
}