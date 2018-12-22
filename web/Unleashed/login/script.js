function Login() {
    var username = document.getElementById('username');
    var password = document.getElementById('password');


    if (username.value == "" || password.value == "") {
        document.getElementById('error').innerHTML = "<center class='text-warning'>Please Complete The Required Field!</center>";
    } else {
        if (username.value == "admin" && password.value == "admin") {
            document.getElementById('error').innerHTML = "";
            username.value = "";
            password.value = "";
            window.location = "home.html";
        } else {
            document.getElementById('error').innerHTML = "<center class='text-danger'>Invalid Username or Password</center>";
        }
    }
}