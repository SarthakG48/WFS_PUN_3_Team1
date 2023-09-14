function validate(){
    var email=document.getElementById("email").value;
    var password=document.getElementById("password").value;
    var emailRegex=/^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/;
    var passwordRegex=/^[a-zA-Z0-9+_.-]+$/;
    if(email==""||password==""){
        alert("Please fill all the fields");
        return false;
    }
    else if(!email.match(emailRegex)){
        alert("Please enter a valid email");
        return false;
    }
    else if(!password.match(passwordRegex)){
        alert("Please enter a valid password");
        return false;
    }
    else{
        if(email=="john@gmail.com" && password=="john123"){
            a = document.getElementById("login-btn");
            alert("welcome admin")
            window.location.href = '/admin.html';
        }
        else if(email=="mary@gmail.com"&&password=="mary123"){
            a = document.getElementById("login-btn");
            alert("welcome manager")
            window.location.href = './Manager.html';
        
        }
        else if(email=="joe@gmail.com" && password=="joe123"){
            a = document.getElementById("login-btn");
            alert("welcome user");
            window.location.href = './User.html';
        
        }
        else{
            alert("Invalid credentials");
            return false;
        }
         

    }
}



function signup(){
    alert("coming soon");
}