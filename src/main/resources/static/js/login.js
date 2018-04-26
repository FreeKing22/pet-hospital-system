function login() {
    $.ajax({
        //几个参数需要注意一下
        type: "POST",//方法类型
        dataType: "json",//预期服务器返回的数据类型
        url: "/api/login" ,//url
        data: $('#loginForm').serialize(),
        success: function (result) {
            if(result.resultCode ==0){
                window.location.href='/index';
            }
            else if (result.resultMessage&&result.resultMessage.length>0) {
                alert(result.resultMessage);
            }
            else
                alert("登录失败");
        },
        error : function() {
            alert("登录失败");
        }
    });
}