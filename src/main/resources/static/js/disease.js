/**
 * Created by zhenghan on 2017/3/23.
 */


$(document).ready(function(){
    var dId=getQueryString("id");
    $.ajax({
            type: "GET",
            url: "/disease/findDisease/"+dId,
            contentType: "application/json",
            processData: false,
            success: function (result) {
                $("#d-description").html(result.data.description);
                $("#d-name").html(result.data.name);
                $("video").attr("src",result.data.videoUrl);
                var img = result.data.images;
                img.forEach(function(data,index,arr) {
                    var temp = $("<img src=\""+img[index].url+"\">");
                    $("#image-list").append(temp);
                })
            }
        }
    );
});

function getQueryString(name)
{
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}