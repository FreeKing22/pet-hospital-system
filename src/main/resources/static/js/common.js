/**
 * Created by q_cui on 2018/4/16.
 */

"use strict";

var comm = {};
comm.utils = {};

//扩展jquery
(function($){

    $.extend({
        firstOrDefault:function(array,filterFunc){
            var result=null;
            if(array){
                if(array!=null&&array.length>0){
                    $(array).each(function(i,item){
                        if(filterFunc(item)){
                            result= item;
                        }
                    });
                }
            }
            return result;
        }
    });

    $.extend({
        isString:function(str) {
            if(typeof(str)=='string' && str.constructor == String)
                return true;
            else
                return false;
        },
        isObj:function(str) {
            if(str == null || typeof (str) == 'undefined')
                return false;
            else
                return true;
        },
        isNumber:function(str) {
            if(str != null && typeof(str) == "number")
                return true;
            else
                return false;
        }
    });

    $.extend({
        getPercent: function (num, total) {
            num = parseFloat(num);
            total = parseFloat(total);
            if (isNaN(num) || isNaN(total))
                return "-";
            return total <= 0 ? "0%" : (Math.round(num / total * 10000) / 100.00 + "%");
        }
    });

    $.extend({
        getUrlParam:function (paras) {
            var url = location.href;
            var paraString = url.substring(url.indexOf("?")+1,url.length).split("&");
            var paraObj = {}
            var j;
            for (var i=0; j=paraString[i]; i++){
                paraObj[j.substring(0,j.indexOf("=")).toLowerCase()] = j.substring(j.indexOf("=")+1,j.length);
            }
            var returnValue = paraObj[paras.toLowerCase()];
            if(typeof(returnValue)=="undefined"){
                return "";
            }
            else{
                return returnValue;
            }
        },
        getUrlLastParam:function () {
            var url = location.href;
            var paraString = url.split("/");
            return paraString[paraString.length-1];
        }
    });

})(jQuery);

(function () {
    this.postForm = function (url, md, sucFunc, errorFunc) {
        url = "http://localhost:8080/api"+url;
        var request = $.extend({}, {
            type: 'post',
            url: url,
            data: md,
            success: function (res) {
                if(res!= null && sucFunc ){
                    sucFunc(res);
                }
            },
            error: function () {
                if (errorFunc != null) {
                    errorFunc("error!");
                }
            }
        });
        $.ajax(request);
    };

}).apply(comm.utils);

