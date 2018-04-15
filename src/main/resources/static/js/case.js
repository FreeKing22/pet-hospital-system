$(document).ready(function(){
    getKind();
})

function getKind() {
    $.ajax({
        type: "get",
        url: "/disease/listByKind/1",
        contentType: "application/json;charset=UTF-8",
        success: function (result) {
            if(result.succeed){
                var arr = result.data;
                arr.forEach(function(value, index, array) {
                    var temp = $("<a href=\"disease.html?id="+arr[index].id.toString()+"\">"+arr[index].name+"</a>");
                    $("#section-shape-1").children("div").append(temp);
                });
            }
            $.ajax({
                type:"get",
                url: "/disease/listByKind/2",
                contentType: "application/json;charset=UTF-8",
                success: function (result) {
                    if(result.succeed){
                        var arr = result.data;
                        arr.forEach(function(value, index, array) {
                            var temp = $("<a href=\"disease.html?id="+arr[index].id.toString()+"\">"+arr[index].name+"</a>");
                            $("#section-shape-2").children("div").append(temp);
                        });
                    }
                    $.ajax({
                        type:"get",
                        url: "/disease/listByKind/3",
                        contentType: "application/json;charset=UTF-8",
                        success: function (result) {
                            if(result.succeed){
                                var arr = result.data;
                                arr.forEach(function(value, index, array) {
                                    var temp = $("<a href=\"disease.html?id="+arr[index].id.toString()+"\">"+arr[index].name+"</a>");
                                    $("#section-shape-3").children("div").append(temp);
                                });
                            }
                        }
                    })
                }
            })
        }
    })
}