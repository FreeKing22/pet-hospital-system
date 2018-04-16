/**
 * Created by q_cui on 2018/4/16.
 */

'use strict';

var work = {};

work.generateWork = function (res) {
    var html = "";
    if(res&&res.length>0){
        for(var i=0;i<res.length;i++){
            html =  html +
                "<li> " +
                "<a href='../html/map/3Dmap.html'>进入科室</a> " +
                "<p>" + res[i].name + "</p> " +
                "<p>" + res[i].description + "</p>" +
                "</li> " +
                "<hr />"
        }
        $(".work-list").html(html);
    }
};

work.getJobId = function () {
    var jobName = $.getUrlLastParam();
    if(jobName==="doctor")
        return 1;
    else if(jobName==="assistant")
        return 2;
    else
        return 3;
};

work.init = function () {
    var jobId = work.getJobId();
    var req = {
        jobId:jobId
    };
    comm.utils.postForm("/work/detail",req,work.generateWork);
};