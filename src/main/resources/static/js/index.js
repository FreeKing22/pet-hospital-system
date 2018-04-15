function login() {
    var username = $("input#login-username").val();
    var password = $("input#login-password").val();
    var data = new Object();
    data.username = username;
    data.password = password;
    $.ajax({
            type: "POST",
            url: "/user/login",
            contentType: "application/json",
            data: JSON.stringify(data),
            processData: false,
            success: function (result) {
                alert(result.data);
                if(result.succeed){
                    window.location.href="../index";
                }
            }
        }
    )
}

function signup() {
    var username = $("input#signup-username").val();
    var password = $("input#signup-password").val();
    var repeat = $("input#signup-repeat").val();
    var data = new Object();

    if(password!=repeat){
        alert("两次输入的密码不一致，请重新输入！");
    }
    else{
        data.username = username;
        data.password = password;
        $.ajax({
                type: "POST",
                url: "/user/signUp",
                contentType: "application/json",
                data: JSON.stringify(data),
                processData: false,
                success: function (result) {
                    alert(result.data);
                    if(result.succeed){
                        window.location.href="../index";
                    }
                }
            }
        )
    }
}