let xhr = new XMLHttpRequest();
function registration() {
    if ($("#password").val() === $("#confirmPassword").val()) {
        let formData = new FormData();
        formData.append("userName", $("#username").val());
        formData.append("password", $("#password").val());
        formData.append("rawPassword", $("#cpass").val());
        xhr.open("POST", "http://localhost:8080/registration");
        xhr.send(formData);
    } else {
        alert("Password and confirm password different")
    }
}

xhr.onreadystatechange = function () {
    if (xhr.readyState === 4 && xhr.status === 200)
    {
        alert("Registration successful");
        $("#username").val("");
        $("#password").val("");
        $("#confirmPassword").val("");
    }
};

// let xhrLogin = new XMLHttpRequest();
// function login() {
//     let formData = new FormData();
//     formData.append("userName", $("#user").val());
//     formData.append("password", $("#pass").val());
//     xhrLogin.open("POST", "http://localhost:8080/login");
//     xhrLogin.send(formData);
// }
//
// xhrLogin.onreadystatechange = function () {
//     if (xhrLogin.readyState !== 4 && xhrLogin.status !== 200)
//     {
//         alert("Wrong input");
//     }
// };

