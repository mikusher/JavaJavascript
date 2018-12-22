$(document).ready(function () {
    $("#name_error").hide();
    $("#username_error").hide();
    $("#password_error").hide();


    $("#name").focusout(function () {
        var name = $("#name").val().length;

        if (name < 8 || name > 24) {
            $("#name_error").html("Name must be 5 long");
            $("#name_error").show();
        } else {
            $("#name_error").hide();
        }
    })

    $("#username").focusout(function () {
        var username = $("#username").val().length;

        if (username < 8 || username > 24) {
            $("#username_error").html("Username must be 8 - 24 characters");
            $("#username_error").show();
        } else {
            $("#username_error").hide();
        }
    })

    $("#password").focusout(function () {
        var password = $("#password").val().length;

        if (password < 5) {
            $("#password_error").html("Password too short");
            $("#password_error").show();
            $("#password_error").attr('class', "text-warning");
        } else if (password > 12) {
            $("#password_error").html("Password too long");
            $("#password_error").show();
            $("#password_error").attr('class', "text-danger");
        } else {
            $("#password_error").hide();
        }
    })
});