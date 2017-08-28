$(function () {
   console.log("load JS success")
    $('input').on('focus', function () {
             var target = this;
             // 使用定时器是为了让输入框上滑时更加自然
            setTimeout(function(){
                target.scrollIntoView(true);
                target.scrollIntoViewIfNeeded();
                  },300);
            });
    loadList();
});
function searchEnter(){
    if (event.keyCode==13) {
        var type = $("#input").val();
        console.log(type)
    };

}
function postPhone() {

    var json = $("#phoneForm").form2json();
    $.post("../phone/addw",$("#phoneForm").serialize(),function(result){
        $("span").html(result);
    },"application/json","json");

}

function loadList() {

    $.post("../phone/list",function(result){
        $("span").html(result);
    },"application/json","json");

}
