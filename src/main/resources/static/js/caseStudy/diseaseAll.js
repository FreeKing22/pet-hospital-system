/**
 * Created by q_cui on 2018/4/16.
 */

'use strict';

var diseaseAll = {};

diseaseAll.initSectionCell = function (diseaseEntity) {
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

diseaseAll.initSection = function(diseaseList){
    var section = "";
    for(var i=0;i<diseaseList.length;i++){
        section = section + diseaseAll.initSectionCell(diseaseList[i]);
    }
    return section;
};

diseaseAll.bindSection = function () {
    $(".case-submenu>div").on('click',function () {
        var id = $(this).find("#diseaseId").html();
        console.log(id);
        window.location.href = "../caseStudy/diseaseStudy/" + id;
    });
}

diseaseAll.initPage = function (res) {
    $("#section-shape-1>div").html(diseaseAll.initSection(res.one));
    $("#section-shape-2>div").html(diseaseAll.initSection(res.two));
    $("#section-shape-3>div").html(diseaseAll.initSection(res.three));
    $("#section-shape-4>div").html(diseaseAll.initSection(res.four));
    diseaseAll.bindSection();
};

diseaseAll.init = function () {
    var req = {
    };
    comm.utils.postForm("/disease/all",req,diseaseAll.initPage);
};