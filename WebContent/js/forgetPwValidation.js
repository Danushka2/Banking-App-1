function formValidation(){
    var Digits = document.getElementById("digitId");
    var nPassword = document.getElementById("newPId");
    var cnPassword = document.getElementById("cnewPId");
 

    var pwd = nPassword.value;
    var cpwd = cnPassword.value;

    
    if(Digits.value == 0 || nPassword.value == 0 || cnPassword.value == 0 ){
        alert("Every box must be filled out");
        return false;
    }

    if(cpwd != pwd ){
        alert("Your new password and confirmation password do not match.Try again!");
        cnPassword.focus();
        return false;
    }

 
}