/**
 * Created by q_cui on 2018/4/16.
 */

'use strict';

var quizChoose = {};

quizChoose.initSectionCell = function (diseaseEntity) {
    var image = "<div id='diseaseImage'>" +
        "<img src='/img/" + diseaseEntity.image +
        "' style='width:100px;height:100px'/>" +
        "</div>";

    var name = "<div id='diseaseName'>" +
        "<p>" + diseaseEntity.name + "</p>" +
        "</div>";

    var id = "<div id='diseaseId' style='display:none'>" +
        diseaseEntity.id +
        "</div>";

    var cell = "<div>" + image + name + id + "</div>";

    return cell;
};

quizChoose.initSection = function(diseaseList){
    var section = "";
    for(var i=0;i<diseaseList.length;i++){
        section = section + quizChoose.initSectionCell(diseaseList[i]);
    }
    return section;
};

quizChoose.bindSection = function () {
    $(".case-submenu>div").on('click',function () {
        var id = $(this).find("#diseaseId").html();
        window.location.href = "../quiz/" + id;
    });
}

quizChoose.initPage = function (res) {
    $("#section-shape-1>div").html(quizChoose.initSection(res.one));
    $("#section-shape-2>div").html(quizChoose.initSection(res.two));
    $("#section-shape-3>div").html(quizChoose.initSection(res.three));
    $("#section-shape-4>div").html(quizChoose.initSection(res.four));
    quizChoose.bindSection();
};

quizChoose.init = function () {
    var req = {
    };
    comm.utils.postForm("/disease/all",req,quizChoose.initPage);
};