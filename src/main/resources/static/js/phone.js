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

    checkForm();

}
function checkForm(){
    // var inputs= $("#phoneForm").getElementsByTagName("INPUT");
    // for(var   i=0;   i<inputs .length;   i++)   {
    //     if(inputs[i].value==""||inputs[i].value==null)   {
    //         alert("信息不能为空!");
    //         inputs[i].focus();
    //         return (false);
    //     }
    // }

    phoneForm();
}
function phoneForm(){
    var json = $("#phoneForm").form2json();
    $.post("../phone/addw",$("#phoneForm").serialize(),function(result){
        console.log(result);
    },"application/json","json");
}

function loadList() {

    $.post("../phone/list",function(result){
        console.log(result);
        if (result.code==200){
            list = result.data.list;
            var html = "";
            for(var i in list){
                html+='<div class="item" ><span>'+list[i].phoneName+'</span><span>'+list[i].phoneColor+'</span><span>'+list[i].phoneSize+' GB</span><button onclick="addLog(this)">添加记录</button></div>';
               // alert(list[i])
            }
            $("#list").append(html);
        }else{
            console.log(result.message)
        }
    },"application/json","json");

}
