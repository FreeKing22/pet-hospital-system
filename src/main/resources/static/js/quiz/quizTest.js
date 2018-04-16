/**
 * Created by q_cui on 2018/4/16.
 */

'use strict';

var quizTest = {};

quizTest.initQuiz = function(index,quizEntity){

    var title = "<label>" + index + ". " + quizEntity.question + "</label>";

    var one = "<label class='radio-inline'>" +
        "            <input type='radio' name='"+quizEntity.id+"' value='A' answer='"+quizEntity.answer+"'>" + quizEntity.choiceList[0] +
        "            </input>" +
        "     </label>";

    var two = "<label class='radio-inline'>" +
        "            <input type='radio' name='"+quizEntity.id+"' value='B' answer='"+quizEntity.answer+"'>" + quizEntity.choiceList[1] +
        "            </input>" +
        "     </label>";

    var three = "<label class='radio-inline'>" +
        "            <input type='radio' name='"+quizEntity.id+"' value='C' answer='"+quizEntity.answer+"'>" + quizEntity.choiceList[2] +
        "            </input>" +
        "     </label>";

    var four = "<label class='radio-inline'>" +
        "            <input type='radio' name='"+quizEntity.id+"' value='D' answer='"+quizEntity.answer+"'>" + quizEntity.choiceList[3] +
        "            </input>" +
        "     </label>";

    var choices = "<div>" + one + two + three + four + "</div>";

    return title + choices + "<hr/>";

};

quizTest.initQuizList = function (res) {
    var quizList = "";
    for(var i=0;i<res.length;i++){
        quizList = quizList + quizTest.initQuiz(i,res[i]);
    }
    $("#quizList").html(quizList);
};

quizTest.bindModal = function () {
    var score = (Math.ceil(Math.random()*10))*10;
    $("#modalText").html(score+"分");
    $('#modalBtn').click(function() {
        location.reload();
    });
}

quizTest.init = function () {
    quizTest.bindModal();
    var diseaseId = $.getUrlLastParam();
    var req = {
        diseaseId:diseaseId
    };
    comm.utils.postForm("/quiz/detail",req,quizTest.initQuizList);
};